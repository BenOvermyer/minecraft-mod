package com.benovermyer.thrive.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabSorcery extends CreativeTabs {

    public TabSorcery() {
        super("thriveSorcery");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(Items.CAULDRON);
    }
}
