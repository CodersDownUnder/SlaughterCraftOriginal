package trhod177.bm.handlers;

import net.minecraftforge.oredict.OreDictionary;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class BmOreDictionaryHandler {
	
	
	public static void registerOres() {
		OreDictionary.registerOre("oreSteel", BlockInit.coalironmix);
		OreDictionary.registerOre("ingotSteel", ItemInit.steelingot);
	}

}
