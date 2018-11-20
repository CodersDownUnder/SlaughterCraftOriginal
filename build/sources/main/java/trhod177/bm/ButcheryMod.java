package trhod177.bm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod177.bm.blocks.TempBlock;
import trhod177.bm.blocks.machines.tanningrack.TanningRack;
import trhod177.bm.creativetabs.ButcheryModCreativeTab;
import trhod177.bm.creativetabs.ButcheryModCreativeTab2;
import trhod177.bm.creativetabs.ButcheryModCreativeTab3;
import trhod177.bm.handlers.BmOreDictionaryHandler;
import trhod177.bm.handlers.ConfigHandler;
//import trhod177.bm.handlers.GuiHandler;
import trhod177.bm.handlers.RecipeHandler;
//import trhod177.bm.handlers.TileEntityHandler;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;
import trhod177.bm.init.MobDrops;
import trhod177.bm.proxy.CommonProxy;
import trhod177.bm.worldgen.WorldGenCustomOres;
import trhod177.bm.worldgen.WorldGenCustomStructures;


@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class ButcheryMod {
	
	 
		public static final CreativeTabs BMCT = new ButcheryModCreativeTab("BlockInit.cowcarcass");
		public static final CreativeTabs BMCT2 = new ButcheryModCreativeTab2("ItemInit.cowbelly");
		public static final CreativeTabs BMCT3 = new ButcheryModCreativeTab3("ItemInit.deboningknife");
	    
	
	    
	    public static File config;
	    
		
		@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
		public static CommonProxy proxy;
		
		@Mod.Instance(References.MODID)
		public static ButcheryMod instance;

		@Mod.EventBusSubscriber
		public static class RegistrationHandler {

			@SubscribeEvent
			public static void registerBlocks(RegistryEvent.Register<Block> event) {
				BlockInit.register(event.getRegistry());
				
			}
			

			@SubscribeEvent
			public static void registerItems(RegistryEvent.Register<Item> event) {
				ItemInit.register(event.getRegistry());
				BlockInit.registerItemBlocks(event.getRegistry());
				
			}
			
			@SubscribeEvent
			public static void registerModels(ModelRegistryEvent event) {
				ItemInit.registerModels();
				BlockInit.registerModels();
				
			}
			
			@SubscribeEvent
			public static void registerItems(ModelRegistryEvent event) {
				ItemInit.registerModels();
			}
			

	  
		}
		
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MODID + ":" + id, "inventory"));
			new ModelResourceLocation(item.getRegistryName() + "variantName", "inventory");

		}
		
		
		
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {
			proxy.preInit(event);
			ConfigHandler.registerConfig(event);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			otherRegisters();
			
			
		}
		
		@EventHandler
		public static void init(FMLInitializationEvent event) {
			proxy.init(event);
            
			MinecraftForge.EVENT_BUS.register(new MobDrops());
			BmOreDictionaryHandler.registerOres();
			RecipeHandler.registerShapedRecipes();
			RecipeHandler.registerShapelessRecipes();
			RecipeHandler.registerFurnaceRecipes();
			
			
			
			
		}
		
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {
			proxy.postInit(event);
		}
		
		public static void otherRegisters() {
			
			GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
			GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		}
		
		
		
		    
}
		


