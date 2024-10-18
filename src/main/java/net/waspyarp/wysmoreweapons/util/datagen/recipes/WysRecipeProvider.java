package net.waspyarp.wysmoreweapons.util.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.waspyarp.wysmoreweapons.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class WysRecipeProvider extends RecipeProvider {

    public WysRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        /*ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.HANDGRIP_STICK.get(),4)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .define('P', Items.ACACIA_PLANKS)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);*/
        RecipeShapeWeaponsHandler.rapierCrafting(consumer, ModItems.IRON_STILETTO.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.STICK);
        RecipeShapeWeaponsHandler.rapierCrafting(consumer, ModItems.DIAMOND_STILETTO.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.STICK);
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_STILETTO.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_STILETTO.get());

        RecipeShapeWeaponsHandler.rapierCrafting(consumer, ModItems.IRON_RAPIER.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.STICK);
        RecipeShapeWeaponsHandler.rapierCrafting(consumer, ModItems.DIAMOND_RAPIER.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.STICK);
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_RAPIER.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_RAPIER.get());

        RecipeShapeWeaponsHandler.estocCrafting(consumer, ModItems.IRON_ESTOC.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.STICK);
        RecipeShapeWeaponsHandler.estocCrafting(consumer, ModItems.DIAMOND_ESTOC.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.STICK);
        RecipeShapeArmorsHandler.modNetheriteSmithing(consumer, ModItems.NETHERITE_ESTOC.get(), RecipeCategory.COMBAT, ModItems.DIAMOND_ESTOC.get());
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        RecipeShapeArmorsHandler.kingUpgradeCrafting(consumer, ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE.get(), 4, RecipeCategory.MISC, ModItems.ANCIENT_CROWN.get(), Items.CALCITE, Items.GOLD_BLOCK);

    }
}