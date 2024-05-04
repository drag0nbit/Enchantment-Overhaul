package com.corruptedbyte.enchantment_overhaul.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RuneChaos extends Item {
    public RuneChaos(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.enchantment_overhaul.rune_chaos.tooltip.1"));
        tooltip.add(Text.translatable("item.enchantment_overhaul.rune_chaos.tooltip.2"));
    }
}