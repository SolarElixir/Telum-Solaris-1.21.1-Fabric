package net.solarelixir.solaris.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public class CustomTooltips {

    private final String itemName;
    public CustomTooltips(String itemName) {
        this.itemName = itemName;
    }
    public void appendTooltip(ItemStack stack, List<Text> tooltip) {
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