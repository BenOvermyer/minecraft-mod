package com.benovermyer.thrive.proxy;

import com.benovermyer.thrive.init.ThriveItems;
import com.benovermyer.thrive.tab.TabSorcery;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public static final CreativeTabs TAB_SORCERY = new TabSorcery();

    public void preInit(FMLPreInitializationEvent event) {
        ThriveItems.init();

        ThriveItems.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
