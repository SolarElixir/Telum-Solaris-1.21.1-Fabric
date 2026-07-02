package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.item.SolarisItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class SolarisEntityLootTableProvider extends SimpleFabricLootTableProvider {
    public SolarisEntityLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup, LootContextTypes.ENTITY);
    }

    public static final RegistryKey<LootTable> MONSTROSITREE_LOOT_TABLE =
            RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of(TelumSolaris.MOD_ID, "monstrositree_loot_table"));

    @Override
    public void accept(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> lootTableBiConsumer) {
        //Generates loot table
        lootTableBiConsumer.accept(MONSTROSITREE_LOOT_TABLE, LootTable.builder()
                //Generates float between 2 and 6, then gets cut off 2.564 -> 2, not 3.
                .pool(LootPool.builder().rolls(UniformLootNumberProvider.create(2, 6))
                        .with(ItemEntry.builder(SolarisItems.WOODLAND_BARK))
                )
                //Constant reverse to how many times this is rolled.
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        //Rolls a chance, 0.25 or 25% chance of getting item
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(SolarisItems.WOODLAND_BOW))
                        .with(ItemEntry.builder(SolarisItems.WOODLAND_LONGSWORD))
                        .with(ItemEntry.builder(SolarisItems.WOODLAND_DAGGER))
                )
                //Constant, always 1.
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(SolarisItems.FOREST_ESSENCE))
                )
        );

    }
}
