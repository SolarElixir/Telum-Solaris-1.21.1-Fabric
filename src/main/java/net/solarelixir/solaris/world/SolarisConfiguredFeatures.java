package net.solarelixir.solaris.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.block.ModBlocks;

import java.util.List;

public class SolarisConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ONYX_ORE_KEY = registerKey("onyx_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registerKey("opal_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> rubyOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> jadeOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> topazOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> onyxOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_ONYX_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> sapphireOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> opalOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));


        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(rubyOre, 3));
        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(jadeOre, 3));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(topazOre, 3));
        register(context, ONYX_ORE_KEY, Feature.ORE, new OreFeatureConfig(onyxOre, 3));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(sapphireOre, 3));
        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(opalOre, 3));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TelumSolaris.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
