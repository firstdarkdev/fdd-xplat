package com.author.examplemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;

public class ExampleFabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstants.LOGGER.info("Hello Fabric!");
        ExampleModCommon.initialize();
        ItemTooltipCallback.EVENT.register(ExampleModCommon::onItemTooltip);
    }
}
