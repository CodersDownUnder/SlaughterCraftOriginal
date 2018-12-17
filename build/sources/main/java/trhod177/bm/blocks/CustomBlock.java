package trhod177.bm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import trhod177.bm.SlaughterCraft;;


public class CustomBlock extends Block {


	protected String name;

	public CustomBlock(Material material, String name) {
		
		super(material.ROCK);
		this.name = name;
	
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
	
	
	public void registerItemModel(Item itemBlock) {
		SlaughterCraft.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public CustomBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	


	

}

