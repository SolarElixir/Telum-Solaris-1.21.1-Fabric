package net.solarelixir.solaris.item.custom;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.item.ModItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials extends CustomTooltips {
    public static final RegistryEntry<ArmorMaterial> STEEL_ARMOR_MATERIAL = registerArmorMaterial("steel",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 8);
            }), 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.STEEL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "steel"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> JADE_ARMOR_MATERIAL = registerArmorMaterial("jade",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 7);
                map.put(ArmorItem.Type.BODY, 12);
            }), 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.JADE_TOKEN),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "jade"))), 4,1.25f));

 public static final RegistryEntry<ArmorMaterial> ENERGIZED_JADE_ARMOR_MATERIAL = registerArmorMaterial("energized_jade",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 7);
                map.put(ArmorItem.Type.BODY, 12);
            }), 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.JADE_TOKEN),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "energized_jade"))), 4,1.25f));

    public static final RegistryEntry<ArmorMaterial> RUBY_ARMOR_MATERIAL = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 10);
            }), 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.RUBY_TOKEN),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "ruby"))), 4, 1.25f));

    public static final RegistryEntry<ArmorMaterial> ONYX_ARMOR_MATERIAL = registerArmorMaterial("onyx",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 9);
                    }), 19, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.ONYX_TOKEN),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "onyx"))), 2, 0.75f));

    public static final RegistryEntry<ArmorMaterial> TOPAZ_ARMOR_MATERIAL = registerArmorMaterial("topaz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 10);
            }), 24, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TOPAZ_TOKEN),
                    List.of(new ArmorMaterial.Layer(Identifier.of(TelumSolaris.MOD_ID, "topaz"))), 4, 1f));

    public ModArmorMaterials(String itemName) {
        super(itemName);
    }

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(TelumSolaris.MOD_ID, name), material.get());
    }
}
