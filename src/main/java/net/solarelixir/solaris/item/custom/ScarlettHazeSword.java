package net.solarelixir.solaris.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;


public class ScarlettHazeSword extends SwordItem {


    public ScarlettHazeSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player){
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

