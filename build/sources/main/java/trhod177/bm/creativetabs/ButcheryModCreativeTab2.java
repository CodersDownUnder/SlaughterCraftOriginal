package trhod177.bm.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;


public class ButcheryModCreativeTab2 extends CreativeTabs {


	public ButcheryModCreativeTab2(String label) {
		super("BMCT2");
		this.setBackgroundImageName("items.png");
		
	}
	
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.cowbelly);
		
	}
}