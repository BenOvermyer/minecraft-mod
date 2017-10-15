package com.benovermyer.thrive.item;

import com.benovermyer.thrive.Thrive;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ThriveItem extends Item {
    public ThriveItem(String unlocalizedName, String registryName) {
        setUnlocalizedName(unlocalizedName);
        setRegistryName(new ResourceLocation(Thrive.MODID, registryName));
    }
}
