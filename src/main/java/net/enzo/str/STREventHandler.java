package net.enzo.str;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.enzo.str.config.Config;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class STREventHandler {
    @SubscribeEvent
    public void renderTooltip(ItemTooltipEvent event) {
        if (event.itemStack.getItem() instanceof Item) {
            if (GuiScreen.isShiftKeyDown() && Config.isShift) {
                Item itemEvent = event.itemStack.getItem();
                event.toolTip.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("gui.rarity")+ EnumChatFormatting.RESET + " " + itemEvent.getRarity(new ItemStack(itemEvent)).rarityColor + itemEvent.getRarity(new ItemStack(itemEvent)).rarityName);
            } else if (!Config.isShift) {
                Item itemEvent = event.itemStack.getItem();
                event.toolTip.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("gui.rarity")+ EnumChatFormatting.RESET + " " + itemEvent.getRarity(new ItemStack(itemEvent)).rarityColor + itemEvent.getRarity(new ItemStack(itemEvent)).rarityName);
            } else {
                event.toolTip.add(StatCollector.translateToLocal("tip.SHIFT"));
            }
        }
    }
}
