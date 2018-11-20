package trhod177.bm.items;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.ButcheryMod;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class ItemAnimalSkin extends Item {
	
	

	protected String name;

	public ItemAnimalSkin(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
		
	

	    
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
	public void registerItemModel() {
		ButcheryMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	
	@Override
	public ItemAnimalSkin setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ButcheryMod.BMCT3);
		return this;
     }
}
