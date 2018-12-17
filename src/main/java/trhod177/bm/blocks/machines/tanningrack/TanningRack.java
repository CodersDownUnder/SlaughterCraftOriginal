package trhod177.bm.blocks.machines.tanningrack;

import java.util.Random;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.collection.TraversableOnce.OnceCanBuildFrom;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.References;
import trhod177.bm.blocks.CustomBlock;
import trhod177.bm.blocks.TempBlock;
import trhod177.bm.init.BlockInit;

public class TanningRack extends CustomBlock {

	
	
	public TanningRack(String name) {
		super(Material.WOOD, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
        
		
	}
	
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	  {
	 	 return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.8D, 1.0D);
	  }
	  
	  
	  @Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			
				
			    Minecraft mc = Minecraft.getMinecraft();

	            mc.player.sendMessage(new TextComponentTranslation("ButcheryMod's Tanning Rack Doesn't Work Yet"));
			
	             
					return enableStats;
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
	public TanningRack setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT);
		return this;
	}
	

}
