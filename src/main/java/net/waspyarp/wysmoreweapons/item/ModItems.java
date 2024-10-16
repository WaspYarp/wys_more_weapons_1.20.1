package net.waspyarp.wysmoreweapons.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.waspyarp.wysmoreweapons.WYsMoreWeapons;
import net.waspyarp.wysmoreweapons.item.custom.*;
import net.waspyarp.wysmoreweapons.item.custom.SmithingTemplateItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WYsMoreWeapons.MOD_ID);

//General Items
    public static final RegistryObject<Item> ANCIENT_CROWN = ITEMS.register("ancient_crown",
            () -> new CrownItem(new Item.Properties().durability(4).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> KING_TIER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("king_tier_upgrade_smithing_template",
            () -> new SmithingTemplateItem(new Item.Properties()));

    //Weapon item
    /*public static final RegistryObject<Item> IRON_GLADIUS = ITEMS.register("iron_gladius",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GLADIUS = ITEMS.register("diamond_gladius",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6F , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GLADIUS = ITEMS.register("netherite_gladius",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6F, new Item.Properties().fireResistant()));
    */
    public static final RegistryObject<Item> IRON_STILETTO = ITEMS.register("iron_stiletto",
            () -> new SwordItem(Tiers.IRON, 4, -2.2f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STILETTO = ITEMS.register("diamond_stiletto",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.2f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STILETTO = ITEMS.register("netherite_stiletto",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.2f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier",
            () -> new SwordItem(Tiers.IRON, 4, -2.2f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register("diamond_rapier",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.2f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register("netherite_rapier",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.2f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_ESTOC = ITEMS.register("iron_estoc",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ESTOC = ITEMS.register("diamond_estoc",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ESTOC = ITEMS.register("netherite_estoc",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_CLAYMORE = ITEMS.register("iron_claymore",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CLAYMORE = ITEMS.register("diamond_claymore",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_CLAYMORE = ITEMS.register("netherite_claymore",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_ZWEIHANDER = ITEMS.register("iron_zweihander",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ZWEIHANDER = ITEMS.register("diamond_zweihander",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ZWEIHANDER = ITEMS.register("netherite_zweihander",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_FLAMBERGE = ITEMS.register("iron_flamberge",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FLAMBERGE = ITEMS.register("diamond_flamberge",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_FLAMBERGE = ITEMS.register("netherite_flamberge",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_FLANGED_MACE = ITEMS.register("iron_flanged_mace",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FLANGED_MACE = ITEMS.register("diamond_flanged_mace",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_FLANGED_MACE = ITEMS.register("netherite_flanged_mace",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_PIKE = ITEMS.register("iron_pike",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PIKE = ITEMS.register("diamond_pike",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PIKE = ITEMS.register("netherite_pike",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_LANCE = ITEMS.register("iron_lance",
            () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LANCE = ITEMS.register("diamond_lance",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_LANCE = ITEMS.register("netherite_lance",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f , new Item.Properties().fireResistant()));

//public static final RegistryObject<Item> JAVELIN = ITEMS.register("javelin",
 //           () -> new TridentItem(new Item.Properties()));




    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
