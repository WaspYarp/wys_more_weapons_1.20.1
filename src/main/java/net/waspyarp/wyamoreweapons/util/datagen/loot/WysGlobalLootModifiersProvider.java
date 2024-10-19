package net.waspyarp.wyamoreweapons.util.datagen.loot;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import net.waspyarp.wyamoreweapons.WYsMoreWeapons;
import net.waspyarp.wyamoreweapons.item.ModItems;

public class WysGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public WysGlobalLootModifiersProvider(PackOutput output) {
        super(output, WYsMoreWeapons.MOD_ID);
    }

    @Override
    protected void start() {
        add("ancient_crown_from_desert_pyramid", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() }, ModItems.ANCIENT_CROWN.get()));

        add("ancient_crown_from_desert_well", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build() }, ModItems.ANCIENT_CROWN.get()));

        add("ancient_crown_from_ocean_ruin_cold", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_cold")).build() }, ModItems.ANCIENT_CROWN.get()));

        add("ancient_crown_from_ocean_ruin_warm", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_warm")).build() }, ModItems.ANCIENT_CROWN.get()));

        add("ancient_crown_from_trail_ruins_common", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/trail_ruins_common")).build() }, ModItems.ANCIENT_CROWN.get()));

        add("ancient_crown_from_trail_ruins_rare", new AddSusBlocksItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/trail_ruins_rare")).build() }, ModItems.ANCIENT_CROWN.get()));
    }
}