package net.waspyarp.wyamoreweapons.util.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.waspyarp.wyamoreweapons.WYsMoreWeapons;
import net.waspyarp.wyamoreweapons.util.datagen.loot.WysGlobalLootModifiersProvider;
import net.waspyarp.wyamoreweapons.util.datagen.recipes.WysRecipeProvider;
import net.waspyarp.wyamoreweapons.util.datagen.tags.WysBlockTagsProvider;
import net.waspyarp.wyamoreweapons.util.datagen.tags.WysItemTagsProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = WYsMoreWeapons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new WysItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new WysRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new WysGlobalLootModifiersProvider(packOutput));
        generator.addProvider(event.includeServer(), new ForgeAdvancementProvider(packOutput, lookupProvider, existingFileHelper, List.of(new WysAdvancementsProvider())));


        WysBlockTagsProvider blockTags = new WysBlockTagsProvider(packOutput, event.getLookupProvider(), existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new WysItemTagsProvider(packOutput, event.getLookupProvider(), blockTags, existingFileHelper));
    }
}