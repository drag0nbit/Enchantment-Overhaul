package com.corruptedbyte.enchantment_overhaul;

import com.corruptedbyte.enchantment_overhaul.items.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.corruptedbyte.enchantment_overhaul.EnchantmentOverhaul.MOD_ID;

public class RegisterAll {

    // ITEMS ----------------------------------------------
    public static final Item RUNE_BASE = new PolishedLapisLazuli(new FabricItemSettings());
    public static final Item RUNE_ENCHANT = new RuneEnchant(new FabricItemSettings());
    public static final Item RUNE_LEVELUP = new RuneLevelUp(new FabricItemSettings());
    public static final Item RUNE_REMOVE = new RuneRemove(new FabricItemSettings());
    public static final Item RUNE_CHAOS = new RuneChaos(new FabricItemSettings());
    public static void RegisterItems() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "polished_lapis_lazuli"), RUNE_BASE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rune_enchant"), RUNE_ENCHANT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rune_levelup"), RUNE_LEVELUP);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rune_remove"), RUNE_REMOVE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rune_chaos"), RUNE_CHAOS);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(RUNE_BASE);
            content.add(RUNE_ENCHANT);
            content.add(RUNE_LEVELUP);
            content.add(RUNE_REMOVE);
            content.add(RUNE_CHAOS);
        });
    }
}
