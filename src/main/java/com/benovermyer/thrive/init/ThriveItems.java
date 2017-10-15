package com.benovermyer.thrive.init;

import com.benovermyer.thrive.Thrive;
import com.benovermyer.thrive.item.ItemMedallion;
import com.benovermyer.thrive.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ThriveItems {
    public static Item thrive_medallion;

    public static void init() {
        thrive_medallion = new ItemMedallion("thrive_medallion", "thrive_medallion");
    }

    public static void register() {
        registerItem(thrive_medallion, CommonProxy.TAB_SORCERY);
    }

    public static void registerRenders() {
        registerRender(thrive_medallion);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Thrive.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    public static Item registerItem(Item item, CreativeTabs tab) {
        item.setCreativeTab(tab);
        ForgeRegistries.ITEMS.register(item);

        return item;
    }
}
