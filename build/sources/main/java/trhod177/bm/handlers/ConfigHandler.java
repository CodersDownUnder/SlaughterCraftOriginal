package trhod177.bm.handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.bm.ButcheryMod;
import trhod177.bm.References;

public class ConfigHandler {
	
	public static Configuration config;
	
	public static int GUI_ANIMAL_SKINNER = 0;
	public static int GUI_BUTCHER_MACHINE = 0;
	public static int GUI_SLOW_ROASTER = 0;
	
	public static boolean overridemobdrops;
	public static boolean adddefaultdrops;
	public static boolean addbutcherbuildingtp;
	public static boolean addbutcherbuildingtf;
	public static boolean addbutcherbuildingtt;
	public static boolean addbutcherbuildingtj;
	public static boolean addbutcherbuildingts;
	public static boolean addbutcherbuildingtd;
	public static boolean addbutcherbuildingtm;
	public static boolean addbutcherbuildingtms;
	public static boolean addbutcherbuildingth;
	
	public static String VERSION;
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
		
		
		category = "Mob Drops";
		config.addCustomCategoryComment(category, "Overriding Mob Drops");
	    overridemobdrops = config.getBoolean("Override MobDrops", category, true, "If true mob drops will be overriden for cows, pig, sheep, chickens");
	    adddefaultdrops = config.getBoolean("Default MobDrops", category, false, "If true default drops will be dropped when you mine carcass as well as modded drops");
	    
	    
	    category = "Buildings";
	    config.addCustomCategoryComment(category, "Buildings");
	    addbutcherbuildingtp = config.getBoolean("Butcher Building Plains Biome", category, false, "If true the butcher building will spawn in plains biome (warning experiemental may lag your world)");
	    addbutcherbuildingtf = config.getBoolean("Butcher Building Forest Biome", category, false, "If true the butcher building will spawn in forest biome (warning experiemental may lag your world)");
	    addbutcherbuildingtt = config.getBoolean("Butcher Building Taiga Biome", category, false, "If true the butcher building will spawn in taiga biome (warning experiemental may lag your world)");
	    addbutcherbuildingtj = config.getBoolean("Butcher Building Jungle Biome", category, false, "If true the butcher building will spawn in jungle biome (warning experiemental may lag your world)");
	    addbutcherbuildingts = config.getBoolean("Butcher Building Savanna Biome", category, false, "If true the butcher building will spawn in savanna biome (warning experiemental may lag your world)");
	    addbutcherbuildingtd = config.getBoolean("Butcher Building Desert Biome", category, false, "If true the butcher building will spawn in desert biome (warning experiemental may lag your world)");
	    addbutcherbuildingtm = config.getBoolean("Butcher Building Mushroom Island Biome", category, false, "If true the butcher building will mushroom island in plains biome (warning experiemental may lag your world)");
	    addbutcherbuildingtms = config.getBoolean("Butcher Building Mesa Biome", category, false, "If true the butcher building will spawn in mesa biome (warning experiemental may lag your world)");
	    addbutcherbuildingth = config.getBoolean("Butcher Building Hills Biome", category, false, "If true the butcher building will spawn in hills biome (warning experiemental may lag your world)");
	    
	    
	   config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		ButcheryMod.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		ButcheryMod.config.mkdirs();
		init(new File(ButcheryMod.config.getPath(), References.MODID + ".cfg"));
				
	}
	

}
