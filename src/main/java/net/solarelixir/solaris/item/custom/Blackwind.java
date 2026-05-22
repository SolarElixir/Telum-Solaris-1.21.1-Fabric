package net.solarelixir.solaris.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class Blackwind extends Item {
    private final CustomTooltips itemTooltipHelper;
    public Blackwind(Settings settings) {
        super(settings);
        this.itemTooltipHelper = new CustomTooltips("blackwind");
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            boolean isHeld = player.getMainHandStack() == stack;
            if (isHeld) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1, 3, true, false));
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type){
        itemTooltipHelper.appendTooltip(stack, tooltip);
        super.appendTooltip(stack, context, tooltip, type);
    }

}