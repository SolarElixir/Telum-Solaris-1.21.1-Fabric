package net.solarelixir.solaris.item.custom;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.component.SoulStoringCodec;
import net.solarelixir.solaris.util.ModTags;
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
        if (stack.isIn(ModTags.Items.KILL_COUNTING_ITEMS)) {
            SoulStoringCodec data = stack.get(ModDataComponentTypes.SOUL_INVENTORY_INFO);
            if (data != null && data.canStoreSouls()) {
                tooltip.add(Text.translatable("tooltip.solaris.souls_stored",
                        Text.literal(String.valueOf(data.getCurrentSoulsStored())).formatted(Formatting.AQUA),
                        Text.literal(String.valueOf(data.getMaxSouls())).formatted(Formatting.DARK_AQUA)));
            }
        }
    }
}