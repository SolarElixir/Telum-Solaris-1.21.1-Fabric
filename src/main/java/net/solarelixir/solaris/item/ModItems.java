package net.solarelixir.solaris.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.ModEntities;
import net.solarelixir.solaris.item.custom.*;

import java.util.List;

public class ModItems {

    private static final float fastAttackSpeed = -2f;
    private static final float mediumAttackSpeed = -2.4f;
    private static final float slowAttackSpeed = -2.8f;
    private static final float verySlowAttackSpeed = -3.2f;

    private static final int daggerDamage = 2;
    private static final int swordDamage = 3;
    private static final int katanaDamage = 4;
    private static final int bigSwordDamage = 5;
    private static final int halberdDamage = 6;
    private static final int scytheDamage = 7;

    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, daggerDamage, fastAttackSpeed))));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, katanaDamage, mediumAttackSpeed))));
    public static final Item DIAMOND_LONGSWORD = registerItem("diamond_longsword", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, bigSwordDamage, slowAttackSpeed))));
    public static final Item DIAMOND_HALBERD = registerItem("diamond_halberd", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, halberdDamage, verySlowAttackSpeed))));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, scytheDamage, verySlowAttackSpeed))));

    public static final Item IRON_DAGGER = registerItem("iron_dagger", new SwordItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, daggerDamage, fastAttackSpeed))));
    public static final Item IRON_KATANA = registerItem("iron_katana", new SwordItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, katanaDamage, mediumAttackSpeed))));
    public static final Item IRON_LONGSWORD = registerItem("iron_longsword", new SwordItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, bigSwordDamage, slowAttackSpeed))));
    public static final Item IRON_HALBERD = registerItem("iron_halberd", new SwordItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, halberdDamage, verySlowAttackSpeed))));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe", new SwordItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, scytheDamage, verySlowAttackSpeed))));

    //Bows
    public static final Item LONGBOW = registerItem("longbow", new BowItem(new Item.Settings()
            .maxDamage(500)));
    public static final Item WOODLAND_BOW = registerItem("woodland_bow", new BowItem(new Item.Settings()
            .maxDamage(500)));

    //Ruby
        public static final Item IMPURE_RUBY_CHUNK = registerItem("impure_ruby_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_RUBY = registerItem("refined_ruby", new Item(new Item.Settings()));
        public static final Item FLAWLESS_RUBY = registerItem("flawless_ruby", new Item(new Item.Settings()));
        public static final Item RUBY_TOKEN = registerItem("ruby_token", new Item(new Item.Settings()));
        public static final Item RUBY_DAGGER = registerItem("ruby_dagger", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, daggerDamage, fastAttackSpeed))));
        public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, swordDamage, mediumAttackSpeed))));
        public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, katanaDamage, mediumAttackSpeed))));
        public static final Item RUBY_LONGSWORD = registerItem("ruby_longsword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, bigSwordDamage, slowAttackSpeed))));
        public static final Item RUBY_HALBERD = registerItem("ruby_halberd", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, halberdDamage, verySlowAttackSpeed))));
        public static final Item RUBY_SCYTHE = registerItem("ruby_scythe", new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, scytheDamage, verySlowAttackSpeed))));
        public static final Item RUBY_SHIELD = registerItem("ruby_shield", new ShieldItem(new Item.Settings().maxDamage(2560)));

        public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ModArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
            {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
            {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

    //Sapphire
        public static final Item IMPURE_SAPPHIRE_CHUNK = registerItem("impure_sapphire_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_SAPPHIRE = registerItem("refined_sapphire", new Item(new Item.Settings()));
        public static final Item FLAWLESS_SAPPHIRE = registerItem("flawless_sapphire", new Item(new Item.Settings()));
        public static final Item SAPPHIRE_TOKEN = registerItem("sapphire_token", new Item(new Item.Settings()));
        public static final Item SAPPHIRE_DAGGER = registerItem("sapphire_dagger", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, daggerDamage, fastAttackSpeed))));
        public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, swordDamage, mediumAttackSpeed))));
        public static final Item SAPPHIRE_LONGSWORD = registerItem("sapphire_longsword", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, bigSwordDamage, slowAttackSpeed))));
        public static final Item SAPPHIRE_KATANA = registerItem("sapphire_katana", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, katanaDamage, mediumAttackSpeed))));
        public static final Item SAPPHIRE_HALBERD = registerItem("sapphire_halberd", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, halberdDamage, verySlowAttackSpeed))));
        public static final Item SAPPHIRE_SCYTHE = registerItem("sapphire_scythe", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, scytheDamage, verySlowAttackSpeed))));
        public static final Item SAPPHIRE_SHIELD = registerItem("sapphire_shield", new ShieldItem(new Item.Settings().maxDamage(2512)));

    //Topaz
        public static final Item IMPURE_TOPAZ_CHUNK = registerItem("impure_topaz_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_TOPAZ = registerItem("refined_topaz", new Item(new Item.Settings()));
        public static final Item FLAWLESS_TOPAZ = registerItem("flawless_topaz", new Item(new Item.Settings()));
        public static final Item TOPAZ_TOKEN = registerItem("topaz_token", new Item(new Item.Settings()));
        public static final Item TOPAZ_DAGGER = registerItem("topaz_dagger", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, daggerDamage, fastAttackSpeed))));
        public static final Item TOPAZ_SWORD = registerItem("topaz_sword", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, swordDamage, mediumAttackSpeed))));
        public static final Item TOPAZ_KATANA = registerItem("topaz_katana", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, katanaDamage, mediumAttackSpeed))));
        public static final Item TOPAZ_GREATSWORD = registerItem("topaz_greatsword", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item TOPAZ_HALBERD = registerItem("topaz_halberd", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, halberdDamage, verySlowAttackSpeed))));
        public static final Item TOPAZ_SCYTHE = registerItem("topaz_scythe", new SwordItem(ModToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, scytheDamage, verySlowAttackSpeed))));


    //Onyx
        public static final Item IMPURE_ONYX_CHUNK = registerItem("impure_onyx_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_ONYX = registerItem("refined_onyx", new Item(new Item.Settings()));
        public static final Item FLAWLESS_ONYX = registerItem("flawless_onyx", new Item(new Item.Settings()));
        public static final Item ONYX_TOKEN = registerItem("onyx_token", new Item(new Item.Settings()));
        public static final Item ONYX_DAGGER = registerItem("onyx_dagger", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, daggerDamage, fastAttackSpeed))));
        public static final Item ONYX_SWORD =registerItem("onyx_sword", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, swordDamage, mediumAttackSpeed))));
        public static final Item ONYX_KATANA = registerItem("onyx_katana", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, katanaDamage, mediumAttackSpeed))));
        public static final Item ONYX_GREATSWORD = registerItem("onyx_greatsword", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, bigSwordDamage, slowAttackSpeed))));
        public static final Item ONYX_HALBERD = registerItem("onyx_halberd", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, halberdDamage, verySlowAttackSpeed))));
        public static final Item ONYX_SCYTHE = registerItem("onyx_scythe", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));

        public static final Item ONYX_HOOD = registerItem("onyx_hood", new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
        public static final Item ONYX_ROBES = registerItem("onyx_robes", new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
        public static final Item ONYX_LEGGINGS = registerItem("onyx_leggings", new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
        public static final Item ONYX_BOOTS = registerItem("onyx_boots", new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));

    //Opal
        public static final Item IMPURE_OPAL_CHUNK = registerItem("impure_opal_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_OPAL = registerItem("refined_opal", new Item(new Item.Settings()));
        public static final Item FLAWLESS_OPAL = registerItem("flawless_opal", new Item(new Item.Settings()));
        public static final Item OPAL_TOKEN = registerItem("opal_token", new Item(new Item.Settings()));

        public static final Item OPAL_DAGGER = registerItem("opal_dagger", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, daggerDamage, fastAttackSpeed))));
        public static final Item OPAL_LONGSWORD = registerItem("opal_longsword", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item OPAL_SWORD = registerItem("opal_sword", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, swordDamage, mediumAttackSpeed))));
        public static final Item OPAL_KATANA = registerItem("opal_katana", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, katanaDamage, mediumAttackSpeed))));
        public static final Item OPAL_HALBERD = registerItem("opal_halberd", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, halberdDamage, verySlowAttackSpeed))));
        public static final Item OPAL_SCYTHE = registerItem("opal_scythe", new SwordItem(ModToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OPAL, scytheDamage, verySlowAttackSpeed))));

    //Jade
        public static final Item IMPURE_JADE_CHUNK = registerItem("impure_jade_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_JADE = registerItem("refined_jade", new Item(new Item.Settings()));
        public static final Item FLAWLESS_JADE = registerItem("flawless_jade", new Item(new Item.Settings()));
        public static final Item JADE_TOKEN = registerItem("jade_token", new Item(new Item.Settings()));
        public static final Item JADE_CHISEL = registerItem("jade_chisel", new JadeChisel(new Item.Settings().maxCount(1).maxDamage(1024)));

        public static final Item JADE_DAGGER = registerItem("jade_dagger", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, daggerDamage, fastAttackSpeed))));
        public static final Item JADE_GREATSWORD = registerItem("jade_greatsword", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item JADE_SHIELD = registerItem("jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2512)));
        public static final Item ENERGIZED_JADE_SHIELD = registerItem("energized_jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2512)));
        public static final Item JADE_SWORD = registerItem("jade_sword", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, swordDamage, mediumAttackSpeed))));
        public static final Item JADE_KATANA = registerItem("jade_katana", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, katanaDamage, mediumAttackSpeed))));
        public static final Item JADE_HALBERD = registerItem("jade_halberd", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, halberdDamage, verySlowAttackSpeed))));
        public static final Item JADE_SCYTHE = registerItem("jade_scythe", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, scytheDamage, verySlowAttackSpeed))));

        public static final Item JADE_HELMET = registerItem("jade_helmet", new ModArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_LEGGINGS = registerItem("jade_leggings", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_BOOTS = registerItem("jade_boots", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

    public static final Item ENERGIZED_JADE_SWORD = registerItem("energized_jade_sword", new SwordItem(ModToolMaterials.ENERGIZED_JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ENERGIZED_JADE, swordDamage, mediumAttackSpeed))));

        public static final Item ENERGIZED_JADE_HELMET = registerItem("energized_jade_helmet", new ModArmorItem(ModArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item ENERGIZED_JADE_CHESTPLATE = registerItem("energized_jade_chestplate", new ArmorItem(ModArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item ENERGIZED_JADE_LEGGINGS = registerItem("energized_jade_leggings", new ArmorItem(ModArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});
        public static final Item ENERGIZED_JADE_BOOTS = registerItem("energized_jade_boots", new ArmorItem(ModArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item BROKEN_SPEAR = registerItem("broken_spear", new Item(new Item.Settings()));

        public static final Item DUSTWORM_LONGBOW = registerItem("dustworm_longbow", new BowItem(new Item.Settings().maxDamage(500)));
        public static final Item REINFORCED_BOTTLE = registerItem("reinforced_bottle", new Item(new Item.Settings().maxCount(64)));
        public static final Item THUNDER_BOTTLE = registerItem("thunder_bottle", new Item(new Item.Settings().maxCount(16)));
        public static final Item STORM_DAGGER = registerItem("storm_dagger", new TridentItem(new Item.Settings().maxDamage(500).maxCount(1)));
        public static final Item SPIRITUS_CONDUIT = registerItem("spiritus_conduit", new Item(new Item.Settings()));
        public static final Item BLACKWIND_SPEAR = registerItem("blackwind", new Blackwind(new Item.Settings().maxCount(1).maxDamage(1024)));
        public static final Item SILVER_ONI_MASK = registerItem("silver_oni_mask", new Item(new Item.Settings()));

    //Steel
        public static final Item STEEL = registerItem("steel", new Item(new Item.Settings()));
        public static final Item STEEL_DAGGER = registerItem("steel_dagger", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, daggerDamage, fastAttackSpeed))));
        public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, swordDamage, mediumAttackSpeed))));
        public static final Item STEEL_KATANA = registerItem("steel_katana", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, katanaDamage, mediumAttackSpeed))));
        public static final Item STEEL_LONGSWORD = registerItem("steel_longsword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, bigSwordDamage, slowAttackSpeed))));
        public static final Item STEEL_HALBERD = registerItem("steel_halberd", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, halberdDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SCYTHE = registerItem("steel_scythe", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, scytheDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SHIELD = registerItem("steel_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(1024)));

        public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
        public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
        public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
        public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));
        // ~

        public static final Item AMETHYST_HALBERD = registerItem("amethyst_halberd", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));


        public static final Item SCARLETT = registerItem("scarlett", new Item(new Item.Settings()));
        public static final Item SCARLETT_HAZE = registerItem("scarlett_haze", new ScarlettHaze(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, swordDamage, mediumAttackSpeed))));

        public static final Item ASTRAL_FORCE = registerItem("astral_force", new SwordItem(ModToolMaterials.RELIC, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RELIC, swordDamage, mediumAttackSpeed))));

        public static final Item WOODLAND_BARK = registerItem("woodland_bark", new Item(new Item.Settings()));
        public static final Item TREELING_SPAWN_EGG = registerItem("treeling_spawn_egg",
                new SpawnEggItem(ModEntities.TREELING, 0x663C1E, 0xE0C172, new Item.Settings()));

        public static final Item MUSHLING_SPAWN_EGG = registerItem("mushling_spawn_egg",
                new SpawnEggItem(ModEntities.MUSHLING, 0xB82B12, 0xE8CBA9, new Item.Settings()));

        /*public static final Item MUSH_HELM = registerItem("mush_helm", new ArmorItem(ModArmorMaterials.MUSH_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(3))));*/

        public static final Item JOE_JOE_FRUIT = registerItem("joe_joe_fruit", new Item(new Item.Settings().food(ModFoodComponents.JOE_JOE_FRUIT)));


    //register
private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(TelumSolaris.MOD_ID, name), item);
}

    public static void registerModItems () {
    TelumSolaris.LOGGER.info("Registering Mod Items for " + TelumSolaris.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

            //JADE
            entries.add(IMPURE_JADE_CHUNK);
            entries.add(REFINED_JADE);
            entries.add(FLAWLESS_JADE);
            entries.add(JADE_TOKEN);

            //RUBY
            entries.add(IMPURE_RUBY_CHUNK);
            entries.add(REFINED_RUBY);
            entries.add(FLAWLESS_RUBY);
            entries.add(RUBY_TOKEN);

            //SAPPHIRE
            entries.add(IMPURE_SAPPHIRE_CHUNK);
            entries.add(REFINED_SAPPHIRE);
            entries.add(FLAWLESS_SAPPHIRE);
            entries.add(SAPPHIRE_TOKEN);

            //TOPAZ
            entries.add(IMPURE_TOPAZ_CHUNK);
            entries.add(REFINED_TOPAZ);
            entries.add(FLAWLESS_TOPAZ);

            //ONYX
            entries.add(IMPURE_ONYX_CHUNK);
            entries.add(REFINED_ONYX);
            entries.add(FLAWLESS_ONYX);
            entries.add(ONYX_TOKEN);

            //OPAL
            entries.add(IMPURE_OPAL_CHUNK);
            entries.add(REFINED_OPAL);
            entries.add(FLAWLESS_OPAL);
            entries.add(OPAL_TOKEN);

            entries.add(REINFORCED_BOTTLE);
            entries.add(THUNDER_BOTTLE);

            entries.add(SPIRITUS_CONDUIT);

            //STEEL
            entries.add(STEEL);

            entries.add(SCARLETT);
            entries.add(WOODLAND_BARK);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {

            //IRON
            entries.add(IRON_DAGGER);
            entries.add(IRON_KATANA);
            entries.add(IRON_LONGSWORD);
            entries.add(IRON_HALBERD);
            entries.add(IRON_SCYTHE);

            //DIAMOND
            entries.add(DIAMOND_DAGGER);
            entries.add(DIAMOND_KATANA);
            entries.add(DIAMOND_LONGSWORD);
            entries.add(DIAMOND_HALBERD);
            entries.add(DIAMOND_SCYTHE);

            //JADE
            entries.add(JADE_HELMET);
            entries.add(JADE_CHESTPLATE);
            entries.add(JADE_LEGGINGS);
            entries.add(JADE_BOOTS);

            entries.add(ENERGIZED_JADE_HELMET);
            entries.add(ENERGIZED_JADE_CHESTPLATE);
            entries.add(ENERGIZED_JADE_LEGGINGS);
            entries.add(ENERGIZED_JADE_BOOTS);

            entries.add(JADE_DAGGER);
            entries.add(JADE_SWORD);
            entries.add(JADE_KATANA);
            entries.add(JADE_GREATSWORD);
            entries.add(JADE_HALBERD);
            entries.add(JADE_SCYTHE);
            entries.add(JADE_SHIELD);

            entries.add(ENERGIZED_JADE_SWORD);

            //RUBY
            entries.add(RUBY_DAGGER);
            entries.add(RUBY_SWORD);
            entries.add(RUBY_KATANA);
            entries.add(RUBY_LONGSWORD);
            entries.add(RUBY_HALBERD);
            entries.add(RUBY_SCYTHE);
            entries.add(RUBY_SHIELD);

            //TOPAZ
            entries.add(TOPAZ_DAGGER);
            entries.add(TOPAZ_SWORD);
            entries.add(TOPAZ_KATANA);
            entries.add(TOPAZ_GREATSWORD);
            entries.add(TOPAZ_HALBERD);
            entries.add(TOPAZ_SCYTHE);

            //SAPPHIRE
            entries.add(SAPPHIRE_DAGGER);
            entries.add(SAPPHIRE_SWORD);
            entries.add(SAPPHIRE_KATANA);
            entries.add(SAPPHIRE_LONGSWORD);
            entries.add(SAPPHIRE_HALBERD);
            entries.add(SAPPHIRE_SCYTHE);

            //ONYX
            entries.add(ONYX_HOOD);
            entries.add(ONYX_ROBES);
            entries.add(ONYX_LEGGINGS);
            entries.add(ONYX_BOOTS);

            entries.add(ONYX_DAGGER);
            entries.add(ONYX_SWORD);
            entries.add(ONYX_KATANA);
            entries.add(ONYX_GREATSWORD);
            entries.add(ONYX_HALBERD);
            entries.add(ONYX_SCYTHE);

            //OPAL
            entries.add(OPAL_DAGGER);
            entries.add(OPAL_SWORD);
            entries.add(OPAL_KATANA);
            entries.add(OPAL_LONGSWORD);
            entries.add(OPAL_HALBERD);
            entries.add(OPAL_SCYTHE);

            //STEEL
            entries.add(STEEL_HELMET);
            entries.add(STEEL_CHESTPLATE);
            entries.add(STEEL_LEGGINGS);
            entries.add(STEEL_BOOTS);

            entries.add(STEEL_DAGGER);
            entries.add(STEEL_SWORD);
            entries.add(STEEL_KATANA);
            entries.add(STEEL_LONGSWORD);
            entries.add(STEEL_HALBERD);
            entries.add(STEEL_SCYTHE);
            entries.add(STEEL_SHIELD);

            entries.add(DUSTWORM_LONGBOW);
            entries.add(WOODLAND_BOW);
            entries.add(LONGBOW);

            entries.add(BLACKWIND_SPEAR);
            entries.add(SILVER_ONI_MASK);

            entries.add(STORM_DAGGER);


            entries.add(SCARLETT_HAZE);
            entries.add(AMETHYST_HALBERD);
            entries.add(ASTRAL_FORCE);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(JADE_CHISEL);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(TREELING_SPAWN_EGG);
            entries.add(MUSHLING_SPAWN_EGG);
        });
    }
}