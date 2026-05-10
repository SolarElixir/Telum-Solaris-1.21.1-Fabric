package net.solarelixir.solaris.item.custom;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.util.ModTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    
    JADE(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0F, 6.0F, 19, () ->
            Ingredient.ofItems(ModItems.JADE_TOKEN)),

    ONYX(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0F, 6.0F, 19, () ->
            Ingredient.ofItems(ModItems.ONYX_TOKEN)),

    RUBY(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0f, 7.0f, 19, () ->
            Ingredient.ofItems(ModItems.RUBY_TOKEN)),

    ENERGIZED_JADE(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2880, 10.0f, 8.0f, 21, () ->
            Ingredient.ofItems(ModItems.JADE_TOKEN)),

    TOPAZ(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            3200, 10.0f, 5.0f, 24, () ->
            Ingredient.ofItems(ModItems.TOPAZ_TOKEN)),

    STEEL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            1024, 7.0f, 2.0F, 14, () ->
            Ingredient.ofItems(ModItems.STEEL))

    ;


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }}
