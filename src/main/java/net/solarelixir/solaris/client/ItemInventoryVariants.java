package net.solarelixir.solaris.client;

import net.minecraft.item.Item;
import net.solarelixir.solaris.item.SolarisItems;

import java.util.ArrayList;
import java.util.List;


public final class ItemInventoryVariants {
    /**
    *Has an icon in first person
    */
    public static final List<Item> HasIconFirstPerson;
    /**
     *Has an icon in first and third person
     */
    public static final List<Item> HasIconThirdPerson = List.of(
            SolarisItems.MUSH_HELM
    );

    static {
        List<Item> Items = new ArrayList<>(List.of(
                SolarisItems.OPAL_LONGSWORD, SolarisItems.OPAL_HALBERD,
                SolarisItems.JADE_GREATSWORD, SolarisItems.JADE_HALBERD,
                SolarisItems.ONYX_GREATSWORD, SolarisItems.ONYX_HALBERD,
                SolarisItems.TOPAZ_GREATSWORD, SolarisItems.TOPAZ_HALBERD,
                SolarisItems.RUBY_LONGSWORD, SolarisItems.RUBY_HALBERD,
                SolarisItems.SAPPHIRE_LONGSWORD, SolarisItems.SAPPHIRE_HALBERD,
                SolarisItems.DIAMOND_LONGSWORD, SolarisItems.DIAMOND_HALBERD,
                SolarisItems.STEEL_LONGSWORD, SolarisItems.STEEL_HALBERD,
                SolarisItems.IRON_LONGSWORD, SolarisItems.IRON_HALBERD,
                SolarisItems.WOODLAND_LONGSWORD
        ));
        Items.addAll(HasIconThirdPerson);

        HasIconFirstPerson = List.copyOf(Items);
    }
}
