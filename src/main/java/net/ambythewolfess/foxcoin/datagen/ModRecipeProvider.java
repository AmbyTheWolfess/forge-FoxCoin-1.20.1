package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.ambythewolfess.foxcoin.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(),
            ModBlocks.SILVER_ORE.get(),ModBlocks.DEEPSLATE_SILVER_ORE.get());

    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),
            ModBlocks.PLATINUM_ORE.get(),ModBlocks.DEEPSLATE_PLATINUM_ORE.get());

    private static final List<ItemLike> ROSEGOLD_SMELTABLES = List.of(ModItems.RAW_ROSEGOLD.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1f, 200, "silver_ingot");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1f, 100, "silver_ingot");

        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 1f, 200, "platinum_ingot");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 1f, 100, "platinum_ingot");

        oreSmelting(pWriter, ROSEGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSEGOLD_INGOT.get(), 1f, 200, "rosegold_ingot");
        oreBlasting(pWriter, ROSEGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSEGOLD_INGOT.get(), 1f, 100, "rosegold_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9)
                .requires(ModBlocks.RAW_SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SILVER_BLOCK.get()), has(ModBlocks.RAW_SILVER_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSEGOLD_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ROSEGOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSEGOLD_INGOT.get()), has(ModItems.ROSEGOLD_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSEGOLD_INGOT.get(), 9)
                .requires(ModBlocks.ROSEGOLD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROSEGOLD_BLOCK.get()), has(ModBlocks.ROSEGOLD_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ROSEGOLD_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_ROSEGOLD.get())
                .unlockedBy(getHasName(ModItems.RAW_ROSEGOLD.get()), has(ModItems.RAW_ROSEGOLD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAW_ROSEGOLD.get(), 4)
                .pattern("SS")
                .pattern("SX")
                .define('S', Items.RAW_GOLD)
                .define('X', Items.RAW_COPPER)
                .unlockedBy(getHasName(Items.RAW_COPPER), has(Items.RAW_COPPER))
                .unlockedBy(getHasName(Items.RAW_GOLD), has(Items.RAW_GOLD))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ROSEGOLD.get(), 9)
                .requires(ModBlocks.RAW_ROSEGOLD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ROSEGOLD_BLOCK.get()), has(ModBlocks.RAW_ROSEGOLD_BLOCK.get()))
                .save(pWriter, "raw_rosegold_from_raw_rosegold_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.get()), has(ModBlocks.PLATINUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_PLATINUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PLATINUM.get()), has(ModItems.RAW_PLATINUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(), 9)
                .requires(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_PLATINUM_BLOCK.get()), has(ModBlocks.RAW_PLATINUM_BLOCK.get()))
                .save(pWriter);



        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.COPPER_INGOT),
                RecipeCategory.MISC,
                ModItems.COPPERCOIN.get(),
                1
        )
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.SILVER_INGOT.get()),
                        RecipeCategory.MISC,
                        ModItems.SILVERCOIN.get(),
                        1
                )
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.ROSEGOLD_INGOT.get()),
                        RecipeCategory.MISC,
                        ModItems.ROSEGOLDCOIN.get(),
                        1
                )
                .unlockedBy(getHasName(ModItems.ROSEGOLD_INGOT.get()), has(ModItems.ROSEGOLD_INGOT.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.GOLD_INGOT),
                        RecipeCategory.MISC,
                        ModItems.GOLDCOIN.get(),
                        1
                )
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.PLATINUM_INGOT.get()),
                        RecipeCategory.MISC,
                        ModItems.PLATINUMCOIN.get(),
                        1
                )
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.NETHERITECOIN.get(),
                        1
                )
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(pWriter);
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, FoxCoin.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
