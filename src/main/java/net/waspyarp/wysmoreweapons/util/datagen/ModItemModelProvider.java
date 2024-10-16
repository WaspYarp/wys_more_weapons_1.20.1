package net.waspyarp.wysmoreweapons.util.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import net.waspyarp.wysmoreweapons.WYsMoreWeapons;
import net.waspyarp.wysmoreweapons.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WYsMoreWeapons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //GENERAL ITEMS
        simpleItem(ModItems.ANCIENT_CROWN);
        simpleItem(ModItems.KING_TIER_UPGRADE_SMITHING_TEMPLATE);



    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WYsMoreWeapons.MOD_ID,"item/" + item.getId().getPath()));
    }
}
