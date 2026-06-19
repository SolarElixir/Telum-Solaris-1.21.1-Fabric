package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .addTag(ModTags.Items.IS_JADE_WEAPON)
                .addTag(ModTags.Items.IS_ONYX_WEAPON)
                .addTag(ModTags.Items.IS_RUBY_WEAPON)
                .addTag(ModTags.Items.IS_SAPPHIRE_WEAPON)
                .addTag(ModTags.Items.IS_OPAL_WEAPON)
                .addTag(ModTags.Items.IS_TOPAZ_WEAPON)
                .addTag(ModTags.Items.IS_STEEL_WEAPON)
                .addTag(ModTags.Items.IS_IRON_WEAPON)
                .addTag(ModTags.Items.IS_DIAMOND_WEAPON)

                .add(ModItems.SCARLETT_HAZE)
                .add(ModItems.ASTRAL_FORCE)
                .add(ModItems.BLACKWIND_SPEAR)
                .add(ModItems.AMETHYST_HALBERD)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_SHIELD)
                .add(ModItems.RUBY_SHIELD)
                .add(ModItems.STEEL_SHIELD)
                .add(ModItems.JADE_SHIELD)
                .add(ModItems.ENERGIZED_JADE_SHIELD)
                .add(ModItems.SAPPHIRE_SHIELD)
                .add(Items.SHIELD)
        ;

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.JADE_CHISEL)
                .addTag(ModTags.Items.IS_SHIELD)
                ;

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.JADE_HELMET)
                .add(ModItems.ENERGIZED_JADE_HELMET)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.ONYX_HOOD)
                ;

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.JADE_CHESTPLATE)
                .add(ModItems.ENERGIZED_JADE_CHESTPLATE)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.ONYX_ROBES)
        ;

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.JADE_LEGGINGS)
                .add(ModItems.ENERGIZED_JADE_LEGGINGS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.ONYX_LEGGINGS)
        ;

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.JADE_BOOTS)
                .add(ModItems.ENERGIZED_JADE_BOOTS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.ONYX_BOOTS)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_JADE_WEAPON)
                .add(ModItems.JADE_DAGGER)
                .add(ModItems.JADE_SWORD)
                .add(ModItems.JADE_KATANA)
                .add(ModItems.JADE_GREATSWORD)
                .add(ModItems.JADE_HALBERD)
                .add(ModItems.JADE_SCYTHE)
                .add(ModItems.ENERGIZED_JADE_SWORD)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_IRON_WEAPON)
                .add(ModItems.IRON_DAGGER)
                .add(Items.IRON_SWORD)
                .add(ModItems.IRON_KATANA)
                .add(ModItems.IRON_LONGSWORD)
                .add(ModItems.IRON_HALBERD)
                .add(ModItems.IRON_SCYTHE)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_DIAMOND_WEAPON)
                .add(ModItems.DIAMOND_DAGGER)
                .add(Items.DIAMOND_SWORD)
                .add(ModItems.DIAMOND_KATANA)
                .add(ModItems.DIAMOND_LONGSWORD)
                .add(ModItems.DIAMOND_HALBERD)
                .add(ModItems.DIAMOND_SCYTHE)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_ONYX_WEAPON)
                .add(ModItems.ONYX_DAGGER)
                .add(ModItems.ONYX_SWORD)
                .add(ModItems.ONYX_KATANA)
                .add(ModItems.ONYX_GREATSWORD)
                .add(ModItems.ONYX_HALBERD)
                .add(ModItems.ONYX_SCYTHE)
        ;

       getOrCreateTagBuilder(ModTags.Items.IS_RUBY_WEAPON)
                .add(ModItems.RUBY_DAGGER)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_KATANA)
                .add(ModItems.RUBY_LONGSWORD)
                .add(ModItems.RUBY_HALBERD)
                .add(ModItems.RUBY_SCYTHE)
       ;

       getOrCreateTagBuilder(ModTags.Items.IS_SAPPHIRE_WEAPON)
                .add(ModItems.SAPPHIRE_DAGGER)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.SAPPHIRE_KATANA)
                .add(ModItems.SAPPHIRE_LONGSWORD)
                .add(ModItems.SAPPHIRE_HALBERD)
                .add(ModItems.SAPPHIRE_SCYTHE)
       ;

       getOrCreateTagBuilder(ModTags.Items.IS_OPAL_WEAPON)
               .add(ModItems.OPAL_DAGGER)
               .add(ModItems.OPAL_SWORD)
               .add(ModItems.OPAL_KATANA)
               .add(ModItems.OPAL_LONGSWORD)
               .add(ModItems.OPAL_HALBERD)
               .add(ModItems.OPAL_SCYTHE)
       ;

       getOrCreateTagBuilder(ModTags.Items.IS_TOPAZ_WEAPON)
               .add(ModItems.TOPAZ_DAGGER)
               .add(ModItems.TOPAZ_SWORD)
               .add(ModItems.TOPAZ_KATANA)
               .add(ModItems.TOPAZ_GREATSWORD)
               .add(ModItems.TOPAZ_HALBERD)
               .add(ModItems.TOPAZ_SCYTHE)
       ;

        getOrCreateTagBuilder(ModTags.Items.IS_STEEL_WEAPON)
                .add(ModItems.STEEL_DAGGER)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.STEEL_KATANA)
                .add(ModItems.STEEL_LONGSWORD)
                .add(ModItems.STEEL_HALBERD)
                .add(ModItems.STEEL_SCYTHE)
        ;



        getOrCreateTagBuilder(ModTags.Items.IS_BOW_ITEM)
                .add(ModItems.LONGBOW)
                .add(ModItems.DUSTWORM_LONGBOW)
                .add(ModItems.WOODLAND_BOW)
        ;

        getOrCreateTagBuilder(ModTags.Items.TWO_HANDED)
                .add(ModItems.JADE_GREATSWORD)
                .add(ModItems.STEEL_HALBERD)
                .add(ModItems.JADE_HALBERD)
                .add(ModItems.RUBY_HALBERD)
                .add(ModItems.STEEL_SCYTHE)
                .add(ModItems.JADE_SCYTHE)
                .add(ModItems.RUBY_SCYTHE)
        ;

        getOrCreateTagBuilder(ModTags.Items.HAS_ICON)
                .add(ModItems.JADE_HALBERD)
                .add(ModItems.ONYX_HALBERD)
                .add(ModItems.RUBY_HALBERD)
                .add(ModItems.SAPPHIRE_HALBERD)
                .add(ModItems.TOPAZ_HALBERD)
                .add(ModItems.OPAL_HALBERD)
                .add(ModItems.STEEL_HALBERD)
                .add(ModItems.DIAMOND_HALBERD)
                .add(ModItems.IRON_HALBERD)

                .add(ModItems.JADE_GREATSWORD)
                .add(ModItems.ONYX_GREATSWORD)
                .add(ModItems.RUBY_LONGSWORD)
                .add(ModItems.SAPPHIRE_LONGSWORD)
                .add(ModItems.TOPAZ_GREATSWORD)
                .add(ModItems.OPAL_LONGSWORD)
                .add(ModItems.STEEL_LONGSWORD)
                .add(ModItems.DIAMOND_LONGSWORD)
                .add(ModItems.IRON_LONGSWORD)
        ;

    }
}
