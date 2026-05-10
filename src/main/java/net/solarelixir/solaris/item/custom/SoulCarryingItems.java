package net.solarelixir.solaris.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.component.SoulStoringCodec;
import net.solarelixir.solaris.util.ModTags;

public class SoulCarryingItems extends SwordItem {
    public SoulCarryingItems(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.postHit(stack, target, attacker);
        if ((target.getHealth() <= 0.0F || !target.isAlive())
                && stack.isIn(ModTags.Items.KILL_COUNTING_ITEMS)) {
            SoulStoringCodec data = stack.get(ModDataComponentTypes.SOUL_INVENTORY_INFO);
            SoulStoringCodec updated = (data == null)
                    ? new SoulStoringCodec(true, 1, 10000)
                    : data.addKill();
            stack.set(ModDataComponentTypes.SOUL_INVENTORY_INFO, updated);
        }
        return result;
    }


    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (stack.get(ModDataComponentTypes.SOUL_INVENTORY_INFO) == null) {
                stack.set(ModDataComponentTypes.SOUL_INVENTORY_INFO, new SoulStoringCodec(true, 0, 10000));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
