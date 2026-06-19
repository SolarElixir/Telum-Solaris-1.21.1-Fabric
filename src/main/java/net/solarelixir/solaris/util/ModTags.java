package net.solarelixir.solaris.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOLS = createTag("incorrect_for_netherite_tools");

        public static final TagKey<Block> NEEDS_STEEL_TOOL = BlockTags.NEEDS_IRON_TOOL;
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = BlockTags.INCORRECT_FOR_IRON_TOOL;

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TelumSolaris.MOD_ID, name));
        }

    }
    public static class Items{

        public static final TagKey<Item> IS_STEEL_WEAPON = createTag("is_steel_weapon");
        public static final TagKey<Item> IS_JADE_WEAPON = createTag("is_jade_weapon");
        public static final TagKey<Item> IS_ONYX_WEAPON = createTag("is_onyx_weapon");
        public static final TagKey<Item> IS_RUBY_WEAPON = createTag("is_ruby_weapon");
        public static final TagKey<Item> IS_SAPPHIRE_WEAPON = createTag("is_sapphire_weapon");
        public static final TagKey<Item> IS_OPAL_WEAPON = createTag("is_opal_weapon");
        public static final TagKey<Item> IS_TOPAZ_WEAPON = createTag("is_topaz_weapon");
        public static final TagKey<Item> IS_IRON_WEAPON = createTag("is_iron_weapon");
        public static final TagKey<Item> IS_DIAMOND_WEAPON = createTag("is_diamond_weapon");
        public static final TagKey<Item> IS_SHIELD = createTag("is_shield");
        public static final TagKey<Item> IS_BOW_ITEM = createTag("is_bow_item");
        public static final TagKey<Item> TWO_HANDED = createTag("two_handed");
        public static final TagKey<Item> HAS_ICON = createTag("has_icon");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TelumSolaris.MOD_ID, name));
        }

    }
}
