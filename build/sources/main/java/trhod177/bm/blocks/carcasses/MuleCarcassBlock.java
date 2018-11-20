package trhod177.bm.blocks.carcasses;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.ButcheryMod;
import trhod177.bm.blocks.CustomBlock;
import trhod177.bm.handlers.ConfigHandler;
import trhod177.bm.init.ItemInit;

public class MuleCarcassBlock extends CustomBlock{

	public MuleCarcassBlock(String name) {
		super(Material.ROCK, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
		
	}
	
	
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)

	{
		


		Random rand = new Random();
		int e = rand.nextInt(3) + 1;
		int a = rand.nextInt(2) +1;
		
		drops.add(new ItemStack(ItemInit.mulemeat, e));
		drops.add(new ItemStack(Items.LEATHER, a));

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
	public MuleCarcassBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ButcheryMod.BMCT);
		return this;
	}
}
