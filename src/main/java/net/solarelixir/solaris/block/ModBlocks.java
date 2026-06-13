package net.solarelixir.solaris.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.solarelixir.solaris.TelumSolaris;

public class ModBlocks {

    //Jade Blocks
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                AbstractBlock.Settings.create().strength(4.5F, 3.0F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3F, 3.0F)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.create().strength(2F, 2.0F)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //Ruby Blocks
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(2f, 2.0f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //Sapphire Blocks
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //Topaz Blocks
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //Onyx Blocks
    public static final Block ONYX_ORE = registerBlock("onyx_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ONYX_ORE = registerBlock("deepslate_onyx_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5f, 3.0f)
                            .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ONYX_BLOCK = registerBlock("onyx_block",
            new Block(AbstractBlock.Settings.create().strength(2, 2)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //Opal Blocks
    public static final Block DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4.5F, 3.0F)
                            .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3F, 3.0F)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_BLOCK = registerBlock("opal_block",
            new Block(AbstractBlock.Settings.create().strength(2F, 2.0F)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    //Steel Blocks
    public static final  Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(2, 2).requiresTool().sounds(BlockSoundGroup.METAL)));

    //Block Register
    private static Block registerBlock(String name, Block block){
    registerBlockItems(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(TelumSolaris.MOD_ID, name), block);
}



public static void registerBlockItems(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(TelumSolaris.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
}

    public static void registerModBlocks(){
        TelumSolaris.LOGGER.info("Registering Mod Blocks for " + TelumSolaris.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries-> {

            entries.add(DEEPSLATE_JADE_ORE);
            entries.add(JADE_ORE);

            entries.add(NETHER_RUBY_ORE);

            entries.add(SAPPHIRE_ORE);
            entries.add(DEEPSLATE_SAPPHIRE_ORE);

            entries.add(TOPAZ_ORE);
            entries.add(DEEPSLATE_TOPAZ_ORE);

            entries.add(ONYX_ORE);
            entries.add(DEEPSLATE_ONYX_ORE);

            entries.add(OPAL_ORE);
            entries.add(DEEPSLATE_OPAL_ORE);
            entries.add(OPAL_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(STEEL_BLOCK);
            entries.add(JADE_BLOCK);
            entries.add(RUBY_BLOCK);
            entries.add(TOPAZ_BLOCK);
            entries.add(ONYX_BLOCK);
            entries.add(SAPPHIRE_BLOCK);
            entries.add(OPAL_BLOCK);
        });
    }
}
