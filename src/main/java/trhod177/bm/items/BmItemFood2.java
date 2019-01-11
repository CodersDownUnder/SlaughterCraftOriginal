package trhod177.bm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.init.ItemInit;


public class BmItemFood2 extends ItemFood
{
	
	protected String name;
	
	public BmItemFood2(String name, int amount, boolean isWolfFood) 
	{
		
		super(amount, isWolfFood);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setMaxStackSize(1);
		
	}
	
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
	
	public void registerItemModel() {
		SlaughterCraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
  
        return new ItemStack(Items.BOWL);
     
    }
	
	@Override
	public BmItemFood2 setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT2);
		return this;
     }
}
