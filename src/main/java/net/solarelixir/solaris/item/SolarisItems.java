package net.solarelixir.solaris.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.SolarisEntities;
import net.solarelixir.solaris.item.custom.*;

import java.util.List;

public class SolarisItems {

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
        public static final Item RUBY_DAGGER = registerItem("ruby_dagger", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, daggerDamage, fastAttackSpeed))));
        public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, swordDamage, mediumAttackSpeed))));
        public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, katanaDamage, mediumAttackSpeed))));
        public static final Item RUBY_LONGSWORD = registerItem("ruby_longsword", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, bigSwordDamage, slowAttackSpeed))));
        public static final Item RUBY_HALBERD = registerItem("ruby_halberd", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, halberdDamage, verySlowAttackSpeed))));
        public static final Item RUBY_SCYTHE = registerItem("ruby_scythe", new SwordItem(SolarisToolMaterials.RUBY, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RUBY, scytheDamage, verySlowAttackSpeed))));
        public static final Item RUBY_SHIELD = registerItem("ruby_shield", new ShieldItem(new Item.Settings().maxDamage(2560)));

        public static final Item RUBY_HELMET = registerItem("ruby_helmet", new SolarisArmorItem(SolarisArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
            {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(SolarisArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
            {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(SolarisArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.spacer"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor0"));
                tooltip.add(Text.translatable("tooltip.solaris.ruby_armor1"));
                super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(SolarisArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
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
        public static final Item SAPPHIRE_DAGGER = registerItem("sapphire_dagger", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, daggerDamage, fastAttackSpeed))));
        public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, swordDamage, mediumAttackSpeed))));
        public static final Item SAPPHIRE_LONGSWORD = registerItem("sapphire_longsword", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, bigSwordDamage, slowAttackSpeed))));
        public static final Item SAPPHIRE_KATANA = registerItem("sapphire_katana", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, katanaDamage, mediumAttackSpeed))));
        public static final Item SAPPHIRE_HALBERD = registerItem("sapphire_halberd", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, halberdDamage, verySlowAttackSpeed))));
        public static final Item SAPPHIRE_SCYTHE = registerItem("sapphire_scythe", new SwordItem(SolarisToolMaterials.SAPPHIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.SAPPHIRE, scytheDamage, verySlowAttackSpeed))));
        public static final Item SAPPHIRE_SHIELD = registerItem("sapphire_shield", new ShieldItem(new Item.Settings().maxDamage(2512)));

    //Topaz
        public static final Item IMPURE_TOPAZ_CHUNK = registerItem("impure_topaz_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_TOPAZ = registerItem("refined_topaz", new Item(new Item.Settings()));
        public static final Item FLAWLESS_TOPAZ = registerItem("flawless_topaz", new Item(new Item.Settings()));
        public static final Item TOPAZ_TOKEN = registerItem("topaz_token", new Item(new Item.Settings()));
        public static final Item TOPAZ_DAGGER = registerItem("topaz_dagger", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, daggerDamage, fastAttackSpeed))));
        public static final Item TOPAZ_SWORD = registerItem("topaz_sword", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, swordDamage, mediumAttackSpeed))));
        public static final Item TOPAZ_KATANA = registerItem("topaz_katana", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, katanaDamage, mediumAttackSpeed))));
        public static final Item TOPAZ_GREATSWORD = registerItem("topaz_greatsword", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item TOPAZ_HALBERD = registerItem("topaz_halberd", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, halberdDamage, verySlowAttackSpeed))));
        public static final Item TOPAZ_SCYTHE = registerItem("topaz_scythe", new SwordItem(SolarisToolMaterials.TOPAZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.TOPAZ, scytheDamage, verySlowAttackSpeed))));


    //Onyx
        public static final Item IMPURE_ONYX_CHUNK = registerItem("impure_onyx_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_ONYX = registerItem("refined_onyx", new Item(new Item.Settings()));
        public static final Item FLAWLESS_ONYX = registerItem("flawless_onyx", new Item(new Item.Settings()));
        public static final Item ONYX_TOKEN = registerItem("onyx_token", new Item(new Item.Settings()));
        public static final Item ONYX_DAGGER = registerItem("onyx_dagger", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, daggerDamage, fastAttackSpeed))));
        public static final Item ONYX_SWORD =registerItem("onyx_sword", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, swordDamage, mediumAttackSpeed))));
        public static final Item ONYX_KATANA = registerItem("onyx_katana", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, katanaDamage, mediumAttackSpeed))));
        public static final Item ONYX_GREATSWORD = registerItem("onyx_greatsword", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, bigSwordDamage, slowAttackSpeed))));
        public static final Item ONYX_HALBERD = registerItem("onyx_halberd", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, halberdDamage, verySlowAttackSpeed))));
        public static final Item ONYX_SCYTHE = registerItem("onyx_scythe", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));

        public static final Item ONYX_HOOD = registerItem("onyx_hood", new ArmorItem(SolarisArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
        public static final Item ONYX_ROBES = registerItem("onyx_robes", new ArmorItem(SolarisArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
        public static final Item ONYX_LEGGINGS = registerItem("onyx_leggings", new ArmorItem(SolarisArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
        public static final Item ONYX_BOOTS = registerItem("onyx_boots", new ArmorItem(SolarisArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));

    //Opal
        public static final Item IMPURE_OPAL_CHUNK = registerItem("impure_opal_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_OPAL = registerItem("refined_opal", new Item(new Item.Settings()));
        public static final Item FLAWLESS_OPAL = registerItem("flawless_opal", new Item(new Item.Settings()));
        public static final Item OPAL_TOKEN = registerItem("opal_token", new Item(new Item.Settings()));

        public static final Item OPAL_DAGGER = registerItem("opal_dagger", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, daggerDamage, fastAttackSpeed))));
        public static final Item OPAL_LONGSWORD = registerItem("opal_longsword", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item OPAL_SWORD = registerItem("opal_sword", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, swordDamage, mediumAttackSpeed))));
        public static final Item OPAL_KATANA = registerItem("opal_katana", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, katanaDamage, mediumAttackSpeed))));
        public static final Item OPAL_HALBERD = registerItem("opal_halberd", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, halberdDamage, verySlowAttackSpeed))));
        public static final Item OPAL_SCYTHE = registerItem("opal_scythe", new SwordItem(SolarisToolMaterials.OPAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.OPAL, scytheDamage, verySlowAttackSpeed))));

    //Jade
        public static final Item IMPURE_JADE_CHUNK = registerItem("impure_jade_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_JADE = registerItem("refined_jade", new Item(new Item.Settings()));
        public static final Item FLAWLESS_JADE = registerItem("flawless_jade", new Item(new Item.Settings()));
        public static final Item JADE_TOKEN = registerItem("jade_token", new Item(new Item.Settings()));
        public static final Item JADE_CHISEL = registerItem("jade_chisel", new JadeChisel(new Item.Settings().maxCount(1).maxDamage(1024)));

        public static final Item JADE_DAGGER = registerItem("jade_dagger", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, daggerDamage, fastAttackSpeed))));
        public static final Item JADE_GREATSWORD = registerItem("jade_greatsword", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item JADE_SHIELD = registerItem("jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2512)));
        public static final Item ENERGIZED_JADE_SHIELD = registerItem("energized_jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2512)));
        public static final Item JADE_SWORD = registerItem("jade_sword", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, swordDamage, mediumAttackSpeed))));
        public static final Item JADE_KATANA = registerItem("jade_katana", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, katanaDamage, mediumAttackSpeed))));
        public static final Item JADE_HALBERD = registerItem("jade_halberd", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, halberdDamage, verySlowAttackSpeed))));
        public static final Item JADE_SCYTHE = registerItem("jade_scythe", new SwordItem(SolarisToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.JADE, scytheDamage, verySlowAttackSpeed))));

        public static final Item JADE_HELMET = registerItem("jade_helmet", new SolarisArmorItem(SolarisArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate", new ArmorItem(SolarisArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_LEGGINGS = registerItem("jade_leggings", new ArmorItem(SolarisArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item JADE_BOOTS = registerItem("jade_boots", new ArmorItem(SolarisArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

    public static final Item ENERGIZED_JADE_SWORD = registerItem("energized_jade_sword", new SwordItem(SolarisToolMaterials.ENERGIZED_JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ENERGIZED_JADE, swordDamage, mediumAttackSpeed))));

        public static final Item ENERGIZED_JADE_HELMET = registerItem("energized_jade_helmet", new SolarisArmorItem(SolarisArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)))
        {@Override
            public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item ENERGIZED_JADE_CHESTPLATE = registerItem("energized_jade_chestplate", new ArmorItem(SolarisArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});

        public static final Item ENERGIZED_JADE_LEGGINGS = registerItem("energized_jade_leggings", new ArmorItem(SolarisArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)))
        {@Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor0"));
            tooltip.add(Text.translatable("tooltip.solaris.jade_armor1"));
            tooltip.add(Text.translatable("tooltip.solaris.spacer"));
            super.appendTooltip(stack, context, tooltip, type);}});
        public static final Item ENERGIZED_JADE_BOOTS = registerItem("energized_jade_boots", new ArmorItem(SolarisArmorMaterials.ENERGIZED_JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
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
        public static final Item BLACKWIND_SPEAR = registerItem("blackwind", new Blackwind(new Item.Settings().maxCount(1).maxDamage(1024)));

    //Steel
        public static final Item STEEL = registerItem("steel", new Item(new Item.Settings()));
        public static final Item STEEL_DAGGER = registerItem("steel_dagger", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, daggerDamage, fastAttackSpeed))));
        public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, swordDamage, mediumAttackSpeed))));
        public static final Item STEEL_KATANA = registerItem("steel_katana", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, katanaDamage, mediumAttackSpeed))));
        public static final Item STEEL_LONGSWORD = registerItem("steel_longsword", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, bigSwordDamage, slowAttackSpeed))));
        public static final Item STEEL_HALBERD = registerItem("steel_halberd", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, halberdDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SCYTHE = registerItem("steel_scythe", new SwordItem(SolarisToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.STEEL, scytheDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SHIELD = registerItem("steel_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(1024)));

        public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(SolarisArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
        public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(SolarisArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
        public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(SolarisArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
        public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(SolarisArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));
        // ~

        public static final Item AMETHYST_HALBERD = registerItem("amethyst_halberd", new SwordItem(SolarisToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));


        public static final Item SCARLETT = registerItem("scarlett", new Item(new Item.Settings()));
        public static final Item SCARLETT_HAZE = registerItem("scarlett_haze", new ScarlettHaze(SolarisToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.ONYX, swordDamage, mediumAttackSpeed))));

        public static final Item ASTRAL_FORCE = registerItem("astral_force", new SwordItem(SolarisToolMaterials.RELIC, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.RELIC, swordDamage, mediumAttackSpeed))));

        public static final Item WOODLAND_BARK = registerItem("woodland_bark", new Item(new Item.Settings()));
        public static final Item WOODLAND_DAGGER = registerItem("woodland_dagger", new SwordItem(SolarisToolMaterials.WOODLAND, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.WOODLAND, daggerDamage, fastAttackSpeed))));
        public static final Item WOODLAND_LONGSWORD = registerItem("woodland_longsword", new SwordItem(SolarisToolMaterials.WOODLAND, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(SolarisToolMaterials.WOODLAND, bigSwordDamage, slowAttackSpeed))));


        public static final Item TREELING_SPAWN_EGG = registerItem("treeling_spawn_egg",
                new SpawnEggItem(SolarisEntities.TREELING, 0x663C1E, 0xE0C172, new Item.Settings()));

        public static final Item MUSHLING_SPAWN_EGG = registerItem("mushling_spawn_egg",
                new SpawnEggItem(SolarisEntities.MUSHLING, 0xB82B12, 0xE8CBA9, new Item.Settings()));

        public static final Item MONSTROSITREE_SPAWN_EGG = registerItem("monstrositree_spawn_egg",
                new SpawnEggItem(SolarisEntities.MONSTROSITREE, 0x784318, 0x5CC736, new Item.Settings()));

        public static final Item MUSH_HELM = registerItem("mush_helm", new ArmorItem(SolarisArmorMaterials.MUSH_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(3))));

        public static final Item FOREST_ESSENCE = registerItem("forest_essence", new Item(new Item.Settings()));

        public static final Item JOE_JOE_FRUIT = registerItem("joe_joe_fruit", new Item(new Item.Settings().food(SolarisFoodComponents.JOE_JOE_FRUIT)));


    //register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TelumSolaris.MOD_ID, name), item);
    }


    public static void registerModItems () {
    TelumSolaris.LOGGER.info("Registering Mod Items for " + TelumSolaris.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

            //STEEL
            entries.addAfter(Items.IRON_INGOT, STEEL);

            //JADE
            entries.addAfter(Items.NETHERITE_INGOT, IMPURE_JADE_CHUNK);
            entries.addAfter(IMPURE_JADE_CHUNK, REFINED_JADE);
            entries.addAfter(REFINED_JADE, FLAWLESS_JADE);
            entries.addAfter(FLAWLESS_JADE, JADE_TOKEN);

            //ONYX
            entries.addAfter(JADE_TOKEN, IMPURE_ONYX_CHUNK);
            entries.addAfter(IMPURE_ONYX_CHUNK, REFINED_ONYX);
            entries.addAfter(REFINED_ONYX, FLAWLESS_ONYX);
            entries.addAfter(FLAWLESS_ONYX, ONYX_TOKEN);

            //OPAL
            entries.addAfter(ONYX_TOKEN, IMPURE_OPAL_CHUNK);
            entries.addAfter(IMPURE_OPAL_CHUNK, REFINED_OPAL);
            entries.addAfter(REFINED_OPAL, FLAWLESS_OPAL);
            entries.addAfter(FLAWLESS_OPAL, OPAL_TOKEN);

            //SAPPHIRE
            entries.addAfter(OPAL_TOKEN, IMPURE_SAPPHIRE_CHUNK);
            entries.addAfter(IMPURE_SAPPHIRE_CHUNK, REFINED_SAPPHIRE);
            entries.addAfter(REFINED_SAPPHIRE, FLAWLESS_SAPPHIRE);
            entries.addAfter(FLAWLESS_SAPPHIRE, SAPPHIRE_TOKEN);

            //TOPAZ
            entries.addAfter(SAPPHIRE_TOKEN, IMPURE_TOPAZ_CHUNK);
            entries.addAfter(IMPURE_TOPAZ_CHUNK, REFINED_TOPAZ);
            entries.addAfter(REFINED_TOPAZ, FLAWLESS_TOPAZ);
            entries.addAfter(FLAWLESS_TOPAZ, TOPAZ_TOKEN);

            //RUBY
            entries.addAfter(TOPAZ_TOKEN, IMPURE_RUBY_CHUNK);
            entries.addAfter(IMPURE_RUBY_CHUNK, REFINED_RUBY);
            entries.addAfter(REFINED_RUBY, FLAWLESS_RUBY);
            entries.addAfter(FLAWLESS_RUBY, RUBY_TOKEN);

            entries.add(REINFORCED_BOTTLE);
            entries.add(THUNDER_BOTTLE);

            //Essences
            entries.add(FOREST_ESSENCE);


            entries.add(SCARLETT);
            entries.add(WOODLAND_BARK);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {

            //IRON
            entries.addAfter(Items.STONE_SWORD, IRON_DAGGER);
            entries.addAfter(Items.IRON_SWORD, IRON_KATANA);
            entries.addAfter(IRON_KATANA, IRON_LONGSWORD);
            entries.addAfter(IRON_LONGSWORD, IRON_HALBERD);
            entries.addAfter(IRON_HALBERD, IRON_SCYTHE);

            //STEEL
            entries.addAfter(Items.IRON_BOOTS, STEEL_HELMET);
            entries.addAfter(STEEL_HELMET, STEEL_CHESTPLATE);
            entries.addAfter(STEEL_CHESTPLATE, STEEL_LEGGINGS);
            entries.addAfter(STEEL_LEGGINGS, STEEL_BOOTS);

            entries.addAfter(IRON_SCYTHE, STEEL_DAGGER);
            entries.addAfter(STEEL_DAGGER, STEEL_SWORD);
            entries.addAfter(STEEL_SWORD, STEEL_KATANA);
            entries.addAfter(STEEL_KATANA, STEEL_LONGSWORD);
            entries.addAfter(STEEL_LONGSWORD, STEEL_HALBERD);
            entries.addAfter(STEEL_HALBERD, STEEL_SCYTHE);
            entries.addAfter(Items.SHIELD, STEEL_SHIELD);

            //DIAMOND
            entries.addAfter(Items.GOLDEN_SWORD, DIAMOND_DAGGER);
            entries.addAfter(Items.DIAMOND_SWORD, DIAMOND_KATANA);
            entries.addAfter(DIAMOND_KATANA, DIAMOND_LONGSWORD);
            entries.addAfter(DIAMOND_LONGSWORD, DIAMOND_HALBERD);
            entries.addAfter(DIAMOND_HALBERD, DIAMOND_SCYTHE);

            //JADE
            entries.addAfter(Items.NETHERITE_BOOTS, JADE_HELMET);
            entries.addAfter(JADE_HELMET, JADE_CHESTPLATE);
            entries.addAfter(JADE_CHESTPLATE, JADE_LEGGINGS);
            entries.addAfter(JADE_LEGGINGS, JADE_BOOTS);

            entries.addAfter(JADE_BOOTS, ENERGIZED_JADE_HELMET);
            entries.addAfter(ENERGIZED_JADE_HELMET, ENERGIZED_JADE_CHESTPLATE);
            entries.addAfter(ENERGIZED_JADE_CHESTPLATE, ENERGIZED_JADE_LEGGINGS);
            entries.addAfter(ENERGIZED_JADE_LEGGINGS, ENERGIZED_JADE_BOOTS);

            entries.addAfter(Items.NETHERITE_SWORD, JADE_DAGGER);
            entries.addAfter(JADE_DAGGER, JADE_SWORD);
            entries.addAfter(JADE_SWORD, JADE_KATANA);
            entries.addAfter(JADE_KATANA, JADE_GREATSWORD);
            entries.addAfter(JADE_GREATSWORD, JADE_HALBERD);
            entries.addAfter(JADE_HALBERD, JADE_SCYTHE);
            entries.addAfter(STEEL_SHIELD, JADE_SHIELD);

            entries.addAfter(JADE_SCYTHE, ENERGIZED_JADE_SWORD);

            //ONYX
            entries.addAfter(ENERGIZED_JADE_BOOTS, ONYX_HOOD);
            entries.addAfter(ONYX_HOOD, ONYX_ROBES);
            entries.addAfter(ONYX_ROBES, ONYX_LEGGINGS);
            entries.addAfter(ONYX_LEGGINGS, ONYX_BOOTS);

            entries.addAfter(ENERGIZED_JADE_SWORD, ONYX_DAGGER);
            entries.addAfter(ONYX_DAGGER, ONYX_SWORD);
            entries.addAfter(ONYX_SWORD, ONYX_KATANA);
            entries.addAfter(ONYX_KATANA, ONYX_GREATSWORD);
            entries.addAfter(ONYX_GREATSWORD, ONYX_HALBERD);
            entries.addAfter(ONYX_HALBERD, ONYX_SCYTHE);

            //OPAL
            entries.addAfter(ONYX_SCYTHE, OPAL_DAGGER);
            entries.addAfter(OPAL_DAGGER, OPAL_SWORD);
            entries.addAfter(OPAL_SWORD, OPAL_KATANA);
            entries.addAfter(OPAL_KATANA, OPAL_LONGSWORD);
            entries.addAfter(OPAL_LONGSWORD, OPAL_HALBERD);
            entries.addAfter(OPAL_HALBERD, OPAL_SCYTHE);

            //SAPPHIRE
            entries.addAfter(OPAL_SCYTHE, SAPPHIRE_DAGGER);
            entries.addAfter(SAPPHIRE_DAGGER, SAPPHIRE_SWORD);
            entries.addAfter(SAPPHIRE_SWORD, SAPPHIRE_KATANA);
            entries.addAfter(SAPPHIRE_KATANA, SAPPHIRE_LONGSWORD);
            entries.addAfter(SAPPHIRE_LONGSWORD, SAPPHIRE_HALBERD);
            entries.addAfter(SAPPHIRE_HALBERD, SAPPHIRE_SCYTHE);
            entries.addAfter(JADE_SHIELD, SAPPHIRE_SHIELD);

            //TOPAZ
            entries.addAfter(SAPPHIRE_SCYTHE, TOPAZ_DAGGER);
            entries.addAfter(TOPAZ_DAGGER, TOPAZ_SWORD);
            entries.addAfter(TOPAZ_SWORD, TOPAZ_KATANA);
            entries.addAfter(TOPAZ_KATANA, TOPAZ_GREATSWORD);
            entries.addAfter(TOPAZ_GREATSWORD, TOPAZ_HALBERD);
            entries.addAfter(TOPAZ_HALBERD, TOPAZ_SCYTHE);

            //RUBY
            entries.addAfter(TOPAZ_SCYTHE, RUBY_DAGGER);
            entries.addAfter(RUBY_DAGGER, RUBY_SWORD);
            entries.addAfter(RUBY_SWORD, RUBY_KATANA);
            entries.addAfter(RUBY_KATANA, RUBY_LONGSWORD);
            entries.addAfter(RUBY_LONGSWORD, RUBY_HALBERD);
            entries.addAfter(RUBY_HALBERD, RUBY_SCYTHE);
            entries.addAfter(SAPPHIRE_SHIELD, RUBY_SHIELD);

            entries.addAfter(ONYX_BOOTS, RUBY_HELMET);
            entries.addAfter(RUBY_HELMET, RUBY_CHESTPLATE);
            entries.addAfter(RUBY_CHESTPLATE, RUBY_LEGGINGS);
            entries.addAfter(RUBY_LEGGINGS, RUBY_BOOTS);

            entries.add(WOODLAND_DAGGER);
            entries.add(WOODLAND_LONGSWORD);

            entries.add(DUSTWORM_LONGBOW);
            entries.addAfter(Items.BOW, LONGBOW);
            entries.addAfter(LONGBOW, WOODLAND_BOW);

            entries.add(BLACKWIND_SPEAR);

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
            entries.add(MONSTROSITREE_SPAWN_EGG);
        });
    }
}