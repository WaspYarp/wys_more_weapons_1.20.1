package net.waspyarp.wyamoreweapons.util.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeShapeWeaponsHandler extends RecipeProvider {

    public RecipeShapeWeaponsHandler(PackOutput pOutput) {
        super(pOutput);}
    

    public static void stilettoCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item handle) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("   ")
                .pattern(" M ")
                .pattern("H  ")
                .define('M', material)
                .define('H', handle)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + handle.getDescriptionId(), has(handle))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    public static void swordToLongerCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item sword) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', material)
                .define('S', sword)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + sword.getDescriptionId(), has(sword))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));

    }
    public static void swordToBiggerCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item sword) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern(" M ")
                .pattern(" M ")
                .pattern("MSM")
                .define('M', material)
                .define('S', sword)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + sword.getDescriptionId(), has(sword))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }
}