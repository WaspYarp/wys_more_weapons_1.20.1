package net.waspyarp.wyamoreweapons.util.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class RecipeShapeArmorsHandler extends RecipeProvider {

    public RecipeShapeArmorsHandler(PackOutput pOutput) {
        super(pOutput);}

    public static void templateCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item paper, Item material1, Item material2, Item material3, @Nullable String group) {
        ShapelessRecipeBuilder.shapeless(category, result)
                .requires(paper)
                .requires(material1)
                .requires(material2)
                .requires(material3)
                .group(group)
                .unlockedBy("has_" + paper.getDescriptionId(), has(paper))
                .unlockedBy("has_" + material1.getDescriptionId(), has(material1))
                .unlockedBy("has_" + material2.getDescriptionId(), has(material2))
                .unlockedBy("has_" + material3.getDescriptionId(), has(material3))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    //-ARMOR-RECIPES--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void helmetArmorCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item template, @Nullable String group) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("MMM")
                .pattern("MTM")
                .pattern("   ")
                .define('M', material)
                .define('T', template)
                .group(group)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + template.getDescriptionId(), has(template))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));

    }
    public static void chestplateArmorCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item template, @Nullable String group) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("MTM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', material)
                .define('T', template)
                .group(group)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + template.getDescriptionId(), has(template))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    public static void leggingsArmorCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item template, @Nullable String group) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("MMM")
                .pattern("MTM")
                .pattern("M M")
                .define('M', material)
                .define('T', template)
                .group(group)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + template.getDescriptionId(), has(template))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));
    }
    public static void kingUpgradeCrafting(Consumer<FinishedRecipe> consumer, Item result, int resultCount, RecipeCategory category,Item crown, Item material1, Item material2) {
        ShapedRecipeBuilder.shaped(category, result, resultCount)
                .pattern("PGP")
                .pattern("GCG")
                .pattern("PGP")
                .define('C', crown)
                .define('P', material1)
                .define('G', material2)
                .unlockedBy("has_" + crown.getDescriptionId(), has(crown))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));

    }
    //-EXTRA-RECIPES--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void shapelessConversionCraft(Consumer<FinishedRecipe> consumer, Item result, int resultCount, RecipeCategory category, Item material, Item template,@Nullable String group) {
        ShapelessRecipeBuilder.shapeless(category, result, resultCount)
                .requires(material)
                .requires(template)
                .group(group)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + template.getDescriptionId(), has(template))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting_shapeless"));
    }
    public static void bootsArmorCrafting(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item material, Item template, @Nullable String group) {
        ShapedRecipeBuilder.shaped(category, result)
                .pattern("M M")
                .pattern("MTM")
                .pattern("   ")
                .define('M', material)
                .define('T', template)
                .group(group)
                .unlockedBy("has_" + material.getDescriptionId(), has(material))
                .unlockedBy("has_" + template.getDescriptionId(), has(template))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_crafting"));

    }
    public static void modNetheriteSmithing(Consumer<FinishedRecipe> consumer, Item result, RecipeCategory category, Item ingredient) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ingredient), Ingredient.of(Items.NETHERITE_INGOT), category, result)
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_smithing"));
    }
    /*
    public static void kingSmithing(Consumer<FinishedRecipe> consumer, Item ingredient, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.KING_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(ingredient), Ingredient.of(Items.GOLD_BLOCK), category, result)
                .unlocks("has_king_upgrade_smithing_template", has(Items.GOLD_BLOCK))
                .save(consumer, new ResourceLocation("minecraft", getItemName(result) + "_smithing"));
    }*/

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }
}