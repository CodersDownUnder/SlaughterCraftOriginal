package trhod177.bm.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.bm.References;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		 
	}
	
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MODID + ":" + id, "inventory"));
	}
}


