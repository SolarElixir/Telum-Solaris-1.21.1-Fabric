package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
        System.out.println("Starting Mod Recipe Provider");

    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Jade items, blocks and weapons
        List<ItemConvertible> REFINED_JADE_BLASTING = List.of(ModItems.IMPURE_JADE_CHUNK);
        offerBlasting(exporter, REFINED_JADE_BLASTING, RecipeCategory.MISC, ModItems.REFINED_JADE, 0.25f, 200, "jade_refining");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLAWLESS_JADE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_HELMET)
                .pattern("JJJ")
                .pattern("J J")
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_CHESTPLATE)
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_LEGGINGS)
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_BOOTS)
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_DAGGER)
                .pattern("-")
                .pattern("J")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SWORD)
                .pattern("J")
                .pattern("J")
                .pattern("-")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_KATANA)
                .pattern("-JJ")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE),conditionsFromItem(ModItems.JADE_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_GREATSWORD)
                .pattern("  J")
                .pattern(" J ")
                .pattern("-J ")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_HALBERD)
                .pattern(" JJ")
                .pattern("J- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SCYTHE)
                .pattern("JJJ")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SHIELD)
                .pattern("GJG")
                .pattern("GJG")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_SHIELD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_CHISEL)
                .pattern(" J")
                .pattern("- ")
                .input('-', Items.STICK)
                .input('J', ModItems.FLAWLESS_JADE)
                .criterion(hasItem(ModItems.FLAWLESS_JADE), conditionsFromItem(ModItems.JADE_CHISEL))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLAWLESS_JADE, ModItems.REFINED_JADE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.JADE_TOKEN, ModItems.FLAWLESS_JADE, 4);

        //Topaz items, blocks and weapons
        List<ItemConvertible> REFINED_TOPAZ_BLASTING = List.of(ModItems.IMPURE_TOPAZ_CHUNK);
        offerBlasting(exporter, REFINED_TOPAZ_BLASTING, RecipeCategory.MISC, ModItems.REFINED_TOPAZ, 0.25f, 200, "topaze_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLAWLESS_TOPAZ, ModItems.REFINED_TOPAZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.TOPAZ_TOKEN, ModItems.FLAWLESS_TOPAZ, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLAWLESS_TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_DAGGER)
                .pattern("-")
                .pattern("T")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ), conditionsFromItem(ModItems.TOPAZ_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("-")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ), conditionsFromItem(ModItems.TOPAZ_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_KATANA)
                .pattern("-TT")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ),conditionsFromItem(ModItems.TOPAZ_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_GREATSWORD)
                .pattern("  T")
                .pattern(" T ")
                .pattern("-T ")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ), conditionsFromItem(ModItems.TOPAZ_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_HALBERD)
                .pattern(" TT")
                .pattern("T- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ), conditionsFromItem(ModItems.TOPAZ_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_SCYTHE)
                .pattern("TTT")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('T', ModItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(ModItems.FLAWLESS_TOPAZ), conditionsFromItem(ModItems.TOPAZ_SCYTHE))
                .offerTo(exporter);


        //Ruby items, blocks and weapons
        List<ItemConvertible> REFINED_RUBY_BLASTING = List.of(ModItems.IMPURE_RUBY_CHUNK);
        offerBlasting(exporter, REFINED_RUBY_BLASTING, RecipeCategory.MISC, ModItems.REFINED_RUBY, 0.25f, 200, "ruby_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLAWLESS_RUBY, ModItems.REFINED_RUBY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.RUBY_TOKEN, ModItems.FLAWLESS_RUBY, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLAWLESS_RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_DAGGER)
                .pattern("-")
                .pattern("R")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                .pattern("R")
                .pattern("R")
                .pattern("-")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_KATANA)
                .pattern("-RR")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY),conditionsFromItem(ModItems.RUBY_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_LONGSWORD)
                .pattern("  R")
                .pattern(" R ")
                .pattern("-R ")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_HALBERD)
                .pattern(" RR")
                .pattern("R- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SCYTHE)
                .pattern("RRR")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SHIELD)
                .pattern("BRB")
                .pattern("BRB")
                .pattern(" B ")
                .input('B', Blocks.BLACKSTONE)
                .input('R', ModItems.FLAWLESS_RUBY)
                .criterion(hasItem(ModItems.FLAWLESS_RUBY), conditionsFromItem(ModItems.RUBY_SHIELD))
                .offerTo(exporter);


        //Aquamarine items, blocks and weapons

        //Onyx items, blocks and weapons
        List<ItemConvertible> REFINED_ONYX_BLASTING = List.of(ModItems.IMPURE_ONYX_CHUNK);
            offerBlasting(exporter, REFINED_ONYX_BLASTING, RecipeCategory.MISC, ModItems.REFINED_ONYX, 0.25f, 200, "onyx_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLAWLESS_ONYX, ModItems.REFINED_ONYX);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.ONYX_TOKEN, ModItems.FLAWLESS_ONYX, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLAWLESS_ONYX, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONYX_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_HOOD)
                .pattern("OOO")
                .pattern("O O")
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_HOOD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_ROBES)
                .pattern("O O")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_ROBES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_LEGGINGS)
                .pattern("OOO")
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_BOOTS)
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_DAGGER)
                .pattern("-")
                .pattern("O")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_SWORD)
                .pattern("O")
                .pattern("O")
                .pattern("-")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_KATANA)
                .pattern("-OO")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX),conditionsFromItem(ModItems.ONYX_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_GREATSWORD)
                .pattern("  O")
                .pattern(" O ")
                .pattern("-O ")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_HALBERD)
                .pattern(" OO")
                .pattern("O- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_SCYTHE)
                .pattern("OOO")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_SCYTHE))
                .offerTo(exporter);


        //Steel items, blocks and weapons
        List<ItemConvertible> STEEL_SMELTING = List.of(Items.IRON_INGOT);
        offerSmelting(exporter, STEEL_SMELTING, RecipeCategory.MISC, ModItems.STEEL, 0.25f, 200, "steel");
        List<ItemConvertible> STEEL_BLASTING = List.of(Items.IRON_INGOT);
        offerBlasting(exporter, STEEL_BLASTING, RecipeCategory.MISC, ModItems.STEEL, 0.25f, 100, "steel");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("-")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_DAGGER)
                .pattern("-")
                .pattern("S")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_KATANA)
                .pattern("-SS")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LONGSWORD)
                .pattern("  S")
                .pattern(" S ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HALBERD)
                .pattern(" SS")
                .pattern("S- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SCYTHE)
                .pattern("SSS")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SHIELD)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_SHIELD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_BOOTS))
                .offerTo(exporter);
    }
}
