package net.waspyarp.wyamoreweapons.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmithingTemplateItem extends Item {
    public SmithingTemplateItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.literal("(WIP)").withStyle(ChatFormatting.RED));
            /*
            pTooltipComponents.add(Component.translatable("tooltip.wyamoreweapons.king_smithing_template_upgrade_description").withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(CommonComponents.EMPTY);
            pTooltipComponents.add(Component.translatable("item.minecraft.smithing_template.applies_to").withStyle(ChatFormatting.GRAY));
            if (Screen.hasShiftDown()) {
                pTooltipComponents.add(Component.literal(" WY's Armors: Deus Vult").withStyle(ChatFormatting.BLUE));
                ///more Mods :3
            } else {
                pTooltipComponents.add(Component.translatable("tooltip.wyamoreweapons.king_smithing_template_applies_to").withStyle(ChatFormatting.BLUE));
                pTooltipComponents.add(Component.translatable("tooltip.wyamoreweapons.shift_hint").withStyle(ChatFormatting.GRAY));
            }
            pTooltipComponents.add(Component.translatable("item.minecraft.smithing_template.ingredients").withStyle(ChatFormatting.GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.wyamoreweapons.king_smithing_template_ingredients").withStyle(ChatFormatting.BLUE));
*/

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}