package net.solarelixir.solaris.util;


import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.component.SolarisDataComponentTypes;
import net.solarelixir.solaris.item.SolarisItems;

public class SolarisModelPredicates {
    public static void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(SolarisItems.JADE_CHISEL, Identifier.of(TelumSolaris.MOD_ID, "used"),
                ((stack, world, entity, seed) ->
                        stack.get(SolarisDataComponentTypes.COORDINATES) != null ? 0f : 1f));
        registerCustomBow(SolarisItems.LONGBOW);
        registerCustomBow(SolarisItems.DUSTWORM_LONGBOW);
        registerCustomBow(SolarisItems.WOODLAND_BOW);
    }

    private static void registerCustomBow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"),
                (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            } else {
                return entity.getActiveItem() != stack ? 0.0f : (stack.getMaxUseTime(entity) -
                        entity.getItemUseTimeLeft()) / 20.0f;
            }
        });
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f
        );
    }
}


