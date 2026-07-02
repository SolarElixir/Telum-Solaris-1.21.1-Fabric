package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.solarelixir.solaris.item.SolarisItems;
import net.solarelixir.solaris.util.SolarisTags;

import java.util.concurrent.CompletableFuture;

public class SolarisItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SolarisItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .addTag(SolarisTags.Items.IS_JADE_WEAPON)
                .addTag(SolarisTags.Items.IS_ONYX_WEAPON)
                .addTag(SolarisTags.Items.IS_RUBY_WEAPON)
                .addTag(SolarisTags.Items.IS_SAPPHIRE_WEAPON)
                .addTag(SolarisTags.Items.IS_OPAL_WEAPON)
                .addTag(SolarisTags.Items.IS_TOPAZ_WEAPON)
                .addTag(SolarisTags.Items.IS_STEEL_WEAPON)
                .addTag(SolarisTags.Items.IS_IRON_WEAPON)
                .addTag(SolarisTags.Items.IS_DIAMOND_WEAPON)

                .add(SolarisItems.SCARLETT_HAZE)
                .add(SolarisItems.ASTRAL_FORCE)
                .add(SolarisItems.BLACKWIND_SPEAR)
                .add(SolarisItems.AMETHYST_HALBERD)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_SHIELD)
                .add(SolarisItems.RUBY_SHIELD)
                .add(SolarisItems.STEEL_SHIELD)
                .add(SolarisItems.JADE_SHIELD)
                .add(SolarisItems.ENERGIZED_JADE_SHIELD)
                .add(SolarisItems.SAPPHIRE_SHIELD)
                .add(Items.SHIELD)
        ;

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(SolarisItems.JADE_CHISEL)
                .addTag(SolarisTags.Items.IS_SHIELD)
                ;

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(SolarisItems.STEEL_HELMET)
                .add(SolarisItems.JADE_HELMET)
                .add(SolarisItems.ENERGIZED_JADE_HELMET)
                .add(SolarisItems.RUBY_HELMET)
                .add(SolarisItems.ONYX_HOOD)
                ;

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(SolarisItems.STEEL_CHESTPLATE)
                .add(SolarisItems.JADE_CHESTPLATE)
                .add(SolarisItems.ENERGIZED_JADE_CHESTPLATE)
                .add(SolarisItems.RUBY_CHESTPLATE)
                .add(SolarisItems.ONYX_ROBES)
        ;

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(SolarisItems.STEEL_LEGGINGS)
                .add(SolarisItems.JADE_LEGGINGS)
                .add(SolarisItems.ENERGIZED_JADE_LEGGINGS)
                .add(SolarisItems.RUBY_LEGGINGS)
                .add(SolarisItems.ONYX_LEGGINGS)
        ;

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(SolarisItems.STEEL_BOOTS)
                .add(SolarisItems.JADE_BOOTS)
                .add(SolarisItems.ENERGIZED_JADE_BOOTS)
                .add(SolarisItems.RUBY_BOOTS)
                .add(SolarisItems.ONYX_BOOTS)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_JADE_WEAPON)
                .add(SolarisItems.JADE_DAGGER)
                .add(SolarisItems.JADE_SWORD)
                .add(SolarisItems.JADE_KATANA)
                .add(SolarisItems.JADE_GREATSWORD)
                .add(SolarisItems.JADE_HALBERD)
                .add(SolarisItems.JADE_SCYTHE)
                .add(SolarisItems.ENERGIZED_JADE_SWORD)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_IRON_WEAPON)
                .add(SolarisItems.IRON_DAGGER)
                .add(Items.IRON_SWORD)
                .add(SolarisItems.IRON_KATANA)
                .add(SolarisItems.IRON_LONGSWORD)
                .add(SolarisItems.IRON_HALBERD)
                .add(SolarisItems.IRON_SCYTHE)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_DIAMOND_WEAPON)
                .add(SolarisItems.DIAMOND_DAGGER)
                .add(Items.DIAMOND_SWORD)
                .add(SolarisItems.DIAMOND_KATANA)
                .add(SolarisItems.DIAMOND_LONGSWORD)
                .add(SolarisItems.DIAMOND_HALBERD)
                .add(SolarisItems.DIAMOND_SCYTHE)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_ONYX_WEAPON)
                .add(SolarisItems.ONYX_DAGGER)
                .add(SolarisItems.ONYX_SWORD)
                .add(SolarisItems.ONYX_KATANA)
                .add(SolarisItems.ONYX_GREATSWORD)
                .add(SolarisItems.ONYX_HALBERD)
                .add(SolarisItems.ONYX_SCYTHE)
        ;

       getOrCreateTagBuilder(SolarisTags.Items.IS_RUBY_WEAPON)
                .add(SolarisItems.RUBY_DAGGER)
                .add(SolarisItems.RUBY_SWORD)
                .add(SolarisItems.RUBY_KATANA)
                .add(SolarisItems.RUBY_LONGSWORD)
                .add(SolarisItems.RUBY_HALBERD)
                .add(SolarisItems.RUBY_SCYTHE)
       ;

       getOrCreateTagBuilder(SolarisTags.Items.IS_SAPPHIRE_WEAPON)
                .add(SolarisItems.SAPPHIRE_DAGGER)
                .add(SolarisItems.SAPPHIRE_SWORD)
                .add(SolarisItems.SAPPHIRE_KATANA)
                .add(SolarisItems.SAPPHIRE_LONGSWORD)
                .add(SolarisItems.SAPPHIRE_HALBERD)
                .add(SolarisItems.SAPPHIRE_SCYTHE)
       ;

       getOrCreateTagBuilder(SolarisTags.Items.IS_OPAL_WEAPON)
               .add(SolarisItems.OPAL_DAGGER)
               .add(SolarisItems.OPAL_SWORD)
               .add(SolarisItems.OPAL_KATANA)
               .add(SolarisItems.OPAL_LONGSWORD)
               .add(SolarisItems.OPAL_HALBERD)
               .add(SolarisItems.OPAL_SCYTHE)
       ;

       getOrCreateTagBuilder(SolarisTags.Items.IS_TOPAZ_WEAPON)
               .add(SolarisItems.TOPAZ_DAGGER)
               .add(SolarisItems.TOPAZ_SWORD)
               .add(SolarisItems.TOPAZ_KATANA)
               .add(SolarisItems.TOPAZ_GREATSWORD)
               .add(SolarisItems.TOPAZ_HALBERD)
               .add(SolarisItems.TOPAZ_SCYTHE)
       ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_STEEL_WEAPON)
                .add(SolarisItems.STEEL_DAGGER)
                .add(SolarisItems.STEEL_SWORD)
                .add(SolarisItems.STEEL_KATANA)
                .add(SolarisItems.STEEL_LONGSWORD)
                .add(SolarisItems.STEEL_HALBERD)
                .add(SolarisItems.STEEL_SCYTHE)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.IS_BOW_ITEM)
                .add(SolarisItems.LONGBOW)
                .add(SolarisItems.DUSTWORM_LONGBOW)
                .add(SolarisItems.WOODLAND_BOW)
        ;

        getOrCreateTagBuilder(SolarisTags.Items.TWO_HANDED)
                .add(SolarisItems.JADE_GREATSWORD)
                .add(SolarisItems.STEEL_HALBERD)
                .add(SolarisItems.JADE_HALBERD)
                .add(SolarisItems.RUBY_HALBERD)
                .add(SolarisItems.STEEL_SCYTHE)
                .add(SolarisItems.JADE_SCYTHE)
                .add(SolarisItems.RUBY_SCYTHE)
        ;
    }
}
