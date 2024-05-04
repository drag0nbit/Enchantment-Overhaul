package com.corruptedbyte.enchantment_overhaul.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class PolishedLapisLazuli extends Item {
    public PolishedLapisLazuli(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.enchantment_overhaul.polished_lapis_lazuli.tooltip"));
    }
}