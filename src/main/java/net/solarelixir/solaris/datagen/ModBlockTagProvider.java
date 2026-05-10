package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
        System.out.println("Starting Mod Block tag provider");
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        System.out.println("Generating Mod Block Tag Provider");
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.GEMSTONE_INFUSER)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                //jade blocks
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.JADE_ORE)

                //Ruby blocks
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)

                //Aquamarine blocks
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)

                //Topaz blocks
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)

                //Onyx blocks
                .add(ModBlocks.ONYX_ORE)
                .add(ModBlocks.DEEPSLATE_ONYX_ORE)
                .add(ModBlocks.ONYX_BLOCK)

                //Steel
                .add(ModBlocks.STEEL_BLOCK)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                //jade blocks
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.JADE_BLOCK)

                //Ruby blocks
                .add(ModBlocks.NETHER_RUBY_ORE)

                //Aquamarine blocks
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)

                //Topaz blocks
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                //Onyx blocks
                .add(ModBlocks.ONYX_ORE)
                .add(ModBlocks.DEEPSLATE_ONYX_ORE)
                .add(ModBlocks.ONYX_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.STEEL_BLOCK)

        ;

    }
}
