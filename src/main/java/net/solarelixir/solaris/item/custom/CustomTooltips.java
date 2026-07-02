package net.solarelixir.solaris.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.solarelixir.solaris.item.SolarisItems;

import java.util.List;

public class CustomTooltips {

    List<Item> hasTooltip = List.of(
            SolarisItems.BLACKWIND_SPEAR
    );

    private final String itemName;
    public CustomTooltips(String itemName) {
        this.itemName = itemName;
    }

    public void appendTooltip(ItemStack stack, List<Text> tooltip) {
        if (stack.getItem() == hasTooltip) {
            if(!Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.solaris.no_shift"));
            } else {
                for (int i = 0; ; i++){
                    String key = "tooltip.solaris." + itemName + i;
                    Text line = Text.translatable(key);
                    if (line.getString().equals(key)) break;
                    tooltip.add(line);
                }
            }
        }
    }
}