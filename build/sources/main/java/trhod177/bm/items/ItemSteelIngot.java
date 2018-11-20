package trhod177.bm.items;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.ButcheryMod;
import trhod177.bm.init.ItemInit;

public class ItemSteelIngot extends Item {
	
	

	protected String name;

	public ItemSteelIngot(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
	
	    
	
	public void registerItemModel() {
		ButcheryMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	
	@Override
	public ItemSteelIngot setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ButcheryMod.BMCT3);
		return this;
     }
}