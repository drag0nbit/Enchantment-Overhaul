package com.corruptedbyte.enchantment_overhaul;

import net.fabricmc.api.ModInitializer;

public class EnchantmentOverhaul implements ModInitializer {
    public static final String MOD_ID = "enchantment_overhaul";

    @Override
    public void onInitialize() {
        RegisterAll.RegisterItems();
    }
}
