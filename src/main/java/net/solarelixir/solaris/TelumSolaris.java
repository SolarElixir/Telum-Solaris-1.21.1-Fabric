package net.solarelixir.solaris;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.ActionResult;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.component.SolarisDataComponentTypes;
import net.solarelixir.solaris.effects.SolarisStatusEffects;
import net.solarelixir.solaris.entity.SolarisEntities;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;
import net.solarelixir.solaris.entity.custom.MushlingEntity;
import net.solarelixir.solaris.entity.custom.TreelingEntity;
import net.solarelixir.solaris.item.SolarisItemGroups;
import net.solarelixir.solaris.item.SolarisItems;
import net.solarelixir.solaris.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TelumSolaris implements ModInitializer {
    public static final String MOD_ID = "solaris";
    public static final Logger LOGGER = LoggerFactory.
            getLogger(MOD_ID.toUpperCase().substring(0, 1).toUpperCase() + MOD_ID.substring(1));

    @Override
    public void onInitialize() {
        SolarisItems.registerModItems();
        ModBlocks.registerModBlocks();
        SolarisItemGroups.registerItemGroups();
        SolarisDataComponentTypes.registerDataComponentTypes();
        SolarisStatusEffects.registerEffects();
        SolarisEntities.registerModEntities();

        ModWorldGeneration.generateModWorldGen();


        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (entity instanceof LivingEntity livingEntity && !world.isClient) {
                if (player.getMainHandStack().getItem() == SolarisItems.SCARLETT_HAZE) {
                    if (!(livingEntity.isBlocking()) && !livingEntity.isInCreativeMode()) {
                        StatusEffectInstance effectInstance = livingEntity.getStatusEffect(SolarisStatusEffects.SCARLETT_HAZE);
                        if (!livingEntity.hasStatusEffect(SolarisStatusEffects.SCARLETT_HAZE)){
                            livingEntity.addStatusEffect(new StatusEffectInstance(SolarisStatusEffects.SCARLETT_HAZE, 140, 0));
                        } else if (effectInstance.getAmplifier() < 9) {
                            livingEntity.addStatusEffect(new StatusEffectInstance(SolarisStatusEffects.SCARLETT_HAZE,
                                    effectInstance.getDuration() + 70,
                                    effectInstance.getAmplifier() + 1));
                        } else {
                            livingEntity.addStatusEffect(new StatusEffectInstance(SolarisStatusEffects.SCARLETT_HAZE, 140, 9));
                        }
                    }}} return ActionResult.PASS; });//<-- To annoy Joe

        FabricDefaultAttributeRegistry.register(SolarisEntities.TREELING, TreelingEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(SolarisEntities.MUSHLING, MushlingEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(SolarisEntities.MONSTROSITREE, MonstrositreeEntity.createAttributes());
    }
}
