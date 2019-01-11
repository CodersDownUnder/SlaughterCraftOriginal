package trhod177.bm.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.bm.References;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.items.AnimalParts;
import trhod177.bm.items.ArmourBase;
import trhod177.bm.items.BmItemFood;
import trhod177.bm.items.ItemAnimalSkin;
import trhod177.bm.items.ItemButcherKnife;
import trhod177.bm.items.ItemCleaver;
import trhod177.bm.items.ItemDeboningKnife;
import trhod177.bm.items.ItemSkinningKnife;
import trhod177.bm.items.ItemSteel;
import trhod177.bm.items.ItemSteelIngot;
import trhod177.bm.items.ModItem;
import trhod177.bm.items.armour.SlaughterCraftBoots;
import trhod177.bm.items.armour.SlaughterCraftChestplate;
import trhod177.bm.items.armour.SlaughterCraftHelmet;
import trhod177.bm.items.armour.SlaughterCraftLeggings;

public class ArmourInit {
	
	public static final ArmorMaterial ARMOUR_SLIME = EnumHelper.addArmorMaterial("armour_slime", References.MODID + ":slime", 15, new int[] {2, 5,5 ,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final ArmorMaterial ARMOUR_SQUID = EnumHelper.addArmorMaterial("armour_squid", References.MODID + ":squid", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ENTITY_SMALL_SLIME_SQUISH, 0.0F);
	
	//slime armour
	public static ArmourBase slimehelmet = new ArmourBase("slimehelmet", ARMOUR_SLIME, 1, EntityEquipmentSlot.HEAD).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase slimechestplate = new ArmourBase("slimechestplate", ARMOUR_SLIME, 1, EntityEquipmentSlot.CHEST).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase slimeleggings = new ArmourBase("slimeleggings", ARMOUR_SLIME, 2, EntityEquipmentSlot.LEGS).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase slimeboots = new ArmourBase("slimeboots", ARMOUR_SLIME, 1, EntityEquipmentSlot.FEET).setCreativeTab(SlaughterCraft.BMCT3);
	
	/*//squid armour
	public static ArmourBase squidhelmet = new ArmourBase("squidhelmet", ARMOUR_SQUID, 1, EntityEquipmentSlot.HEAD).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase squidchestplate = new ArmourBase("squidchestplate", ARMOUR_SQUID, 1, EntityEquipmentSlot.CHEST).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase squidleggings = new ArmourBase("squidleggings", ARMOUR_SQUID, 2, EntityEquipmentSlot.LEGS).setCreativeTab(SlaughterCraft.BMCT3);
	public static ArmourBase squidboots = new ArmourBase("squidboots", ARMOUR_SQUID, 1, EntityEquipmentSlot.FEET).setCreativeTab(SlaughterCraft.BMCT3);
	*/
	
	
	
	public static void register(IForgeRegistry<Item> registry) {
	  registry.registerAll(
        slimehelmet,
        slimechestplate,
        slimeleggings,
        slimeboots
      /*  squidhelmet,
        squidchestplate,
        squidleggings,
        squidboots
	          */
			  );
	  
	
	}
	
	public static void registerModels() {
	   
		    slimehelmet.registerItemModel();
	        slimechestplate.registerItemModel();
	        slimeleggings.registerItemModel();
	        slimeboots.registerItemModel();
	       /* squidhelmet.registerItemModel();
	        squidchestplate.registerItemModel();
	        squidleggings.registerItemModel();
	        squidboots.registerItemModel();*/
        
		
	}
	
	

}

