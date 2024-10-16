package net.waspyarp.wysmoreweapons.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.waspyarp.wysmoreweapons.WYsMoreWeapons;
import net.waspyarp.wysmoreweapons.util.datagen.loot.ModGlobalLootModifiersProvider;
import net.waspyarp.wysmoreweapons.util.datagen.recipes.ModRecipeProvider;

import java.util.List;

@Mod.EventBusSubscriber(modid = WYsMoreWeapons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new ModGlobalLootModifiersProvider(packOutput));
        generator.addProvider(event.includeServer(), new ForgeAdvancementProvider(packOutput, event.getLookupProvider(), existingFileHelper, List.of(new ModAdvancementsProvider())));


    }
}