package net.waspyarp.wysmoreweapons.util.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.waspyarp.wysmoreweapons.WYsMoreWeapons;
import net.waspyarp.wysmoreweapons.item.ModItems;
import net.waspyarp.wysmoreweapons.util.datagen.tags.WysTags;


import java.util.function.Consumer;

public class WysAdvancementsProvider implements ForgeAdvancementProvider.AdvancementGenerator {

    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        String id = "advancements." + WYsMoreWeapons.MOD_ID + ".";

        Advancement wysArmorsRoot = Advancement.Builder.advancement()
                .display(Items.BOOK, Component.translatable(id + "root_title"), Component.translatable(id + "root_description"), new ResourceLocation("minecraft:textures/block/oak_planks.png"), FrameType.TASK, true, true, true)
                .addCriterion("template_items", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(WysTags.TEMPLATE_ITEMS).build()))
                .requirements(RequirementsStrategy.OR).save(saver, path("wys_armors_root"), existingFileHelper);

        Advancement ancientCrown = Advancement.Builder.advancement().parent(wysArmorsRoot)
                .display(ModItems.ANCIENT_CROWN.get(), Component.translatable(id + "ancient_crown_title"), Component.translatable(id + "ancient_crown_description"), null, FrameType.CHALLENGE, true, true, true)
                .addCriterion("ancient_crown", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ANCIENT_CROWN.get()))
                .save(saver, path("obtain_ancient_crown"), existingFileHelper);

        Advancement kingUpgrade = Advancement.Builder.advancement().parent(ancientCrown)
                .display(ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE.get(), Component.translatable(id + "king_smithing_template_title"), Component.translatable(id + "king_smithing_template_description"), null, FrameType.GOAL, true, true, true)
                .addCriterion("king_smithing_template", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE.get()))
                .requirements(RequirementsStrategy.OR).save(saver, path("obtain_king_smithing_template"), existingFileHelper);

    }
        private ResourceLocation path(String name) {
            return new ResourceLocation(WYsMoreWeapons.MOD_ID, "main/" + name);
        }
}