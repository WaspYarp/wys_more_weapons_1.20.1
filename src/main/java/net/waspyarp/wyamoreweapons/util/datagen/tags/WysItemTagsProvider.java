package net.waspyarp.wyamoreweapons.util.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.waspyarp.wyamoreweapons.WYsMoreWeapons;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WysItemTagsProvider extends ItemTagsProvider {
    public WysItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, TagsProvider<Block> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookup, blockTags.contentsGetter(), WYsMoreWeapons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        tag(WysTags.TEMPLATE_ITEMS);
        tag(WysTags.KING_ARMOR_SETS);
    }
}