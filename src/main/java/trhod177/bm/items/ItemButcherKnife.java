package trhod177.bm.items;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class ItemButcherKnife extends ItemPickaxe  {
	
	

	protected String name;

	public ItemButcherKnife(String name, ToolMaterial material) {
		
		super(material);
		this.name = name;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}


	  @Override
	    public boolean hasContainerItem(ItemStack stack) {
	        return true;
	    }
	    
	    @Override
	    public ItemStack getContainerItem(ItemStack itemStack) {
	        if (itemStack.getMaxDamage() == itemStack.getItemDamage()) {
	            return ItemStack.EMPTY;
	            
	    } else {
	        ItemStack newItemStack = itemStack.copy();
	        newItemStack.setItemDamage(itemStack.getItemDamage() + 1);
	        return newItemStack;
	    }
	    }
	    
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
	public void registerItemModel() {
		SlaughterCraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	
	@Override
	public ItemButcherKnife setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT3);
		return this;
     }
}
