package net.solarelixir.solaris.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.block.ModBlocks;

public class ModItemGroups {
public static final ItemGroup TELUM_SOLARIS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(TelumSolaris.MOD_ID, "telum_solaris"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JADE_TOKEN))
                .displayName(Text.translatable("itemgroup.solaris.telum_solaris"))
                .entries((displayContext, entries) -> {

                    entries.add(ModItems.LONGBOW);
                    entries.add(ModItems.WOODLAND_BARK);
                    entries.add(ModItems.WOODLAND_BOW);

                    //entries.add(ModBlocks.GEMSTONE_INFUSER);

                    //Jade items and blocks
                    entries.add(ModBlocks.JADE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                    entries.add(ModBlocks.JADE_BLOCK);
                    entries.add(ModItems.IMPURE_JADE_CHUNK);
                    entries.add(ModItems.REFINED_JADE);
                    entries.add(ModItems.FLAWLESS_JADE);
                    entries.add(ModItems.JADE_TOKEN);
                    entries.add(ModItems.JADE_HELMET);
                    entries.add(ModItems.JADE_CHESTPLATE);
                    entries.add(ModItems.JADE_LEGGINGS);
                    entries.add(ModItems.JADE_BOOTS);
                    entries.add(ModItems.ENERGIZED_JADE_HELMET);
                    entries.add(ModItems.ENERGIZED_JADE_CHESTPLATE);
                    entries.add(ModItems.ENERGIZED_JADE_LEGGINGS);
                    entries.add(ModItems.ENERGIZED_JADE_BOOTS);
                    entries.add(ModItems.JADE_CHISEL);
                    entries.add(ModItems.JADE_DAGGER);
                    entries.add(ModItems.JADE_SWORD);
                    entries.add(ModItems.JADE_KATANA);
                    entries.add(ModItems.JADE_GREATSWORD);
                    entries.add(ModItems.JADE_HALBERD);
                    entries.add(ModItems.JADE_SCYTHE);
                    entries.add(ModItems.JADE_SHIELD);
                    entries.add(ModItems.ENERGIZED_JADE_SHIELD);

                    entries.add(ModItems.ENERGIZED_JADE_SWORD);

                    //Ruby items/blocks
                    entries.add(ModBlocks.NETHER_RUBY_ORE);
                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModItems.IMPURE_RUBY_CHUNK);
                    entries.add(ModItems.REFINED_RUBY);
                    entries.add(ModItems.FLAWLESS_RUBY);
                    entries.add(ModItems.RUBY_TOKEN);
                    entries.add(ModItems.RUBY_HELMET);
                    entries.add(ModItems.RUBY_CHESTPLATE);
                    entries.add(ModItems.RUBY_LEGGINGS);
                    entries.add(ModItems.RUBY_BOOTS);
                    entries.add(ModItems.RUBY_DAGGER);
                    entries.add(ModItems.RUBY_SWORD);
                    entries.add(ModItems.RUBY_KATANA);
                    entries.add(ModItems.RUBY_LONGSWORD);
                    entries.add(ModItems.RUBY_HALBERD);
                    entries.add(ModItems.RUBY_SCYTHE);
                    entries.add(ModItems.RUBY_SHIELD);


                    //Sapphire items/blocks
                    entries.add(ModBlocks.SAPPHIRE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                    entries.add(ModBlocks.SAPPHIRE_BLOCK);
                    entries.add(ModItems.IMPURE_SAPPHIRE_CHUNK);
                    entries.add(ModItems.REFINED_SAPPHIRE);
                    entries.add(ModItems.FLAWLESS_SAPPHIRE);
                    entries.add(ModItems.SAPPHIRE_TOKEN);
                    entries.add(ModItems.SAPPHIRE_DAGGER);
                    entries.add(ModItems.SAPPHIRE_SWORD);
                    entries.add(ModItems.SAPPHIRE_LONGSWORD);
                    entries.add(ModItems.SAPPHIRE_KATANA);
                    entries.add(ModItems.SAPPHIRE_HALBERD);
                    entries.add(ModItems.SAPPHIRE_SCYTHE);
                    entries.add(ModItems.SAPPHIRE_SHIELD);

                    //Topaz items/blocks
                    entries.add(ModBlocks.TOPAZ_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                    entries.add(ModBlocks.TOPAZ_BLOCK);
                    entries.add(ModItems.IMPURE_TOPAZ_CHUNK);
                    entries.add(ModItems.REFINED_TOPAZ);
                    entries.add(ModItems.FLAWLESS_TOPAZ);
                    entries.add(ModItems.TOPAZ_TOKEN);
                    entries.add(ModItems.TOPAZ_DAGGER);
                    entries.add(ModItems.TOPAZ_SWORD);
                    entries.add(ModItems.TOPAZ_KATANA);
                    entries.add(ModItems.TOPAZ_GREATSWORD);
                    entries.add(ModItems.TOPAZ_HALBERD);
                    entries.add(ModItems.TOPAZ_SCYTHE);

                    //Onyx items/blocks
                    entries.add(ModBlocks.ONYX_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ONYX_ORE);
                    entries.add(ModBlocks.ONYX_BLOCK);
                    entries.add(ModItems.IMPURE_ONYX_CHUNK);
                    entries.add(ModItems.REFINED_ONYX);
                    entries.add(ModItems.FLAWLESS_ONYX);
                    entries.add(ModItems.ONYX_TOKEN);
                    entries.add(ModItems.ONYX_HOOD);
                    entries.add(ModItems.ONYX_ROBES);
                    entries.add(ModItems.ONYX_LEGGINGS);
                    entries.add(ModItems.ONYX_BOOTS);
                    entries.add(ModItems.ONYX_DAGGER);
                    entries.add(ModItems.ONYX_SWORD);
                    entries.add(ModItems.ONYX_KATANA);
                    entries.add(ModItems.ONYX_GREATSWORD);
                    entries.add(ModItems.ONYX_HALBERD);
                    entries.add(ModItems.ONYX_SCYTHE);

                    //Opal
                    entries.add(ModBlocks.OPAL_ORE);
                    entries.add(ModBlocks.DEEPSLATE_OPAL_ORE);
                    entries.add(ModBlocks.OPAL_BLOCK);
                    entries.add(ModItems.IMPURE_OPAL_CHUNK);
                    entries.add(ModItems.REFINED_OPAL);
                    entries.add(ModItems.FLAWLESS_OPAL);
                    entries.add(ModItems.OPAL_TOKEN);
                    entries.add(ModItems.OPAL_DAGGER);
                    entries.add(ModItems.OPAL_SWORD);
                    entries.add(ModItems.OPAL_KATANA);
                    entries.add(ModItems.OPAL_LONGSWORD);
                    entries.add(ModItems.OPAL_HALBERD);
                    entries.add(ModItems.OPAL_SCYTHE);


                    //Boss weapons
                    entries.add(ModItems.DUSTWORM_LONGBOW);

                    //Storm items
                    entries.add(ModItems.REINFORCED_BOTTLE);
                    entries.add(ModItems.THUNDER_BOTTLE);

                    //Storm weapons
                    entries.add(ModItems.STORM_DAGGER);

                    //Spiritus items
                    entries.add(ModItems.SPIRITUS_CONDUIT);

                    //Hybrid weapons
                    entries.add(ModItems.BLACKWIND_SPEAR);
                    entries.add(ModItems.SILVER_ONI_MASK);

                    //Steel items
                    entries.add(ModItems.STEEL_HELMET);
                    entries.add(ModItems.STEEL_CHESTPLATE);
                    entries.add(ModItems.STEEL_LEGGINGS);
                    entries.add(ModItems.STEEL_BOOTS);
                    entries.add(ModItems.STEEL);
                    entries.add(ModBlocks.STEEL_BLOCK);

                    entries.add(ModItems.STEEL_DAGGER);
                    entries.add(ModItems.STEEL_SWORD);
                    entries.add(ModItems.STEEL_KATANA);
                    entries.add(ModItems.STEEL_LONGSWORD);
                    entries.add(ModItems.STEEL_HALBERD);
                    entries.add(ModItems.STEEL_SCYTHE);
                    entries.add(ModItems.STEEL_SHIELD);

                    entries.add(ModItems.AMETHYST_HALBERD);

                    entries.add(ModItems.SCARLETT);
                    entries.add(ModItems.SCARLETT_HAZE);
                    entries.add(ModItems.BROKEN_SPEAR);

                    entries.add(ModItems.ASTRAL_FORCE);

                    entries.add(ModItems.TREELING_SPAWN_EGG);
                    entries.add(ModItems.MUSHLING_SPAWN_EGG);

                })
                .build());


    public static void registerItemGroups() {
        TelumSolaris.LOGGER.info("registering Item Groups for " + TelumSolaris.MOD_ID);}
}
