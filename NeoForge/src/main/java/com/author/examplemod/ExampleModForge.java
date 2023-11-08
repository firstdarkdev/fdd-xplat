package com.author.examplemod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@Mod(ModConstants.MOD_ID)
public class ExampleModForge {

    public ExampleModForge(IEventBus modEventBus) {
        ModConstants.LOGGER.info("Hello Forge!");
        ExampleModCommon.initialize();
        NeoForge.EVENT_BUS.addListener(this::onItemTooltip);
    }

    private void onItemTooltip(ItemTooltipEvent event) {
        ExampleModCommon.onItemTooltip(event.getItemStack(), event.getFlags(), event.getToolTip());
    }
}