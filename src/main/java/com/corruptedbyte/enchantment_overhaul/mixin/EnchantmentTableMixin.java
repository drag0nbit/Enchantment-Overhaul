package com.corruptedbyte.enchantment_overhaul.mixin;

import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.ingame.EnchantmentScreen;

@Mixin(EnchantmentScreen.class)
public class EnchantmentTableMixin {
    @Inject(method = "drawBook", at = @At("HEAD"))
    private void onRender(DrawContext context, int x, int y, float delta, CallbackInfo ci) {

    }
}