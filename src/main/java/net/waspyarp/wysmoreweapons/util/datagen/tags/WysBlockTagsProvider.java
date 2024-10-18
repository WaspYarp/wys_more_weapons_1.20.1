package net.waspyarp.wysmoreweapons.util.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.waspyarp.wysmoreweapons.WYsMoreWeapons;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WysBlockTagsProvider extends BlockTagsProvider {
    public WysBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WYsMoreWeapons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {

    }
}