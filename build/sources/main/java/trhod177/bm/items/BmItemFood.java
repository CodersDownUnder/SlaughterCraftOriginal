package trhod177.bm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.SlaughterCraft;


public class BmItemFood extends ItemFood
{
	
	protected String name;
	
	public BmItemFood(String name, int amount, boolean isWolfFood) 
	{
		
		super(amount, isWolfFood);
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
		SlaughterCraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public BmItemFood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(SlaughterCraft.BMCT2);
		return this;
     }
}
