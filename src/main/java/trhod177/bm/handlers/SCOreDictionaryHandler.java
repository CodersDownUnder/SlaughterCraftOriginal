package trhod177.bm.handlers;

import net.minecraftforge.oredict.OreDictionary;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class SCOreDictionaryHandler {
	
	
	public static void registerOres() {
		
		//steel
		OreDictionary.registerOre("oreSteel", BlockInit.coalironmix);
		OreDictionary.registerOre("ingotSteel", ItemInit.steelingot);
		
		//leathers
		OreDictionary.registerOre("untannedLeather", ItemInit.untannedcowleather);
		OreDictionary.registerOre("untannedLeather", ItemInit.untannedpigskin);
		OreDictionary.registerOre("untannedLeather", ItemInit.untannedsheepskin);
		
		//cow parts
		OreDictionary.registerOre("listAllmeatraw", ItemInit.cowbelly);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.cowleg);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.cowrump);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.cowshoulder);
		OreDictionary.registerOre("listAllbeefraw", ItemInit.cowbelly);
		OreDictionary.registerOre("listAllbeefraw", ItemInit.cowleg);
		OreDictionary.registerOre("listAllbeefraw", ItemInit.cowrump);
		OreDictionary.registerOre("listAllbeefraw", ItemInit.cowshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedcowbelly);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedcowleg);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedcowshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedcowrump);
		OreDictionary.registerOre("listAllbeefcooked", ItemInit.cookedcowbelly);
		OreDictionary.registerOre("listAllbeefcooked", ItemInit.cookedcowleg);
		OreDictionary.registerOre("listAllbeefcooked", ItemInit.cookedcowshoulder);
		OreDictionary.registerOre("listAllbeefcooked", ItemInit.cookedcowrump);
		
		
		//pig parts
		OreDictionary.registerOre("listAllmeatraw", ItemInit.pigbelly);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.pigleg);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.pigrump);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.pigshoulder);
		OreDictionary.registerOre("listAllporkraw", ItemInit.pigbelly);
		OreDictionary.registerOre("listAllporkraw", ItemInit.pigleg);
		OreDictionary.registerOre("listAllporkraw", ItemInit.pigrump);
		OreDictionary.registerOre("listAllporkraw", ItemInit.pigshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedpigbelly);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedpigleg);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedpigshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedpigrump);
		OreDictionary.registerOre("listAllporkcooked", ItemInit.cookedpigbelly);
		OreDictionary.registerOre("listAllporkcooked", ItemInit.cookedpigleg);
		OreDictionary.registerOre("listAllporkcooked", ItemInit.cookedpigshoulder);
		OreDictionary.registerOre("listAllporkcooked", ItemInit.cookedpigrump);
		
		
		//mutton parts
		OreDictionary.registerOre("listAllmeatraw", ItemInit.muttonbelly);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.muttonleg);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.muttonrump);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.muttonshoulder);
		OreDictionary.registerOre("listAllmuttonraw", ItemInit.muttonbelly);
		OreDictionary.registerOre("listAllmuttonraw", ItemInit.muttonleg);
		OreDictionary.registerOre("listAllmuttonraw", ItemInit.muttonrump);
		OreDictionary.registerOre("listAllmuttonraw", ItemInit.muttonshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedmuttonbelly);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedmuttonleg);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedmuttonshoulder);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedmuttonrump);
		OreDictionary.registerOre("listAllmuttoncooked", ItemInit.cookedmuttonbelly);
		OreDictionary.registerOre("listAllmuttoncooked", ItemInit.cookedmuttonleg);
		OreDictionary.registerOre("listAllmuttoncooked", ItemInit.cookedmuttonshoulder);
		OreDictionary.registerOre("listAllmuttoncooked", ItemInit.cookedmuttonrump);
		
		
		//chicken parts
		OreDictionary.registerOre("listAllmeatraw", ItemInit.chickenbreast);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.chickenleg);
	    OreDictionary.registerOre("listAllmeatraw", ItemInit.chickenwing);
		OreDictionary.registerOre("listAllchickenraw", ItemInit.chickenbreast);
		OreDictionary.registerOre("listAllchickenraw", ItemInit.chickenleg);
		OreDictionary.registerOre("listAllchickenraw", ItemInit.chickenwing);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedchickenbreast);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedchickenleg);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedchickenwing);
		OreDictionary.registerOre("listAllchickencooked", ItemInit.cookedchickenleg);
		OreDictionary.registerOre("listAllchickencooked", ItemInit.cookedchickenbreast);
		OreDictionary.registerOre("listAllchickencooked", ItemInit.cookedchickenwing);
		
		
		//Calamari
		OreDictionary.registerOre("listAllmeatraw", ItemInit.rawcalamari);
		OreDictionary.registerOre("foodCalamariraw", ItemInit.rawcalamari);
		OreDictionary.registerOre("foodCalamaricooked", ItemInit.cookedcalamari);
		OreDictionary.registerOre("foodCalamaricooked", ItemInit.cookedsquid);
		
		
		//horse/ donkey/ mule/ llama
		OreDictionary.registerOre("listAllmeatraw", ItemInit.llamameat);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.horsemeat);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.mulemeat);
		OreDictionary.registerOre("listAllmeatraw", ItemInit.donkeymeat);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedllamameat);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedhorsemeat);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookedmulemeat);
		OreDictionary.registerOre("listAllmeatcooked", ItemInit.cookeddonkeymeat);
		OreDictionary.registerOre("listAllllamaraw", ItemInit.llamameat);
		OreDictionary.registerOre("listAllhorseraw", ItemInit.horsemeat);
		OreDictionary.registerOre("listAllmuleraw", ItemInit.mulemeat);
		OreDictionary.registerOre("listAlldonkeyraw", ItemInit.donkeymeat);
		OreDictionary.registerOre("listAllllamacooked", ItemInit.cookedllamameat);
		OreDictionary.registerOre("listAllhorsecooked", ItemInit.cookedhorsemeat);
		OreDictionary.registerOre("listAllmulecooked", ItemInit.cookedmulemeat);
		OreDictionary.registerOre("listAlldonkeycooked", ItemInit.cookeddonkeymeat);
		
		
		
	}  

}
