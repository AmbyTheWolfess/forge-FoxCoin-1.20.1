package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FoxCoin.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_BLOCK.get(),
                    ModBlocks.ROSEGOLD_BLOCK.get(),
                    ModBlocks.PLATINUM_BLOCK.get(),
                    ModBlocks.RAW_ROSEGOLD_BLOCK.get(),
                    ModBlocks.RAW_SILVER_BLOCK.get(),
                    ModBlocks.RAW_PLATINUM_BLOCK.get(),
                    ModBlocks.SILVER_ORE.get(),
                    ModBlocks.PLATINUM_ORE.get(),
                    ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                    ModBlocks.DEEPSLATE_PLATINUM_ORE.get()
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.ROSEGOLD_BLOCK.get(),
                        ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.RAW_ROSEGOLD_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get()
                );
    }
}
