package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.item.SolarisItems;

import java.util.Optional;


public class SolarisModelProvider extends FabricModelProvider {
    public SolarisModelProvider(FabricDataOutput output) {
        super(output);
        System.out.println("Starting Mod Model Provider");

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        System.out.println("Generating Block State Models");

        //Jade
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);

        //Ruby
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        //Sapphire
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);

        //Topaz
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);

        //Onyx
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONYX_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ONYX_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONYX_BLOCK);

        //Opal
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        System.out.println("Generating Item State Models");
        //Jade
        //itemModelGenerator.register(SolarisItems.JADE_CHISEL, Models.HANDHELD);

        itemModelGenerator.register(SolarisItems.IMPURE_JADE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_JADE, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_JADE, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.JADE_TOKEN, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.JADE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.JADE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.JADE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.JADE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ENERGIZED_JADE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ENERGIZED_JADE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ENERGIZED_JADE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ENERGIZED_JADE_BOOTS);
        itemModelGenerator.register(SolarisItems.JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.JADE_KATANA, Models.HANDHELD);

        //Ruby
        itemModelGenerator.register(SolarisItems.IMPURE_RUBY_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_RUBY, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_RUBY, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.RUBY_TOKEN, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.RUBY_BOOTS);
        itemModelGenerator.register(SolarisItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.RUBY_KATANA, Models.HANDHELD);

        //Sapphire
        itemModelGenerator.register(SolarisItems.IMPURE_SAPPHIRE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.SAPPHIRE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.SAPPHIRE_KATANA, Models.HANDHELD);

        //Topaz
        itemModelGenerator.register(SolarisItems.IMPURE_TOPAZ_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_TOPAZ, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_TOPAZ, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.TOPAZ_TOKEN, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.TOPAZ_KATANA, Models.HANDHELD);

        //Onyx
        itemModelGenerator.register(SolarisItems.IMPURE_ONYX_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_ONYX, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_ONYX, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.ONYX_TOKEN, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.ONYX_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.ONYX_KATANA, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ONYX_HOOD);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ONYX_ROBES);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ONYX_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.ONYX_BOOTS);

        itemModelGenerator.register(SolarisItems.REINFORCED_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.THUNDER_BOTTLE, Models.GENERATED);

        //Opal
        itemModelGenerator.register(SolarisItems.IMPURE_OPAL_CHUNK, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.REFINED_OPAL, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.FLAWLESS_OPAL, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.OPAL_TOKEN, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.OPAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.OPAL_KATANA, Models.HANDHELD);

        //Steel
        itemModelGenerator.register(SolarisItems.STEEL, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.STEEL_KATANA, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.STEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) SolarisItems.STEEL_BOOTS);

        //Iron + Diamond
        itemModelGenerator.register(SolarisItems.IRON_KATANA, Models.HANDHELD);
        itemModelGenerator.register(SolarisItems.DIAMOND_KATANA, Models.HANDHELD);

        itemModelGenerator.register(SolarisItems.SCARLETT, Models.GENERATED);
        itemModelGenerator.register(SolarisItems.TREELING_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(SolarisItems.MUSHLING_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(SolarisItems.MONSTROSITREE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(SolarisItems.WOODLAND_BARK, Models.GENERATED);

        itemModelGenerator.register(SolarisItems.JOE_JOE_FRUIT, Models.GENERATED);

        itemModelGenerator.register(SolarisItems.FOREST_ESSENCE, Models.GENERATED);

    }
}
