package net.solarelixir.solaris.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.solarelixir.solaris.entity.ai.goal.MonstrositreeAttackGoal;
import org.jetbrains.annotations.Nullable;

public class MonstrositreeEntity extends AnimalEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    public int idleAnimationTimeout = 20;

    public MonstrositreeEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private ServerBossBar bossBar(ServerBossBar serverBossBar) {
        return serverBossBar;
    }

    private final ServerBossBar bossBar = new ServerBossBar(Text.translatable("entity.solaris.monstrositree"),
            BossBar.Color.GREEN, BossBar.Style.NOTCHED_10);

    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(MonstrositreeEntity.class, TrackedDataHandlerRegistry.INTEGER);

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new MonstrositreeAttackGoal(this, 0.2D, false));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, LivingEntity.class, 4.0F));
        this.goalSelector.add(3, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.15)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0f)
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

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(DATA_ID_TYPE_VARIANT, 0);
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
        this.bossBar.setPercent(this.getHealth()/this.getMaxHealth());
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }
}
