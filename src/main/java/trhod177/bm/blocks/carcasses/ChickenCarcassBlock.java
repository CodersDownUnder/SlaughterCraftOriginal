package trhod177.bm.blocks.carcasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.blocks.CustomBlock;
import trhod177.bm.handlers.ConfigHandler;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;




public class ChickenCarcassBlock extends CustomBlock {

	public static final PropertyEnum<BlockLog.EnumAxis> LOG_AXIS = PropertyEnum.<BlockLog.EnumAxis>create("axis", BlockLog.EnumAxis.class);
	
	  
	public ChickenCarcassBlock(String name) {
		super(Material.ROCK, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
       
		
	}
	
	
	 public IBlockState withRotation(IBlockState state, Rotation rot)
	    {
	        switch (rot)
	        {
	            case COUNTERCLOCKWISE_90:
	            case CLOCKWISE_90:

	                switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
	                {
	                    case X:
	                        return state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
	                    case Z:
	                        return state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
	                    default:
	                        return state;
	                }

	            default:
	                return state;
	        }
	    }
	 
	 
	
	
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)

	{
		


	drops.add(new ItemStack(ItemInit.chickenbreast, 3));
	drops.add(new ItemStack(ItemInit.chickenleg, 2));
	drops.add(new ItemStack(ItemInit.chickenwing, 2));
	drops.add(new ItemStack(ItemInit.chickenneck, 1));
	
	if(ConfigHandler.adddefaultdrops == true) {
		drops.add(new ItemStack(Items.CHICKEN, 1));
	}

	}

	
     
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }
	

	@Override
	public ChickenCarcassBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT);
		return this;
	}
	
	

}