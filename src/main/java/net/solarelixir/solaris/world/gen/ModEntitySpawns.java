package net.solarelixir.solaris.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.solarelixir.solaris.entity.ModEntities;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                SpawnGroup.CREATURE, ModEntities.TREELING, 15, 1, 1);
        SpawnRestriction.register(ModEntities.TREELING, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
                BiomeKeys.FOREST,
                BiomeKeys.FLOWER_FOREST,
                BiomeKeys.MUSHROOM_FIELDS,
                BiomeKeys.DARK_FOREST),
                SpawnGroup.CREATURE, ModEntities.MUSHLING, 15, 1, 1);
        SpawnRestriction.register(ModEntities.MUSHLING, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
