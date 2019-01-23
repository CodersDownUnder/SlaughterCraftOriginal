package trhod177.bm.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.items.AnimalParts;
import trhod177.bm.items.BmItemFood;
import trhod177.bm.items.BmItemFood2;
import trhod177.bm.items.ItemAnimalSkin;
import trhod177.bm.items.ItemButcherKnife;
import trhod177.bm.items.ItemSteel;
import trhod177.bm.items.ItemSteelIngot;
import trhod177.bm.items.ModItem;
import net.minecraftforge.common.util.EnumHelper;



public class ItemInit {
	
	
	public static final ToolMaterial BMSTEEL = EnumHelper.addToolMaterial("BMSTEEL", 3, 400, 13F, 4.0F, 30).setRepairItem(new ItemStack(ItemInit.steel));
	public static final ToolMaterial BMFlint = EnumHelper.addToolMaterial("BMFlint", 2, 150, 4.0F, 2.0F, 5).setRepairItem(new ItemStack(Items.FLINT));
	
	//knives and misc
    public static ItemButcherKnife butcherknife = new ItemButcherKnife("butcherknife", BMSTEEL).setCreativeTab(SlaughterCraft.BMCT3);
    public static ItemButcherKnife stonebutcherknife = new ItemButcherKnife("stonebutcherknife", ToolMaterial.IRON).setCreativeTab(SlaughterCraft.BMCT3);
    public static ItemButcherKnife flintbutcherknife = new ItemButcherKnife("flintbutcherknife", BMFlint).setCreativeTab(SlaughterCraft.BMCT3);
	public static ItemSteel steel = new ItemSteel("steel").setCreativeTab(SlaughterCraft.BMCT3);
	public static ItemSteelIngot steelingot = new ItemSteelIngot("steelingot").setCreativeTab(SlaughterCraft.BMCT3);
	public static ModItem steelrod = new ModItem("steelrod").setCreativeTab(SlaughterCraft.BMCT3);
	public static ModItem stonepole = new ModItem("stonepole").setCreativeTab(SlaughterCraft.BMCT3);
	
	
	//animalparts
	public static AnimalParts chickenleg = new AnimalParts("chickenleg", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts chickenwing = new AnimalParts("chickenwing", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts chickenbreast = new AnimalParts("chickenbreast", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts chickenneck = new AnimalParts("chickenneck", 0, false).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts pigleg = new AnimalParts("pigleg", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts pigbelly = new AnimalParts("pigbelly", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts pigshoulder = new AnimalParts("pigshoulder", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts pigrump = new AnimalParts("pigrump", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cowleg = new AnimalParts("cowleg", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cowbelly = new AnimalParts("cowbelly", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cowshoulder = new AnimalParts("cowshoulder", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cowrump = new AnimalParts("cowrump", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts muttonleg = new AnimalParts("muttonleg", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts muttonshoulder = new AnimalParts("muttonshoulder", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts muttonrump = new AnimalParts("muttonrump", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts muttonbelly = new AnimalParts("muttonbelly", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedchickenleg = new AnimalParts("cookedchickenleg", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedchickenwing = new AnimalParts("cookedchickenwing", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedchickenbreast = new AnimalParts("cookedchickenbreast", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedpigleg = new AnimalParts("cookedpigleg", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedpigbelly = new AnimalParts("cookedpigbelly", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedpigshoulder = new AnimalParts("cookedpigshoulder", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedpigrump = new AnimalParts("cookedpigrump", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedcowleg = new AnimalParts("cookedcowleg", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedcowbelly = new AnimalParts("cookedcowbelly", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedcowshoulder = new AnimalParts("cookedcowshoulder", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedcowrump = new AnimalParts("cookedcowrump", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedmuttonleg = new AnimalParts("cookedmuttonleg", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedmuttonshoulder = new AnimalParts("cookedmuttonshoulder", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedmuttonrump = new AnimalParts("cookedmuttonrump", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedmuttonbelly = new AnimalParts("cookedmuttonbelly", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedsquid = new AnimalParts("cookedsquid", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts rawcalamari = new AnimalParts("rawcalamari", 1, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedcalamari = new AnimalParts("cookedcalamari", 3, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedhorsemeat = new AnimalParts("cookedhorsemeat", 5, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts horsemeat = new AnimalParts("horsemeat", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookeddonkeymeat = new AnimalParts("cookeddonkeymeat", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts donkeymeat = new AnimalParts("donkeymeat", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedmulemeat = new AnimalParts("cookedmulemeat", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts mulemeat = new AnimalParts("mulemeat", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts cookedllamameat = new AnimalParts("cookedllamameat", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static AnimalParts llamameat = new AnimalParts("llamameat", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	
	
	//edibles
	public static BmItemFood roastbeefslice = new BmItemFood("roastbeefslice", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood roastchickenslice = new BmItemFood("roastchickenslice", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood roastporkslice = new BmItemFood("roastporkslice", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood roastmuttonslice = new BmItemFood("roastmuttonslice", 4, true).setCreativeTab(SlaughterCraft.BMCT2);
	
	
	//animalskins
	public static ItemAnimalSkin untannedcowleather = new ItemAnimalSkin("untannedcowleather").setCreativeTab(SlaughterCraft.BMCT3);
	public static ItemAnimalSkin untannedsheepskin = new ItemAnimalSkin("untannedsheepskin").setCreativeTab(SlaughterCraft.BMCT3);
	public static ItemAnimalSkin untannedpigskin = new ItemAnimalSkin("untannedpigskin").setCreativeTab(SlaughterCraft.BMCT3);
	public static ItemAnimalSkin slimeskinleather = new ItemAnimalSkin("slimeskinleather").setCreativeTab(SlaughterCraft.BMCT3);
	
	
	//Soups, Broths, And Stews
	public static BmItemFood2 chickenbroth = new BmItemFood2("chickenbroth", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 porkbroth = new BmItemFood2("porkbroth", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 beefbroth = new BmItemFood2("beefbroth", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 lambbroth = new BmItemFood2("lambbroth", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 fishbroth = new BmItemFood2("fishbroth", 2, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 chickensoup = new BmItemFood2("chickensoup", 6, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 porksoup = new BmItemFood2("porksoup", 6, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 beefsoup = new BmItemFood2("beefsoup", 6, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 lambsoup = new BmItemFood2("lambsoup", 6, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 fishsoup = new BmItemFood2("fishsoup", 6, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 chickenstew = new BmItemFood2("chickenstew", 8, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 porkstew = new BmItemFood2("porkstew", 8, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 beefstew = new BmItemFood2("beefstew", 8, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 lambstew = new BmItemFood2("lambstew", 8, true).setCreativeTab(SlaughterCraft.BMCT2);
	public static BmItemFood2 fishstew = new BmItemFood2("fishstew", 8, true).setCreativeTab(SlaughterCraft.BMCT2);

	
	
	
	public static void register(IForgeRegistry<Item> registry) {
	  registry.registerAll(
          
			butcherknife,
			steel,
	        steelingot,
	        roastbeefslice,
	        roastporkslice,
	        roastmuttonslice,
	        roastchickenslice,
	        untannedcowleather,
	        untannedsheepskin,
	        untannedpigskin,
	        steelrod,
	        stonepole,
	        chickenleg,
			chickenwing,
			chickenbreast, 
			chickenneck,
			pigleg,
			pigbelly,
			pigshoulder,
			pigrump,
			cowleg,
			cowbelly,
			cowshoulder,
			cowrump,
			muttonleg, 
			muttonshoulder,
			muttonrump,
			muttonbelly,
			cookedchickenleg,
			cookedchickenwing,
			cookedchickenbreast, 
			cookedpigleg,
			cookedpigbelly,
			cookedpigshoulder,
			cookedpigrump,
			cookedcowleg,
			cookedcowbelly,
			cookedcowshoulder,
			cookedcowrump,
			cookedmuttonleg, 
			cookedmuttonshoulder,
			cookedmuttonrump,
			cookedmuttonbelly,
			cookedsquid,
			rawcalamari,
			cookedcalamari,
			cookedhorsemeat,
		    horsemeat,
			cookeddonkeymeat,
			donkeymeat,
			cookedmulemeat,
			mulemeat,
			cookedllamameat,
			llamameat,
			slimeskinleather,
			chickenbroth,
			porkbroth,
			beefbroth,
			lambbroth,
			fishbroth,
			chickensoup,
			porksoup,
			beefsoup,
			lambsoup,
			fishsoup,
			chickenstew,
			porkstew,
			beefstew,
			lambstew,
			fishstew,
			stonebutcherknife,
			flintbutcherknife
	          
			  );
	  
	
	}
	
	public static void registerModels() {
        butcherknife.registerItemModel();
        steel.registerItemModel();
        steelingot.registerItemModel();
        roastbeefslice.registerItemModel();
        roastporkslice.registerItemModel();
        roastmuttonslice.registerItemModel();
        roastchickenslice.registerItemModel();
        untannedcowleather.registerItemModel();
        untannedsheepskin.registerItemModel();
        untannedpigskin.registerItemModel();
        steelrod.registerItemModel();
        stonepole.registerItemModel();
        chickenleg.registerItemModel();
		chickenwing.registerItemModel();
		chickenbreast.registerItemModel();
		chickenneck.registerItemModel();
		pigleg.registerItemModel();
		pigbelly.registerItemModel();
		pigshoulder.registerItemModel();
		pigrump.registerItemModel();
		cowleg.registerItemModel();
		cowbelly.registerItemModel();
		cowshoulder.registerItemModel();
		cowrump.registerItemModel();
		muttonleg.registerItemModel();
		muttonshoulder.registerItemModel();
		muttonbelly.registerItemModel();
		muttonrump.registerItemModel();
		cookedchickenleg.registerItemModel();
		cookedchickenwing.registerItemModel();
		cookedchickenbreast.registerItemModel();
		cookedpigleg.registerItemModel();
		cookedpigbelly.registerItemModel();
		cookedpigshoulder.registerItemModel();
		cookedpigrump.registerItemModel();
		cookedcowleg.registerItemModel();
		cookedcowbelly.registerItemModel();
		cookedcowshoulder.registerItemModel();
		cookedcowrump.registerItemModel();
		cookedmuttonleg.registerItemModel();
		cookedmuttonshoulder.registerItemModel();
		cookedmuttonrump.registerItemModel();
		cookedmuttonbelly.registerItemModel();
		cookedsquid.registerItemModel();
		rawcalamari.registerItemModel();
		cookedcalamari.registerItemModel();
		cookedhorsemeat.registerItemModel();
	    horsemeat.registerItemModel();
		cookeddonkeymeat.registerItemModel();
		donkeymeat.registerItemModel();
		cookedmulemeat.registerItemModel();
		mulemeat.registerItemModel();
		cookedllamameat.registerItemModel();
		llamameat.registerItemModel();
		slimeskinleather.registerItemModel();
		chickenbroth.registerItemModel();
		porkbroth.registerItemModel();
		beefbroth.registerItemModel();
		lambbroth.registerItemModel();
		fishbroth.registerItemModel();
		chickensoup.registerItemModel();
		porksoup.registerItemModel();
		beefsoup.registerItemModel();
		lambsoup.registerItemModel();
		fishsoup.registerItemModel();
		chickenstew.registerItemModel();
		porkstew.registerItemModel();
		beefstew.registerItemModel();
		lambstew.registerItemModel();
		fishstew.registerItemModel();
		stonebutcherknife.registerItemModel();
		flintbutcherknife.registerItemModel();
		
	}
	
	

}

