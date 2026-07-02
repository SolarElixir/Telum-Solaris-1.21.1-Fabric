package net.solarelixir.solaris.item.custom;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.solarelixir.solaris.item.SolarisItems;
import net.solarelixir.solaris.util.SolarisTags;

import java.util.function.Supplier;

public enum SolarisToolMaterials implements ToolMaterial {
    
    JADE(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0F, 6.0F, 19, () ->
            Ingredient.ofItems(SolarisItems.JADE_TOKEN)),

    ONYX(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0F, 6.0F, 19, () ->
            Ingredient.ofItems(SolarisItems.ONYX_TOKEN)),

    RUBY(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2560, 10.0f, 7.0f, 19, () ->
            Ingredient.ofItems(SolarisItems.RUBY_TOKEN)),

    ENERGIZED_JADE(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            2880, 10.0f, 8.0f, 21, () ->
            Ingredient.ofItems(SolarisItems.JADE_TOKEN)),

    TOPAZ(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            3200, 10.0f, 5.0f, 24, () ->
            Ingredient.ofItems(SolarisItems.TOPAZ_TOKEN)),

    SAPPHIRE(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            3200, 10.0f, 5.0f, 19, () ->
            Ingredient.ofItems(SolarisItems.SAPPHIRE_TOKEN)),

    OPAL(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            1280, 10.0f, 8.0f, 14, () ->
            Ingredient.ofItems(SolarisItems.OPAL_TOKEN)),

    STEEL(SolarisTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            1024, 7.0f, 2.5F, 14, () ->
            Ingredient.ofItems(SolarisItems.STEEL)),
    
    RELIC(SolarisTags.Blocks.INCORRECT_FOR_NETHERITE_TOOLS,
            5120, 12.0f, 8.0f, 20, () ->
            Ingredient.ofItems(SolarisItems.JADE_TOKEN)), //PLACEHOLDER

    WOODLAND(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            265, 3.0f, 3.5f, 25, () ->
            Ingredient.ofItems(SolarisItems.WOODLAND_BARK))

    ;


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    SolarisToolMaterials(
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
