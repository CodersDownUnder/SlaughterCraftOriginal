package trhod177.bm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.References;

public class ModItem extends Item {
	
	protected String name;

	public ModItem(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		SlaughterCraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ModItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT3);
		return this;

}

}