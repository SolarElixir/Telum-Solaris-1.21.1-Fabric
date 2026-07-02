package net.solarelixir.solaris.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.solarelixir.solaris.entity.SolarisEntities;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                SpawnGroup.CREATURE, SolarisEntities.TREELING, 15, 1, 1);
        SpawnRestriction.register(SolarisEntities.TREELING, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
                BiomeKeys.FOREST,
                BiomeKeys.FLOWER_FOREST,
                BiomeKeys.MUSHROOM_FIELDS,
                BiomeKeys.DARK_FOREST),
                SpawnGroup.CREATURE, SolarisEntities.MUSHLING, 15, 1, 1);
        SpawnRestriction.register(SolarisEntities.MUSHLING, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
