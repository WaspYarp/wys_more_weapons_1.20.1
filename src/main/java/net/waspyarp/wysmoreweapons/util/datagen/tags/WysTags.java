package net.waspyarp.wysmoreweapons.util.datagen.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.waspyarp.wysmoreweapons.WYsMoreWeapons;

public class WysTags {
    public static final TagKey<Item> TEMPLATE_ITEMS = tag("template_items");
    public static final TagKey<Item> KING_ARMOR_SETS = tag("king_armor_sets");


    private static TagKey<Item> tag(String name) {
        return TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(WYsMoreWeapons.MOD_ID, name));
    }
}