package net.waspyarp.wyamoreweapons.util.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.waspyarp.wyamoreweapons.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class WysRecipeProvider extends RecipeProvider {

    public WysRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        RecipeShapeWeaponsHandler.swordToLongerCrafting(consumer, ModItems.IRON_LONGSWORD.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.IRON_SWORD);
        RecipeShapeWeaponsHandler.swordToLongerCrafting(consumer, ModItems.DIAMOND_LONGSWORD.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.DIAMOND_SWORD);
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_LONGSWORD.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_LONGSWORD.get());

        RecipeShapeWeaponsHandler.stilettoCrafting(consumer, ModItems.IRON_STILETTO.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.STICK);
        RecipeShapeWeaponsHandler.stilettoCrafting(consumer, ModItems.DIAMOND_STILETTO.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.STICK);
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_STILETTO.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_STILETTO.get());

        RecipeShapeWeaponsHandler.swordToLongerCrafting(consumer, ModItems.IRON_RAPIER.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.IRON_STILETTO.get());
        RecipeShapeWeaponsHandler.swordToLongerCrafting(consumer, ModItems.DIAMOND_RAPIER.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.DIAMOND_STILETTO.get());
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_RAPIER.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_RAPIER.get());

        RecipeShapeWeaponsHandler.swordToBiggerCrafting(consumer, ModItems.IRON_ESTOC.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.IRON_STILETTO.get());
        RecipeShapeWeaponsHandler.swordToBiggerCrafting(consumer, ModItems.DIAMOND_ESTOC.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.DIAMOND_STILETTO.get());
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_ESTOC.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_ESTOC.get());

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        RecipeShapeArmorsHandler.kingUpgradeCrafting(consumer, ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE.get(), 4, RecipeCategory.MISC, ModItems.ANCIENT_CROWN.get(), Items.CALCITE, Items.GOLD_BLOCK);

    }
}