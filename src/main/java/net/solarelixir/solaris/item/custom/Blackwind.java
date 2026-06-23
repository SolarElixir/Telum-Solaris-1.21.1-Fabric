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
    public Blackwind(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            if (player.getMainHandStack() == stack) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 3, true, false));
            }
        }
    }
}