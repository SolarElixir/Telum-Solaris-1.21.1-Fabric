package net.solarelixir.solaris;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.component.SoulStoringCodec;
import net.solarelixir.solaris.effects.ModEffects;
import net.solarelixir.solaris.entity.ModEntities;
import net.solarelixir.solaris.entity.custom.TreelingEntity;
import net.solarelixir.solaris.item.ModItemGroups;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.util.ModTags;
import net.solarelixir.solaris.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class TelumSolaris implements ModInitializer {
    public static final String MOD_ID = "solaris";
    public static final Logger LOGGER = LoggerFactory.
            getLogger(MOD_ID.toUpperCase().substring(0, 1).toUpperCase() + MOD_ID.substring(1));

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
        ModDataComponentTypes.registerDataComponentTypes();
        ModEffects.registerEffects();
        ModEntities.registerModEntities();

        ModWorldGeneration.generateModWorldGen();


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
                }
            }
            return ActionResult.PASS;
        });

        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (entity instanceof LivingEntity livingEntity && !world.isClient) {
                if (player.getMainHandStack().getItem() == ModItems.SCARLETT_HAZE) {
                    if (!livingEntity.hasStatusEffect(ModEffects.SCARLETT_HAZE)) {
                        livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE,
                                140, 5));
                    } else {
                        livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE,
                                140, livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE).getAmplifier() + 5));
                    }
                }
            }
            return ActionResult.PASS;
        });

        FabricDefaultAttributeRegistry.register(ModEntities.TREELING, TreelingEntity.createAttributes());
    }
}
