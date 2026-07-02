package net.solarelixir.solaris.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.solarelixir.solaris.world.SolarisPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.JADE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.TOPAZ_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.ONYX_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES,
                SolarisPlacedFeatures.OPAL_ORE_PLACED_KEY);
    }
}
