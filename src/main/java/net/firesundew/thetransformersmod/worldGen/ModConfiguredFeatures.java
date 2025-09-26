package net.firesundew.thetransformersmod.worldGen;

import net.firesundew.thetransformersmod.TransformerMod;
import net.firesundew.thetransformersmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TRASNFORMIUM_ORE_KEY = registerKey("transformium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ENERGON_ORE_KEY = registerKey("energon_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List< OreConfiguration.TargetBlockState> overworldTransformiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.TRANSFORMIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TRANSFORMIUM_ORE.get().defaultBlockState()));

        List< OreConfiguration.TargetBlockState> overworldEnergonOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ENERGON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ENERGON_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_TRASNFORMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTransformiumOres, 5));
        register(context, OVERWORLD_ENERGON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEnergonOres, 3));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(TransformerMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
