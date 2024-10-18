package net.waspyarp.wysmoreweapons.util.armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GenericCustomArmorRenderer<T extends Item & GeoItem> extends GeoArmorRenderer<T> {

    @Override
    public ResourceLocation getTextureLocation(T animatable) {
        return super.getTextureLocation(animatable);
    }

    public GenericCustomArmorRenderer(GeoModel<T> model) {
        super(model);

    }
}