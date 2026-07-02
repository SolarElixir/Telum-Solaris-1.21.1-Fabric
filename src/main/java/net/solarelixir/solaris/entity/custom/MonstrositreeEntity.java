package net.solarelixir.solaris.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.solarelixir.solaris.datagen.SolarisEntityLootTableProvider;
import net.solarelixir.solaris.entity.ai.goal.MonstrositreeAttackGoal;

import java.util.List;

public class MonstrositreeEntity extends HostileEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    public int attackMove;
    public final AnimationState attack_1 = new AnimationState();
    public final AnimationState attack_2 = new AnimationState();
    public final AnimationState attack_3 = new AnimationState();
    private static final int ATTACK_1_LENGTH = 20;
    private static final int ATTACK_2_LENGTH = 20;
    private static final int ATTACK_3_LENGTH = 30;
    public int idleAnimationTimeout = 20;
    public int attackCooldown = 20;
    private int hitFrame;
    private List<PlayerEntity> attackedBy;
    private static int attackingPlayers;

    /**
     * Increases attack damage based on how many players are attacking it.
     */
    public static float attackDamage = 5.0f+ (2.5f * attackingPlayers);

    public MonstrositreeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    private ServerBossBar bossBar(ServerBossBar serverBossBar) {
        return serverBossBar;
    }

    private final ServerBossBar bossBar = new ServerBossBar(Text.translatable("entity.solaris.monstrositree"),
            BossBar.Color.GREEN, BossBar.Style.NOTCHED_10);

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(3, new LookAroundGoal(this));
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(1, new MonstrositreeAttackGoal(this, 1.75));
        this.targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                ///Based on attacking players, adds max health
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 200*(1 + attackingPlayers))
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.15)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.5)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32)
                .add(EntityAttributes.GENERIC_STEP_HEIGHT, 1.5)
                ;
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 2000;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    /**
     *Heals the entity when called
     */
    private void healWhenNewPlayer() {
        this.setHealth(this.getHealth()*(1 + attackingPlayers));
    }

    private void setupAttackAnimations() { //Works
        attackMove = this.random.nextInt(3) + 1;
        switch (attackMove) {
            case (1) -> {
                this.attack_1.start(this.age);
                hitFrame = 14;
                attackCooldown = ATTACK_1_LENGTH + 20;
            }
            case (2) -> {
                this.attack_2.start(this.age);
                hitFrame = 15;
                attackCooldown = ATTACK_2_LENGTH + 20;
            }
            case (3) -> {
                this.attack_3.start(this.age/2);
                hitFrame = 20;
                attackCooldown = ATTACK_3_LENGTH + 20;
            }
        }
    }

    //Written with the help of Vairosh!
    private void performAttackHitbox() {
        List<Entity> nearbyEntities = this.getWorld().getEntitiesByClass(Entity.class, this.getBoundingBox().expand(3.0D),
                entity -> entity != this && entity.isAlive());


        for (Entity target : nearbyEntities) {
            if (target instanceof PlayerEntity) {
                target.damage(this.getDamageSources().mobAttack(this), attackDamage);
            }
        }
    }


    @Override
    protected void tickHandSwing() {
        if (this.handSwinging) {
            if (this.handSwingTicks == 0) {
                this.setupAttackAnimations();
            }
            ++this.handSwingTicks;
            if (this.handSwingTicks == this.hitFrame) {
                performAttackHitbox();
            }
        } else {
            this.handSwingTicks = 0;
            --this.attackCooldown;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
    }

    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    @Override
    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }

    @Override
    protected void mobTick() {
        super.mobTick();
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }

    @Override
    protected boolean shouldAlwaysDropXp() {
        return true;
    }

    @Override
    protected int getXpToDrop() {
        return 500;
    }

    /**
     * Gets the players attacking this entity.
     */
    private void attackerDetails() {
        if (this.getAttacker() instanceof PlayerEntity && !attackedBy.contains(this.getAttacker())) {
            attackedBy.add((PlayerEntity) this.getAttacker());
            healWhenNewPlayer();
        }
        for (PlayerEntity i : attackedBy) {
            ++attackingPlayers;
        }
    }

    @Override
    protected RegistryKey<LootTable> getLootTableId() {
        return SolarisEntityLootTableProvider.MONSTROSITREE_LOOT_TABLE;
    }
}

