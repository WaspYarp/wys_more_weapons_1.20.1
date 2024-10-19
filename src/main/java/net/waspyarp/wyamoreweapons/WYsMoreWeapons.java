package net.waspyarp.wyamoreweapons;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.waspyarp.wyamoreweapons.item.ModCreativeTab;
import net.waspyarp.wyamoreweapons.item.ModItems;
import net.waspyarp.wyamoreweapons.util.datagen.loot.WysLootModifiers;

import org.slf4j.Logger;


@Mod(WYsMoreWeapons.MOD_ID)
public class WYsMoreWeapons {
    public static final String MOD_ID = "wyamoreweapons";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WYsMoreWeapons() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModCreativeTab.register(modEventBus);
        ModItems.register(modEventBus);

        WysLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        /*if (ModList.get().isLoaded("deeperdarker")) {
            DeeperDarkerCompat.register(modEventBus);
        }*/



    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}