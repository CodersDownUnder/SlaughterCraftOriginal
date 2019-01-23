package trhod177.bm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.blocks.CustomBlock;
import trhod177.bm.handlers.ConfigHandler;
import trhod177.bm.init.BlockInit;

public class BlockCustomCarcass extends CustomBlock {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	private boolean drop = true;
	
	  
	public BlockCustomCarcass(String name) {
		super(Material.ROCK, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
       
		
	}
	
	
	@Override 
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		if (!worldIn.isRemote) {
		ItemStack heldItem = playerIn.getHeldItem(hand);
        Block block = blockState.getBlock();
		 
		if(heldItem.isEmpty())
		{
			
			drop = false;
			worldIn.destroyBlock(pos, true);
		   
		}
		
	
		}
		
		
		drop = true;
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
	
     
	@Override 
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
	}


	
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		
	/*if (drop == true) {	
		
	
	}*/
	
	if (drop == false) {
		drops.add(new ItemStack(this, 1));
	}

	}


    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && worldIn.isSideSolid(pos.down(), EnumFacing.UP);
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     */
    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }

    /**
     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
     * IBlockstate
     */
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
       if (this == BlockInit.slimecarcass) {
        if (entityIn.isSneaking())
        {
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        }
        else
        {
            entityIn.fall(fallDistance, 0.0F);
        }
       }
    }

   
    public void onLanded(World worldIn, Entity entityIn)
    {
        if (this == BlockInit.slimecarcass) {
        if (entityIn.isSneaking())
        {
            super.onLanded(worldIn, entityIn);
        }
        else if (entityIn.motionY < 0.0D)
        {
            entityIn.motionY = -entityIn.motionY;

            if (!(entityIn instanceof EntityLivingBase))
            {
                entityIn.motionY *= 0.8D;
            }
        }
        }
    }

    
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (this == BlockInit.slimecarcass) {
        if (Math.abs(entityIn.motionY) < 0.1D && !entityIn.isSneaking())
        {
            double d0 = 0.4D + Math.abs(entityIn.motionY) * 0.2D;
            entityIn.motionX *= d0;
            entityIn.motionZ *= d0;
        }

        super.onEntityWalk(worldIn, pos, entityIn);
        }
    }

     
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        if (this == BlockInit.slimecarcass) {
         return BlockRenderLayer.TRANSLUCENT;
        }
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
	public BlockCustomCarcass setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT);
		return this;
	}
	
	

}