package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        System.out.println("Generating Mod Item tag provider");

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS)

                .add(ModItems.JADE_HELMET)
                .add(ModItems.JADE_CHESTPLATE)
                .add(ModItems.JADE_LEGGINGS)
                .add(ModItems.JADE_BOOTS)

                .add(ModItems.ENERGIZED_JADE_HELMET)
                .add(ModItems.ENERGIZED_JADE_CHESTPLATE)
                .add(ModItems.ENERGIZED_JADE_LEGGINGS)
                .add(ModItems.ENERGIZED_JADE_BOOTS)

                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)

                .add(ModItems.ONYX_HOOD)
                .add(ModItems.ONYX_ROBES)
                .add(ModItems.ONYX_LEGGINGS)
                .add(ModItems.ONYX_BOOTS)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_JADE_ITEM)
                .add(ModItems.JADE_DAGGER)
                .add(ModItems.JADE_SWORD)
                .add(ModItems.JADE_KATANA)
                .add(ModItems.JADE_GREATSWORD)
                .add(ModItems.JADE_HALBERD)
                .add(ModItems.JADE_SCYTHE)
                .add(ModItems.ENERGIZED_JADE_SWORD)
        ;

        getOrCreateTagBuilder(ModTags.Items.KILL_COUNTING_ITEMS)
                .add(ModItems.ONYX_DAGGER)
                .add(ModItems.ONYX_SWORD)
                .add(ModItems.ONYX_KATANA)
                .add(ModItems.ONYX_GREATSWORD)
                .add(ModItems.ONYX_HALBERD)
                .add(ModItems.ONYX_SCYTHE)

                .add(ModItems.BROKEN_SPEAR)
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
    }
}
