package trhod177.bm.blocks.carcasses;


import java.util.List;
import java.util.Random;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.blocks.CustomBlock;
import trhod177.bm.handlers.ConfigHandler;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;
import trhod177.bm.items.ItemButcherKnife;



public class CowCarcassBlock extends CustomBlock {

     


	
	  
	public CowCarcassBlock(String name) {
		super(Material.ROCK, name);
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 0);
        
		
	}
	
	
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)

	{
	
	 Random rand = new Random();
		
     int a = rand.nextInt(3) + 1;
     int b = rand.nextInt(3) + 1;
     int c = rand.nextInt(3) + 1;
     int d = rand.nextInt(3) + 1;
     int e = rand.nextInt(3) + 1;


	drops.add(new ItemStack(ItemInit.cowbelly, d));
	drops.add(new ItemStack(ItemInit.cowleg, a));
	drops.add(new ItemStack(ItemInit.cowshoulder, b));
	drops.add(new ItemStack(ItemInit.cowrump, c));
	drops.add(new ItemStack(Items.LEATHER, e));
	

	if(ConfigHandler.adddefaultdrops == true) {
		drops.add(new ItemStack(Items.BEEF, a));
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
	public CowCarcassBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT);
		return this;
	}
	
	

}