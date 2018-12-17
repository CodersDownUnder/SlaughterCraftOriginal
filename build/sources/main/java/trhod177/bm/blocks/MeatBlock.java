package trhod177.bm.blocks;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
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



public class MeatBlock extends CustomBlock {


	  
	  
	public MeatBlock(String name) {
		super(Material.ROCK, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
      
	}
	
	
	public Entity setSize(float width, float height){
		return setSize(0.6F, 0.6F);
		
	}
	
	 public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	  {
	 	 return new AxisAlignedBB(0.3D, 0.0D, 0.1D, 0.68D, 0.37D, 0.89D);
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
	public MeatBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT2);
		return this;
	}
	
	

}