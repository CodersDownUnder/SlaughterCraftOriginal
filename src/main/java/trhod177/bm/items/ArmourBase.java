package trhod177.bm.items;

import java.awt.Color;
import java.util.List;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.bm.References;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.init.ArmourInit;

public class ArmourBase extends ItemArmor {

protected String name;

public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
    super(materialIn, renderIndexIn, equipmentSlotIn);
    this.name = name;
    this.setUnlocalizedName(name);
    setRegistryName(name);
    

}


@Override
public void onArmorTick(World world, EntityPlayer player, ItemStack item)
{
    if(player.inventory.armorItemInSlot(0) != null &&
        player.inventory.armorItemInSlot(1) != null && 
        player.inventory.armorItemInSlot(2) != null &&
        player.inventory.armorItemInSlot(3) != null)
    {
        if(player.inventory.armorItemInSlot(0).getItem() == ArmourInit.slimeboots &&
           player.inventory.armorItemInSlot(1).getItem() == ArmourInit.slimeleggings && 
           player.inventory.armorItemInSlot(2).getItem() == ArmourInit.slimechestplate &&
           player.inventory.armorItemInSlot(3).getItem() == ArmourInit.slimehelmet)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, false, false));
      /*    }
            
            if(player.inventory.armorItemInSlot(0).getItem() == ArmourInit.squidboots &&
               player.inventory.armorItemInSlot(0).getItem() == ArmourInit.squidleggings &&
               player.inventory.armorItemInSlot(0).getItem() == ArmourInit.squidchestplate &&
               player.inventory.armorItemInSlot(0).getItem() == ArmourInit.squidhelmet) 
            {
                
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 3, false, false));
                
             }*/
            }
    }
}


@Override
@SideOnly(Side.CLIENT)
public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, EntityEquipmentSlot slot, ModelBiped oldModel) {
    return oldModel;
    

}

public void registerItemModel() {
    SlaughterCraft.proxy.registerItemRenderer(this, 0, name);
}

@Override
public ArmourBase setCreativeTab(CreativeTabs tab) {
    super.setCreativeTab(SlaughterCraft.BMCT3);
    return this;
    
 }
}