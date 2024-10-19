package net.waspyarp.wyamoreweapons.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmithingTemplateItem extends Item {
    public SmithingTemplateItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.literal("(WIP)").withStyle(ChatFormatting.RED));

        /*if (ModList.get().isLoaded("mod_id")) {
            pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.upgrade_description").withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(CommonComponents.EMPTY);
            pTooltipComponents.add(Component.translatable("item.minecraft.smithing_template.applies_to").withStyle(ChatFormatting.GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.upgrade_applies_to").withStyle(ChatFormatting.BLUE));
            pTooltipComponents.add(Component.translatable("item.minecraft.smithing_template.ingredients").withStyle(ChatFormatting.GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.upgrade_ingredients").withStyle(ChatFormatting.BLUE));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.plis_download_my_other_mods").withStyle(ChatFormatting.BLUE));
            if (Screen.hasShiftDown()) {
                pTooltipComponents.add(Component.literal("WY's Armors: Deus Vult").withStyle(ChatFormatting.GRAY));//delete "Deus Vult"
                //pTooltipComponents.add(Component.literal(" Deus Vult").withStyle(ChatFormatting.GRAY));
            } else {
                pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.shift_hint").withStyle(ChatFormatting.GRAY));
            }
        }*/

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
