package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
        System.out.println("Starting Mod Loot Table Provider");

    }

    @Override
    public void generate() {
        System.out.println("Generating Mod Block tag provider");
        //Blocks
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.ONYX_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.TOPAZ_BLOCK);

        addDrop(ModBlocks.JADE_ORE, multipleOreDrops(ModBlocks.JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));
        addDrop(ModBlocks.DEEPSLATE_JADE_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));

        addDrop(ModBlocks.ONYX_ORE, multipleOreDrops(ModBlocks.JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));
        addDrop(ModBlocks.DEEPSLATE_ONYX_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));

        addDrop(ModBlocks.TOPAZ_ORE, multipleOreDrops(ModBlocks.JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.IMPURE_JADE_CHUNK, 1, 2));

        addDrop(ModBlocks.NETHER_RUBY_ORE, multipleOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.IMPURE_RUBY_CHUNK, 1, 2));

    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
