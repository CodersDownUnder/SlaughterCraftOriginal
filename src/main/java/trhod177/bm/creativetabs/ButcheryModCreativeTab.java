package trhod177.bm.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.bm.init.BlockInit;


public class ButcheryModCreativeTab extends CreativeTabs {


	public ButcheryModCreativeTab(String label) {
		super("BMCT");
		this.setBackgroundImageName("items.png");
		
	}
	
	
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.cowcarcass);
		
	}
}