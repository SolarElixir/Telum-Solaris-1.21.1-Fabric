package net.solarelixir.solaris;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.solarelixir.solaris.datagen.*;
import net.solarelixir.solaris.world.SolarisConfiguredFeatures;
import net.solarelixir.solaris.world.SolarisPlacedFeatures;

public class TelumSolarisDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(SolarisBlockTagProvider::new);
        pack.addProvider(SolarisItemTagProvider::new);
        pack.addProvider(SolarisBlocksLootTableProvider::new);
        pack.addProvider(SolarisModelProvider::new);
        pack.addProvider(SolarisRecipeProvider::new);
        pack.addProvider(SolarisRegistryDataGenerator::new);
        pack.addProvider(SolarisEntityLootTableProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, SolarisConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, SolarisPlacedFeatures::bootstrap);
    }
}
