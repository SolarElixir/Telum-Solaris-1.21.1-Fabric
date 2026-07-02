package net.solarelixir.solaris.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.solarelixir.solaris.item.SolarisItems;
import org.jetbrains.annotations.Nullable;

public class TreelingEntity extends AnimalEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    public int idleAnimationTimeout = 0;

    public TreelingEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(TreelingEntity.class, TrackedDataHandlerRegistry.INTEGER);


    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TemptGoal(this, 1f, stack -> false, true));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, LivingEntity.class, 4.0F));
        this.goalSelector.add(3, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 8)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.175)
                ;
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
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

    public TreelingVariant getVariant() {
        return TreelingVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(TreelingVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getMainHandStack();
        if (itemStack.isIn(ItemTags.AXES) & !this.getWorld().isClient) {
            if (getTypeVariant() == 0) {
                setVariant(TreelingVariant.byId(1));
                if (!player.isCreative()) {
                    itemStack.damage(1, player, getSlotForHand(hand));
                }
                this.playSound(SoundEvents.ITEM_AXE_STRIP, 1.0f, 1.0f);
                this.dropItem(SolarisItems.WOODLAND_BARK);
            }
            return ActionResult.PASS;
        }
        if (itemStack.isOf(Items.BONE_MEAL) || itemStack.isOf(SolarisItems.WOODLAND_BARK) & !this.getWorld().isClient) {
            if (getTypeVariant() == 1) {
                setVariant(TreelingVariant.byId(0));
                if (!player.isCreative()) {
                    itemStack.decrement(1);
                }
                this.playSound(SoundEvents.ITEM_BONE_MEAL_USE);
            }
            return ActionResult.PASS;
        }
        player.swingHand(hand);
        return super.interactMob(player, hand);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
                                 @Nullable EntityData entityData) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData);
        this.setVariant(TreelingVariant.byId(0));
        return data;
    }
}
