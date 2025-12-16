package net.ambythewolfess.foxcoin.worldgen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = resourceKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = resourceKey("add_platinum_ore");


    public static void bootstrap(BootstapContext<BiomeModifier> context){
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SILVER_ORE,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SILVER_ORE_PLACE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PLATINUM_ORE,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLATINUM_ORE_PLACE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    public static ResourceKey<BiomeModifier> resourceKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(FoxCoin.MOD_ID, name));
    }
}
