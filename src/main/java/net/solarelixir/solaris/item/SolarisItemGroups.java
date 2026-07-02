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

public class SolarisItemGroups {
public static final ItemGroup TELUM_SOLARIS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(TelumSolaris.MOD_ID, "telum_solaris"),
        FabricItemGroup.builder().icon(() -> new ItemStack(SolarisItems.JADE_TOKEN))
                .displayName(Text.translatable("itemgroup.solaris.telum_solaris"))
                .entries((displayContext, entries) -> {

                    entries.add(SolarisItems.LONGBOW);
                    entries.add(SolarisItems.WOODLAND_BARK);
                    entries.add(SolarisItems.WOODLAND_BOW);
                    entries.add(SolarisItems.WOODLAND_DAGGER);
                    entries.add(SolarisItems.WOODLAND_LONGSWORD);

                    //entries.add(ModBlocks.GEMSTONE_INFUSER);

                    //Jade items and blocks
                    entries.add(ModBlocks.JADE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                    entries.add(ModBlocks.JADE_BLOCK);
                    entries.add(SolarisItems.IMPURE_JADE_CHUNK);
                    entries.add(SolarisItems.REFINED_JADE);
                    entries.add(SolarisItems.FLAWLESS_JADE);
                    entries.add(SolarisItems.JADE_TOKEN);
                    entries.add(SolarisItems.JADE_HELMET);
                    entries.add(SolarisItems.JADE_CHESTPLATE);
                    entries.add(SolarisItems.JADE_LEGGINGS);
                    entries.add(SolarisItems.JADE_BOOTS);
                    entries.add(SolarisItems.ENERGIZED_JADE_HELMET);
                    entries.add(SolarisItems.ENERGIZED_JADE_CHESTPLATE);
                    entries.add(SolarisItems.ENERGIZED_JADE_LEGGINGS);
                    entries.add(SolarisItems.ENERGIZED_JADE_BOOTS);
                    entries.add(SolarisItems.JADE_CHISEL);
                    entries.add(SolarisItems.JADE_DAGGER);
                    entries.add(SolarisItems.JADE_SWORD);
                    entries.add(SolarisItems.JADE_KATANA);
                    entries.add(SolarisItems.JADE_GREATSWORD);
                    entries.add(SolarisItems.JADE_HALBERD);
                    entries.add(SolarisItems.JADE_SCYTHE);
                    entries.add(SolarisItems.JADE_SHIELD);
                    entries.add(SolarisItems.ENERGIZED_JADE_SHIELD);

                    entries.add(SolarisItems.ENERGIZED_JADE_SWORD);

                    //Ruby items/blocks
                    entries.add(ModBlocks.NETHER_RUBY_ORE);
                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(SolarisItems.IMPURE_RUBY_CHUNK);
                    entries.add(SolarisItems.REFINED_RUBY);
                    entries.add(SolarisItems.FLAWLESS_RUBY);
                    entries.add(SolarisItems.RUBY_TOKEN);
                    entries.add(SolarisItems.RUBY_HELMET);
                    entries.add(SolarisItems.RUBY_CHESTPLATE);
                    entries.add(SolarisItems.RUBY_LEGGINGS);
                    entries.add(SolarisItems.RUBY_BOOTS);
                    entries.add(SolarisItems.RUBY_DAGGER);
                    entries.add(SolarisItems.RUBY_SWORD);
                    entries.add(SolarisItems.RUBY_KATANA);
                    entries.add(SolarisItems.RUBY_LONGSWORD);
                    entries.add(SolarisItems.RUBY_HALBERD);
                    entries.add(SolarisItems.RUBY_SCYTHE);
                    entries.add(SolarisItems.RUBY_SHIELD);


                    //Sapphire items/blocks
                    entries.add(ModBlocks.SAPPHIRE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                    entries.add(ModBlocks.SAPPHIRE_BLOCK);
                    entries.add(SolarisItems.IMPURE_SAPPHIRE_CHUNK);
                    entries.add(SolarisItems.REFINED_SAPPHIRE);
                    entries.add(SolarisItems.FLAWLESS_SAPPHIRE);
                    entries.add(SolarisItems.SAPPHIRE_TOKEN);
                    entries.add(SolarisItems.SAPPHIRE_DAGGER);
                    entries.add(SolarisItems.SAPPHIRE_SWORD);
                    entries.add(SolarisItems.SAPPHIRE_LONGSWORD);
                    entries.add(SolarisItems.SAPPHIRE_KATANA);
                    entries.add(SolarisItems.SAPPHIRE_HALBERD);
                    entries.add(SolarisItems.SAPPHIRE_SCYTHE);
                    entries.add(SolarisItems.SAPPHIRE_SHIELD);

                    //Topaz items/blocks
                    entries.add(ModBlocks.TOPAZ_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                    entries.add(ModBlocks.TOPAZ_BLOCK);
                    entries.add(SolarisItems.IMPURE_TOPAZ_CHUNK);
                    entries.add(SolarisItems.REFINED_TOPAZ);
                    entries.add(SolarisItems.FLAWLESS_TOPAZ);
                    entries.add(SolarisItems.TOPAZ_TOKEN);
                    entries.add(SolarisItems.TOPAZ_DAGGER);
                    entries.add(SolarisItems.TOPAZ_SWORD);
                    entries.add(SolarisItems.TOPAZ_KATANA);
                    entries.add(SolarisItems.TOPAZ_GREATSWORD);
                    entries.add(SolarisItems.TOPAZ_HALBERD);
                    entries.add(SolarisItems.TOPAZ_SCYTHE);

                    //Onyx items/blocks
                    entries.add(ModBlocks.ONYX_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ONYX_ORE);
                    entries.add(ModBlocks.ONYX_BLOCK);
                    entries.add(SolarisItems.IMPURE_ONYX_CHUNK);
                    entries.add(SolarisItems.REFINED_ONYX);
                    entries.add(SolarisItems.FLAWLESS_ONYX);
                    entries.add(SolarisItems.ONYX_TOKEN);
                    entries.add(SolarisItems.ONYX_HOOD);
                    entries.add(SolarisItems.ONYX_ROBES);
                    entries.add(SolarisItems.ONYX_LEGGINGS);
                    entries.add(SolarisItems.ONYX_BOOTS);
                    entries.add(SolarisItems.ONYX_DAGGER);
                    entries.add(SolarisItems.ONYX_SWORD);
                    entries.add(SolarisItems.ONYX_KATANA);
                    entries.add(SolarisItems.ONYX_GREATSWORD);
                    entries.add(SolarisItems.ONYX_HALBERD);
                    entries.add(SolarisItems.ONYX_SCYTHE);

                    //Opal
                    entries.add(ModBlocks.OPAL_ORE);
                    entries.add(ModBlocks.DEEPSLATE_OPAL_ORE);
                    entries.add(ModBlocks.OPAL_BLOCK);
                    entries.add(SolarisItems.IMPURE_OPAL_CHUNK);
                    entries.add(SolarisItems.REFINED_OPAL);
                    entries.add(SolarisItems.FLAWLESS_OPAL);
                    entries.add(SolarisItems.OPAL_TOKEN);
                    entries.add(SolarisItems.OPAL_DAGGER);
                    entries.add(SolarisItems.OPAL_SWORD);
                    entries.add(SolarisItems.OPAL_KATANA);
                    entries.add(SolarisItems.OPAL_LONGSWORD);
                    entries.add(SolarisItems.OPAL_HALBERD);
                    entries.add(SolarisItems.OPAL_SCYTHE);


                    //Boss drops
                    entries.add(SolarisItems.DUSTWORM_LONGBOW);

                    //Storm items
                    entries.add(SolarisItems.REINFORCED_BOTTLE);
                    entries.add(SolarisItems.THUNDER_BOTTLE);

                    //Hybrid weapons
                    entries.add(SolarisItems.BLACKWIND_SPEAR);

                    //Steel items
                    entries.add(SolarisItems.STEEL_HELMET);
                    entries.add(SolarisItems.STEEL_CHESTPLATE);
                    entries.add(SolarisItems.STEEL_LEGGINGS);
                    entries.add(SolarisItems.STEEL_BOOTS);
                    entries.add(SolarisItems.STEEL);
                    entries.add(ModBlocks.STEEL_BLOCK);

                    entries.add(SolarisItems.STEEL_DAGGER);
                    entries.add(SolarisItems.STEEL_SWORD);
                    entries.add(SolarisItems.STEEL_KATANA);
                    entries.add(SolarisItems.STEEL_LONGSWORD);
                    entries.add(SolarisItems.STEEL_HALBERD);
                    entries.add(SolarisItems.STEEL_SCYTHE);
                    entries.add(SolarisItems.STEEL_SHIELD);

                    entries.add(SolarisItems.AMETHYST_HALBERD);

                    entries.add(SolarisItems.SCARLETT);
                    entries.add(SolarisItems.SCARLETT_HAZE);
                    entries.add(SolarisItems.BROKEN_SPEAR);

                    entries.add(SolarisItems.ASTRAL_FORCE);

                    entries.add(SolarisItems.TREELING_SPAWN_EGG);
                    entries.add(SolarisItems.MUSHLING_SPAWN_EGG);

                })
                .build());


    public static void registerItemGroups() {
        TelumSolaris.LOGGER.info("registering Item Groups for " + TelumSolaris.MOD_ID);}
}
