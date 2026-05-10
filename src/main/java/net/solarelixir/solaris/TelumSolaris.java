package net.solarelixir.solaris;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.component.SoulStoringCodec;
import net.solarelixir.solaris.effects.ModEffects;
import net.solarelixir.solaris.item.ModItemGroups;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.util.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TelumSolaris implements ModInitializer {
    public static final String MOD_ID = "solaris";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
        ModDataComponentTypes.registerDataComponentTypes();
        ModEffects.registerEffects();

        ServerLivingEntityEvents.AFTER_DEATH.register((livingEntity, damageSource) -> {
            if (damageSource.getAttacker() instanceof PlayerEntity player) {
                ItemStack stack = player.getMainHandStack();
                if (stack.isIn(ModTags.Items.KILL_COUNTING_ITEMS)) {
                    SoulStoringCodec data = stack.get(ModDataComponentTypes.SOUL_INVENTORY_INFO);
                    SoulStoringCodec updated = (data == null)
                            ? new SoulStoringCodec(true, 1, 10000)
                            : data.addKill();

                    stack.set(ModDataComponentTypes.SOUL_INVENTORY_INFO, updated);
                }
            }
        });

        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (entity instanceof LivingEntity livingEntity && !world.isClient) {
                if (player.getMainHandStack().getItem() == ModItems.SCARLETT_HAZE) {
                    if (livingEntity.hasStatusEffect(ModEffects.SCARLETT_HAZE)) {
                        if (livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE).getAmplifier() < 9) {
                            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE,
                                    140, livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE).getAmplifier() + 1));
                        } else {
                            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE, 140, 9));
                        }
                    } else {
                        livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE, 140, 0));
                    }
                    //TelumSolaris.LOGGER.info(livingEntity.getName() + " has Scarlett haze at level " +
                    //        (livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE).getAmplifier()+1));
                }
            }
            return ActionResult.PASS;
        });
    }
}
