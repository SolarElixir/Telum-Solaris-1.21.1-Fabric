package net.solarelixir.solaris.util;


import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.item.ModItems;

public class ModModelPredicates{
    public static void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(ModItems.JADE_CHISEL, Identifier.of(TelumSolaris.MOD_ID, "used"),
                ((stack, world, entity, seed) ->
                        stack.get(ModDataComponentTypes.COORDINATES) != null ? 0f : 1f));
        registerCustomLongbow(ModItems.LONGBOW);
        registerCustomLongbow(ModItems.DUSTWORM_LONGBOW);
    }

    private static void registerCustomLongbow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"),
                (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem() != stack ? 0.0F : (stack.getMaxUseTime(entity) -
                        entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
        );
    }
}


