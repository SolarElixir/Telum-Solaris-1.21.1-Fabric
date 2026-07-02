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
import net.solarelixir.solaris.item.SolarisItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SolarisRecipeProvider extends FabricRecipeProvider {
    public SolarisRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //Iron
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.IRON_DAGGER)
                .pattern("-")
                .pattern("I")
                .input('-', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(SolarisItems.IRON_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.IRON_KATANA)
                .pattern("-II")
                .input('-', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(SolarisItems.IRON_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.IRON_LONGSWORD)
                .pattern("  I")
                .pattern(" I ")
                .pattern("-I ")
                .input('-', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(SolarisItems.IRON_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.IRON_HALBERD)
                .pattern(" II")
                .pattern("I- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(SolarisItems.IRON_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.IRON_SCYTHE)
                .pattern("III")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(SolarisItems.IRON_SCYTHE))
                .offerTo(exporter);

        //Diamond
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.DIAMOND_DAGGER)
                .pattern("-")
                .pattern("D")
                .input('-', Items.STICK)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(SolarisItems.DIAMOND_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.DIAMOND_KATANA)
                .pattern("-DD")
                .input('-', Items.STICK)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(SolarisItems.DIAMOND_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.DIAMOND_LONGSWORD)
                .pattern("  D")
                .pattern(" D ")
                .pattern("-D ")
                .input('-', Items.STICK)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(SolarisItems.DIAMOND_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.DIAMOND_HALBERD)
                .pattern(" DD")
                .pattern("D- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(SolarisItems.DIAMOND_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.DIAMOND_SCYTHE)
                .pattern("DDD")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(SolarisItems.DIAMOND_SCYTHE))
                .offerTo(exporter);

        //Jade items, blocks and weapons
        List<ItemConvertible> REFINED_JADE_BLASTING = List.of(SolarisItems.IMPURE_JADE_CHUNK);
        offerBlasting(exporter, REFINED_JADE_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_JADE, 0.25f, 200, "jade_refining");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_JADE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_HELMET)
                .pattern("JJJ")
                .pattern("J J")
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_CHESTPLATE)
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_LEGGINGS)
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_BOOTS)
                .pattern("J J")
                .pattern("J J")
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_DAGGER)
                .pattern("-")
                .pattern("J")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_SWORD)
                .pattern("J")
                .pattern("J")
                .pattern("-")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_KATANA)
                .pattern("-JJ")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE),conditionsFromItem(SolarisItems.JADE_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_GREATSWORD)
                .pattern("  J")
                .pattern(" J ")
                .pattern("-J ")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_HALBERD)
                .pattern(" JJ")
                .pattern("J- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_SCYTHE)
                .pattern("JJJ")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.JADE_SHIELD)
                .pattern("GJG")
                .pattern("GJG")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_SHIELD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SolarisItems.JADE_CHISEL)
                .pattern(" J")
                .pattern("- ")
                .input('-', Items.STICK)
                .input('J', SolarisItems.FLAWLESS_JADE)
                .criterion(hasItem(SolarisItems.FLAWLESS_JADE), conditionsFromItem(SolarisItems.JADE_CHISEL))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_JADE, SolarisItems.REFINED_JADE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.JADE_TOKEN, SolarisItems.FLAWLESS_JADE, 4);

        //Topaz items, blocks and weapons
        List<ItemConvertible> REFINED_TOPAZ_BLASTING = List.of(SolarisItems.IMPURE_TOPAZ_CHUNK);
        offerBlasting(exporter, REFINED_TOPAZ_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_TOPAZ, 0.25f, 200, "topaz_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_TOPAZ, SolarisItems.REFINED_TOPAZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.TOPAZ_TOKEN, SolarisItems.FLAWLESS_TOPAZ, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_DAGGER)
                .pattern("-")
                .pattern("T")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ), conditionsFromItem(SolarisItems.TOPAZ_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("-")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ), conditionsFromItem(SolarisItems.TOPAZ_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_KATANA)
                .pattern("-TT")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ),conditionsFromItem(SolarisItems.TOPAZ_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_GREATSWORD)
                .pattern("  T")
                .pattern(" T ")
                .pattern("-T ")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ), conditionsFromItem(SolarisItems.TOPAZ_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_HALBERD)
                .pattern(" TT")
                .pattern("T- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ), conditionsFromItem(SolarisItems.TOPAZ_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.TOPAZ_SCYTHE)
                .pattern("TTT")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('T', SolarisItems.FLAWLESS_TOPAZ)
                .criterion(hasItem(SolarisItems.FLAWLESS_TOPAZ), conditionsFromItem(SolarisItems.TOPAZ_SCYTHE))
                .offerTo(exporter);

        //Opal items, blocks and weapons
        List<ItemConvertible> REFINED_OPAL_BLASTING = List.of(SolarisItems.IMPURE_OPAL_CHUNK);
        offerBlasting(exporter, REFINED_OPAL_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_OPAL, 0.25f, 200, "opal_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_OPAL, SolarisItems.REFINED_OPAL);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.OPAL_TOKEN, SolarisItems.FLAWLESS_OPAL, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_OPAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_DAGGER)
                .pattern("-")
                .pattern("O")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL), conditionsFromItem(SolarisItems.OPAL_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_SWORD)
                .pattern("O")
                .pattern("O")
                .pattern("-")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL), conditionsFromItem(SolarisItems.OPAL_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_KATANA)
                .pattern("-OO")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL),conditionsFromItem(SolarisItems.OPAL_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_LONGSWORD)
                .pattern("  O")
                .pattern(" O ")
                .pattern("-O ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL), conditionsFromItem(SolarisItems.OPAL_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_HALBERD)
                .pattern(" OO")
                .pattern("O- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL), conditionsFromItem(SolarisItems.OPAL_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.OPAL_SCYTHE)
                .pattern("OOO")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_OPAL)
                .criterion(hasItem(SolarisItems.FLAWLESS_OPAL), conditionsFromItem(SolarisItems.OPAL_SCYTHE))
                .offerTo(exporter);


        //Ruby items, blocks and weapons
        List<ItemConvertible> REFINED_RUBY_BLASTING = List.of(SolarisItems.IMPURE_RUBY_CHUNK);
        offerBlasting(exporter, REFINED_RUBY_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_RUBY, 0.25f, 200, "ruby_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_RUBY, SolarisItems.REFINED_RUBY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.RUBY_TOKEN, SolarisItems.FLAWLESS_RUBY, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_DAGGER)
                .pattern("-")
                .pattern("R")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_SWORD)
                .pattern("R")
                .pattern("R")
                .pattern("-")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_KATANA)
                .pattern("-RR")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY),conditionsFromItem(SolarisItems.RUBY_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_LONGSWORD)
                .pattern("  R")
                .pattern(" R ")
                .pattern("-R ")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_HALBERD)
                .pattern(" RR")
                .pattern("R- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_SCYTHE)
                .pattern("RRR")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.RUBY_SHIELD)
                .pattern("BRB")
                .pattern("BRB")
                .pattern(" B ")
                .input('B', Blocks.BLACKSTONE)
                .input('R', SolarisItems.FLAWLESS_RUBY)
                .criterion(hasItem(SolarisItems.FLAWLESS_RUBY), conditionsFromItem(SolarisItems.RUBY_SHIELD))
                .offerTo(exporter);


        //Sapphire items, blocks and weapons
        List<ItemConvertible> REFINED_SAPPHIRE_BLASTING = List.of(SolarisItems.IMPURE_SAPPHIRE_CHUNK);
        offerBlasting(exporter, REFINED_SAPPHIRE_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_SAPPHIRE, 0.25f, 200, "topaz_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_SAPPHIRE, SolarisItems.REFINED_SAPPHIRE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.SAPPHIRE_TOKEN, SolarisItems.FLAWLESS_SAPPHIRE, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_DAGGER)
                .pattern("-")
                .pattern("S")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE), conditionsFromItem(SolarisItems.SAPPHIRE_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("-")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE), conditionsFromItem(SolarisItems.SAPPHIRE_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_KATANA)
                .pattern("-SS")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE),conditionsFromItem(SolarisItems.SAPPHIRE_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_LONGSWORD)
                .pattern("  S")
                .pattern(" S ")
                .pattern("-S ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE), conditionsFromItem(SolarisItems.SAPPHIRE_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_HALBERD)
                .pattern(" SS")
                .pattern("S- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE), conditionsFromItem(SolarisItems.SAPPHIRE_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.SAPPHIRE_SCYTHE)
                .pattern("SSS")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.FLAWLESS_SAPPHIRE)
                .criterion(hasItem(SolarisItems.FLAWLESS_SAPPHIRE), conditionsFromItem(SolarisItems.SAPPHIRE_SCYTHE))
                .offerTo(exporter);


        //Onyx items, blocks and weapons
        List<ItemConvertible> REFINED_ONYX_BLASTING = List.of(SolarisItems.IMPURE_ONYX_CHUNK);
            offerBlasting(exporter, REFINED_ONYX_BLASTING, RecipeCategory.MISC, SolarisItems.REFINED_ONYX, 0.25f, 200, "onyx_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.FLAWLESS_ONYX, SolarisItems.REFINED_ONYX);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, SolarisItems.ONYX_TOKEN, SolarisItems.FLAWLESS_ONYX, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.FLAWLESS_ONYX, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONYX_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_HOOD)
                .pattern("OOO")
                .pattern("O O")
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_HOOD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_ROBES)
                .pattern("O O")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_ROBES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_LEGGINGS)
                .pattern("OOO")
                .pattern("O O")
                .pattern("O O")
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_BOOTS)
                .pattern("O O")
                .pattern("O O")
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_DAGGER)
                .pattern("-")
                .pattern("O")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_SWORD)
                .pattern("O")
                .pattern("O")
                .pattern("-")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_KATANA)
                .pattern("-OO")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX),conditionsFromItem(SolarisItems.ONYX_KATANA))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_GREATSWORD)
                .pattern("  O")
                .pattern(" O ")
                .pattern("-O ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_GREATSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_HALBERD)
                .pattern(" OO")
                .pattern("O- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.ONYX_SCYTHE)
                .pattern("OOO")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('O', SolarisItems.FLAWLESS_ONYX)
                .criterion(hasItem(SolarisItems.FLAWLESS_ONYX), conditionsFromItem(SolarisItems.ONYX_SCYTHE))
                .offerTo(exporter);


        //Steel items, blocks and weapons
        List<ItemConvertible> STEEL_SMELTING = List.of(Items.IRON_INGOT);
        offerSmelting(exporter, STEEL_SMELTING, RecipeCategory.MISC, SolarisItems.STEEL, 0.25f, 200, "steel");
        List<ItemConvertible> STEEL_BLASTING = List.of(Items.IRON_INGOT);
        offerBlasting(exporter, STEEL_BLASTING, RecipeCategory.MISC, SolarisItems.STEEL, 0.25f, 100, "steel");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, SolarisItems.STEEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("-")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL),conditionsFromItem(SolarisItems.STEEL_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_DAGGER)
                .pattern("-")
                .pattern("S")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_KATANA)
                .pattern("-SS")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL),conditionsFromItem(SolarisItems.STEEL_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_LONGSWORD)
                .pattern("  S")
                .pattern(" S ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL),conditionsFromItem(SolarisItems.STEEL_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_HALBERD)
                .pattern(" SS")
                .pattern("S- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_SCYTHE)
                .pattern("SSS")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_SHIELD)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_SHIELD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.STEEL_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', SolarisItems.STEEL)
                .criterion(hasItem(SolarisItems.STEEL), conditionsFromItem(SolarisItems.STEEL_BOOTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.WOODLAND_BOW)
                .pattern(" W ")
                .pattern("W#W")
                .pattern(" W ")
                .input('#', Items.BOW)
                .input('W', SolarisItems.WOODLAND_BARK)
                .criterion(hasItem(SolarisItems.WOODLAND_BARK), conditionsFromItem(SolarisItems.WOODLAND_BOW))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.WOODLAND_DAGGER)
                .pattern(" W ")
                .pattern("W#W")
                .pattern(" W ")
                .input('W', SolarisItems.WOODLAND_BARK)
                .input('#', SolarisItems.IRON_DAGGER)
                .criterion(hasItem(SolarisItems.WOODLAND_BARK), conditionsFromItem(SolarisItems.WOODLAND_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, SolarisItems.WOODLAND_LONGSWORD)
                .pattern(" W ")
                .pattern("W#W")
                .pattern(" W ")
                .input('W', SolarisItems.WOODLAND_BARK)
                .input('#', SolarisItems.IRON_LONGSWORD)
                .criterion(hasItem(SolarisItems.WOODLAND_BARK), conditionsFromItem(SolarisItems.WOODLAND_LONGSWORD))
                .offerTo(exporter);
    }
}
