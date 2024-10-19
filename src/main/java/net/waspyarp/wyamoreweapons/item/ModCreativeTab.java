package net.waspyarp.wyamoreweapons.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyamoreweapons.WYsMoreWeapons;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WYsMoreWeapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_WEAPONRY_TAB = CREATIVE_MODE_TAB.register("wyamoreweapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_RAPIER.get()))
                    .title(Component.literal("WY's Weaponry"))
                    .displayItems((pParameters, pOutput) -> {

                        /*pOutput.accept(ModItems.ANCIENT_CROWN.get());
                        pOutput.accept(ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE.get());*/

                        //weapons
                        pOutput.accept(ModItems.IRON_STILETTO.get());
                        pOutput.accept(ModItems.DIAMOND_STILETTO.get());
                        pOutput.accept(ModItems.NETHERITE_STILETTO.get());

                        pOutput.accept(ModItems.IRON_RAPIER.get());
                        pOutput.accept(ModItems.DIAMOND_RAPIER.get());
                        pOutput.accept(ModItems.NETHERITE_RAPIER.get());

                        pOutput.accept(ModItems.IRON_ESTOC.get());
                        pOutput.accept(ModItems.DIAMOND_ESTOC.get());
                        pOutput.accept(ModItems.NETHERITE_ESTOC.get());

                        /*
                        pOutput.accept(ModItems.IRON_LONGSWORD.get());
                        pOutput.accept(ModItems.DIAMOND_LONGSWORD.get());
                        pOutput.accept(ModItems.NETHERITE_LONGSWORD.get());

                        pOutput.accept(ModItems.IRON_CLAYMORE.get());
                        pOutput.accept(ModItems.DIAMOND_CLAYMORE.get());
                        pOutput.accept(ModItems.NETHERITE_CLAYMORE.get());

                        pOutput.accept(ModItems.IRON_ZWEIHANDER.get());
                        pOutput.accept(ModItems.DIAMOND_ZWEIHANDER.get());
                        pOutput.accept(ModItems.NETHERITE_ZWEIHANDER.get());

                        pOutput.accept(ModItems.IRON_FLAMBERGE.get());
                        pOutput.accept(ModItems.DIAMOND_FLAMBERGE.get());
                        pOutput.accept(ModItems.NETHERITE_FLAMBERGE.get());

                        pOutput.accept(ModItems.IRON_FLANGED_MACE.get());
                        pOutput.accept(ModItems.DIAMOND_FLANGED_MACE.get());
                        pOutput.accept(ModItems.NETHERITE_FLANGED_MACE.get());

                        pOutput.accept(ModItems.IRON_SPEAR.get());
                        pOutput.accept(ModItems.DIAMOND_SPEAR.get());
                        pOutput.accept(ModItems.NETHERITE_SPEAR.get());

                        pOutput.accept(ModItems.IRON_HALBERD.get());
                        pOutput.accept(ModItems.DIAMOND_HALBERD.get());
                        pOutput.accept(ModItems.NETHERITE_HALBERD.get());

                        pOutput.accept(ModItems.IRON_LANCE.get());
                        pOutput.accept(ModItems.DIAMOND_LANCE.get());
                        pOutput.accept(ModItems.NETHERITE_LANCE.get());*/
                        // pOutput.accept(ModItems.JAVELIN.get());
/*
                        if (ModList.get().isLoaded("deeperdarker"))
                            for (RegistryObject<Item> item : DeeperDarkerCompat.ITEMS.getEntries())
                                if (item.get() instanceof Item)
                                    pOutput.accept(item.get());*/
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}