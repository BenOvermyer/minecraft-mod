package com.benovermyer.thrive;

import com.benovermyer.thrive.init.ThriveItems;
import com.benovermyer.thrive.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Thrive.MODID, version = Thrive.VERSION, name = Thrive.NAME)
public class Thrive {
    public static final String MODID = "thrive";
    public static final String VERSION = "1.0";
    public static final String NAME = "Thrive";

    @SidedProxy(clientSide = "com.benovermyer.thrive.proxy.ClientProxy", serverSide = "com.benovermyer.thrive.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Thrive instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ThriveItems.init();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
