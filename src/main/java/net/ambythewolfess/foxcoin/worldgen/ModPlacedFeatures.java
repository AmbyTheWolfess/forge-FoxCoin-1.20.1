package net.ambythewolfess.foxcoin.worldgen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;


public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACE_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACE_KEY = registerKey("platinum_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(14,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(64))));

        register(context, PLATINUM_ORE_PLACE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(14))));

    }


private static ResourceKey<PlacedFeature> registerKey(String name) {
    return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FoxCoin.MOD_ID, name));
}

private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                             List<PlacementModifier> modifiers) {
    context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
}
}