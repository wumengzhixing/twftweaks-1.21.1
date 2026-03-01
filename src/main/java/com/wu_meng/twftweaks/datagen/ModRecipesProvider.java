package com.wu_meng.twftweaks.datagen;

import com.wu_meng.twftweaks.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;


import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ASHES_SWORD)
                .pattern(" * ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', ModItems.ASHES_INGOT)
                .define('*', Items.STICK)
                .unlockedBy(getHasName(ModItems.ASHES_INGOT), has(ModItems.ASHES_INGOT))
                .save(recipeOutput);

    }
}