package net.solarelixir.solaris.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.solarelixir.solaris.TelumSolaris;

import java.util.List;

public class SolarisPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> ONYX_ORE_PLACED_KEY = registerKey("onyx_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.RUBY_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.JADE_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.TOPAZ_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

        register(context, ONYX_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.ONYX_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.SAPPHIRE_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

       register(context, OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(SolarisConfiguredFeatures.OPAL_ORE_KEY),
                SolarisOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(TelumSolaris.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
