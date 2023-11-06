package com.author.examplemod.mixin.client;

import com.author.examplemod.ModConstants;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleForgeMixin {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo ci) {
        ModConstants.LOGGER.info("This line is printed by a mixin from Forge!");
    }

}