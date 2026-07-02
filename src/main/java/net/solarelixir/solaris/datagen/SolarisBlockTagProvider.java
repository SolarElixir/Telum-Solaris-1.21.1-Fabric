package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.solarelixir.solaris.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class SolarisBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public SolarisBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
        System.out.println("Starting Mod Block tag provider");
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        System.out.println("Generating Mod Block Tag Provider");
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.ONYX_BLOCK)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.OPAL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                //jade blocks
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.JADE_ORE)

                //Ruby blocks
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)

                //Sapphire blocks
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)

                //Topaz blocks
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)

                //Onyx blocks
                .add(ModBlocks.ONYX_ORE)
                .add(ModBlocks.DEEPSLATE_ONYX_ORE)
                .add(ModBlocks.ONYX_BLOCK)

                //Opal blocks
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE)
                .add(ModBlocks.OPAL_BLOCK)

                //Steel
                .add(ModBlocks.STEEL_BLOCK)

        ;

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                //jade blocks
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.JADE_BLOCK)

                //Ruby blocks
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)

                //Sapphire blocks
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)

                //Topaz blocks
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                //Onyx blocks
                .add(ModBlocks.ONYX_ORE)
                .add(ModBlocks.DEEPSLATE_ONYX_ORE)
                .add(ModBlocks.ONYX_BLOCK)

                //Opal Blocks
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.STEEL_BLOCK)

        ;
    }
}
