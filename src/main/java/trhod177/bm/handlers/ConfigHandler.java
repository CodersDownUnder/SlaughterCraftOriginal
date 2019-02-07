package trhod177.bm.handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.References;


public class ConfigHandler {
	
	public static Configuration config;
	
	
	

	public static boolean overridemobdrops = true;
	public static boolean adddefaultdrops;
	public static boolean dropdefaultandcarcassondeath = false;
	
	public static boolean addbutcherbuildingtp;
	public static boolean addbutcherbuildingtf;
	public static boolean addbutcherbuildingtt;
	public static boolean addbutcherbuildingtj;
	public static boolean addbutcherbuildingts;
	public static boolean addbutcherbuildingtd;
	public static boolean addbutcherbuildingtm;
	public static boolean addbutcherbuildingtms;
	public static boolean addbutcherbuildingth;
	
	public static int steelorechance;
	public static int steeloreminheight;
	public static int steeloremaxheight;
	
	
	
	public static String VERSION;
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
		
		
		category = "Misc Mod Info";
		config.addCustomCategoryComment(category, References.NAME + ":" + References.VERSION);
	
		
		category = "Mob Drops";
		config.addCustomCategoryComment(category, "This category needs to be reworked");
	    //overridemobdrops = config.getBoolean("Override MobDrops", category, true, "Carcasses will drop the mobs default drops on destruction");
	    //adddefaultdrops = config.getBoolean("Default MobDrops", category, false, "If true default drops will be dropped when you mine carcass as well as modded drops");
	    //dropdefaultandcarcassondeath = config.getBoolean("Drop Default And Carcass", category, false, "If true mobs will drop both there default drops aswell as their carcasses on there death");
	    
	    category = "World Generation";
	    config.addCustomCategoryComment(category, "World Gen Settings");
	    addbutcherbuildingtp = config.getBoolean("Butcher Building Plains Biome", category, false, "If true the butcher building will spawn in plains biome (warning experiemental may lag your world)");
	    addbutcherbuildingtf = config.getBoolean("Butcher Building Forest Biome", category, false, "If true the butcher building will spawn in forest biome (warning experiemental may lag your world)");
	    addbutcherbuildingtt = config.getBoolean("Butcher Building Taiga Biome", category, false, "If true the butcher building will spawn in taiga biome (warning experiemental may lag your world)");
	    addbutcherbuildingtj = config.getBoolean("Butcher Building Jungle Biome", category, false, "If true the butcher building will spawn in jungle biome (warning experiemental may lag your world)");
	    addbutcherbuildingts = config.getBoolean("Butcher Building Savanna Biome", category, false, "If true the butcher building will spawn in savanna biome (warning experiemental may lag your world)");
	    addbutcherbuildingtd = config.getBoolean("Butcher Building Desert Biome", category, false, "If true the butcher building will spawn in desert biome (warning experiemental may lag your world)");
	    addbutcherbuildingtm = config.getBoolean("Butcher Building Mushroom Island Biome", category, false, "If true the butcher building will mushroom island in plains biome (warning experiemental may lag your world)");
	    addbutcherbuildingtms = config.getBoolean("Butcher Building Mesa Biome", category, false, "If true the butcher building will spawn in mesa biome (warning experiemental may lag your world)");
	    addbutcherbuildingth = config.getBoolean("Butcher Building Hills Biome", category, false, "If true the butcher building will spawn in hills biome (warning experiemental may lag your world)");
	   
	    steelorechance = config.getInt("SteelOreSpawnChance", category, 20, 0, 100000, "Set random spawn chance for steel ore");
	    steeloreminheight = config.getInt("SteelOreMinHeight", category, 0, 0, 256, "Set min height for steel ore");
	    steeloremaxheight = config.getInt("SteelOreMaxHeight", category, 100, 0, 256, "Set max height for steel ore");
	    
	  
	    
	   config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		SlaughterCraft.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		SlaughterCraft.config.mkdirs();
		init(new File(SlaughterCraft.config.getPath(), References.NAME + ".cfg"));
				
	}
	

}