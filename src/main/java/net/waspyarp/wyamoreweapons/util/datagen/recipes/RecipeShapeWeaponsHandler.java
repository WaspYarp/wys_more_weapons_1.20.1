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
    
    public static void longswordCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material1, Item material2) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("  M")
                .pattern("MM ")
                .pattern("TM ")
                .define('M', material1)
                .define('T', material2)
                .unlockedBy("has_" + material1.getDescriptionId(), has(material1))
                .unlockedBy("has_" + material2.getDescriptionId(), has(material2))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));

    }
    public static void stilettoCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item handle) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern(" M ")
                .pattern(" M ")
                .pattern("MHM")
                .define('M', material)
                .define('H', handle)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + handle.getDescriptionId(), has(handle))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    public static void rapierCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item handle) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern(" M ")
                .pattern(" M ")
                .pattern("MHM")
                .define('M', material)
                .define('H', handle)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + handle.getDescriptionId(), has(handle))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    public static void estocCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item handle) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("  M")
                .pattern("MM ")
                .pattern("HM ")
                .define('M', material)
                .define('H', handle)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + handle.getDescriptionId(), has(handle))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }
}