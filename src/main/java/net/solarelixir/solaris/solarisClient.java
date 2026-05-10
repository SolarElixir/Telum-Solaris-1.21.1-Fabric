package net.solarelixir.solaris;

import net.fabricmc.api.ClientModInitializer;
import net.solarelixir.solaris.util.ModModelPredicates;

public class solarisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();
    }
}
