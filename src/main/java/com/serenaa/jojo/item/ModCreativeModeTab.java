package com.serenaa.jojo.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JOJO_TAB = new CreativeModeTab("jojotab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CIRCLE.get());
        }
    };
}
