package trhod177.bm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import trhod177.bm.ButcheryMod;
import trhod177.bm.References;

public class ModItem extends Item {
	
	protected String name;

	public ModItem(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		ButcheryMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ModItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ButcheryMod.BMCT3);
		return this;

}

}