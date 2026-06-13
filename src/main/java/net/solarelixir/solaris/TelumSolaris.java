package net.solarelixir.solaris;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.ActionResult;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.effects.ModEffects;
import net.solarelixir.solaris.entity.ModEntities;
import net.solarelixir.solaris.entity.custom.MushlingEntity;
import net.solarelixir.solaris.entity.custom.TreelingEntity;
import net.solarelixir.solaris.item.ModItemGroups;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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


        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (entity instanceof LivingEntity livingEntity && !world.isClient) {
                if (player.getMainHandStack().getItem() == ModItems.SCARLETT_HAZE) {
                    if (!(livingEntity.isBlocking()) && !livingEntity.isInCreativeMode()) {
                        StatusEffectInstance effectInstance = livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE);
                        if (!livingEntity.hasStatusEffect(ModEffects.SCARLETT_HAZE)){
                            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE, 140, 0));
                        } else if (effectInstance.getAmplifier() < 9) {
                            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE,
                                    effectInstance.getDuration() + 70,
                                    effectInstance.getAmplifier() + 1));
                        } else {
                            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.SCARLETT_HAZE, 140, 9));
                        }
                        StatusEffectInstance updated = livingEntity.getStatusEffect(ModEffects.SCARLETT_HAZE);
                        /*TelumSolaris.LOGGER.info("Scarlett haze level: " + (updated.getAmplifier()+1) + " for "
                                + (updated.getDuration()/20) + " seconds");*/
                    }}} //<-- To annoy Joe
            return ActionResult.PASS;
        });

        FabricDefaultAttributeRegistry.register(ModEntities.TREELING, TreelingEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.MUSHLING, MushlingEntity.createAttributes());
    }
}
