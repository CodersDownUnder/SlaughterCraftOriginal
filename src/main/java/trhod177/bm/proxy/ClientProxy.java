package trhod177.bm.proxy;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.registries.ForgeRegistry;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.References;
import trhod177.bm.init.ItemInit;

public class ClientProxy extends CommonProxy {
	

   public void preInit(FMLPreInitializationEvent event) {
		
	   super.preInit(event);
	   
	   //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	   //System.out.println("this is loaded");
	}
	
	
	public void init(FMLInitializationEvent event) {

		super.init(event);
	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		
		super.postInit(event);
	}


}
