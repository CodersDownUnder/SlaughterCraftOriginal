package trhod177.bm.init;

import java.util.ArrayList;
import java.util.List;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.blocks.BlockCustomCarcass;
import trhod177.bm.blocks.ButcheryTable;
import trhod177.bm.blocks.CoalIronOre;
import trhod177.bm.blocks.EndermanSkull;
import trhod177.bm.blocks.MeatBlock;
import trhod177.bm.blocks.SlimeSkull;
import trhod177.bm.blocks.other.slowroaster.SlowRoaster;
import trhod177.bm.blocks.other.tanningrack.TanningRack;
import trhod177.bm.items.BmItemFood;

public class BlockInit {
	
	
	
	//blocks
	public static ButcheryTable butcherstable = new ButcheryTable("butcherstable").setCreativeTab(SlaughterCraft.BMCT);
	public static TanningRack tanningrack = new TanningRack("tanningrack").setCreativeTab(SlaughterCraft.BMCT);
	public static SlowRoaster slowroaster = new SlowRoaster("slowroaster").setCreativeTab(SlaughterCraft.BMCT);
	public static CoalIronOre coalironmix = new CoalIronOre("coalironmix").setCreativeTab(SlaughterCraft.BMCT);
	public static SlimeSkull slimeskull = new SlimeSkull("slimeskull").setCreativeTab(SlaughterCraft.BMCT);
	
	//public static EndermanSkull endermanskull = new EndermanSkull("endermanskull").setCreativeTab(SlaughterCraft.BMCT);
	
	
	//animal carcasses
	public static BlockCustomCarcass cowcarcass = new BlockCustomCarcass("cowcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass chickencarcass = new BlockCustomCarcass("chickencarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass pigcarcass = new BlockCustomCarcass("pigcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass sheepcarcass = new BlockCustomCarcass("sheepcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass donkeycarcass = new BlockCustomCarcass("donkeycarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass mulecarcass = new BlockCustomCarcass("mulecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass horsecarcass = new BlockCustomCarcass("horsecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass llamacarcass = new BlockCustomCarcass("llamacarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass squidcarcass = new BlockCustomCarcass("squidcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass villagercarcass = new BlockCustomCarcass("villagercarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass zombiecarcass = new BlockCustomCarcass("zombiecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass zombievillagercarcass = new BlockCustomCarcass("zombievillagercarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static BlockCustomCarcass zombiepigmancarcass = new BlockCustomCarcass("zombiepigmancarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static BlockCustomCarcass slimecarcass = new BlockCustomCarcass("slimecarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static BlockCustomCarcass creepercarcass = new BlockCustomCarcass("creepercarcass").setCreativeTab(SlaughterCraft.BMCT);
    //public static SilverFishCarcassBlock silverfishcarcass = new SilverFishCarcassBlock("silverfishcarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static BlockCustomCarcass vindicatorcarcass = new BlockCustomCarcass("vindicatorcarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static BlockCustomCarcass evokercarcass = new BlockCustomCarcass("evokercarcass").setCreativeTab(SlaughterCraft.BMCT);
	//public static EnderCarcassBlock endermantorso = new EnderCarcassBlock("endermantorso").setCreativeTab(SlaughterCraft.BMCT);
	
    
	//meat blocks
	public static MeatBlock roastmutton = new MeatBlock("roastmutton").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock roastpork = new MeatBlock("roastpork").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock roastchicken = new MeatBlock("roastchicken").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock roastbeef = new MeatBlock("roastbeef").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock uncookedroastmutton = new MeatBlock("uncookedroastmutton").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock uncookedroastpork = new MeatBlock("uncookedroastpork").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock uncookedroastchicken = new MeatBlock("uncookedroastchicken").setCreativeTab(SlaughterCraft.BMCT2);
	public static MeatBlock uncookedroastbeef = new MeatBlock("uncookedroastbeef").setCreativeTab(SlaughterCraft.BMCT2);
	
	
			
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				butcherstable,
				tanningrack,
				slowroaster,
				cowcarcass,
				pigcarcass,
				chickencarcass,
				sheepcarcass,
				coalironmix,
				roastmutton,
				roastpork,
				roastchicken,
				roastbeef,
				uncookedroastmutton,
				uncookedroastpork,
				uncookedroastchicken,
				uncookedroastbeef,
				donkeycarcass,
				mulecarcass,
				horsecarcass,
				llamacarcass,
				squidcarcass,
				villagercarcass,
				zombiecarcass,
				zombievillagercarcass,
				zombiepigmancarcass,
				slimeskull,
				slimecarcass,
				creepercarcass,
				vindicatorcarcass,
				evokercarcass
				
				
				
				
		);
		
		
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				butcherstable.createItemBlock(),
				tanningrack.createItemBlock(),
				slowroaster.createItemBlock(),
				cowcarcass.createItemBlock(),
				pigcarcass.createItemBlock(),
				chickencarcass.createItemBlock(),
				sheepcarcass.createItemBlock(),
				coalironmix.createItemBlock(),
				roastmutton.createItemBlock(),
				roastpork.createItemBlock(),
				roastchicken.createItemBlock(),
				roastbeef.createItemBlock(),
				uncookedroastmutton.createItemBlock(),
				uncookedroastpork.createItemBlock(),
				uncookedroastchicken.createItemBlock(),
				uncookedroastbeef.createItemBlock(),
				donkeycarcass.createItemBlock(),
				mulecarcass.createItemBlock(),
				horsecarcass.createItemBlock(),
				llamacarcass.createItemBlock(),
				squidcarcass.createItemBlock(),
				villagercarcass.createItemBlock(),
				zombiecarcass.createItemBlock(),
				zombievillagercarcass.createItemBlock(),
				zombiepigmancarcass.createItemBlock(),
				slimeskull.createItemBlock(),
				slimecarcass.createItemBlock(),
				creepercarcass.createItemBlock(),
				vindicatorcarcass.createItemBlock(),
				evokercarcass.createItemBlock()
			
		);
	
	}

	public static void registerModels() {
		butcherstable.registerItemModel(Item.getItemFromBlock(butcherstable));
		tanningrack.registerItemModel(Item.getItemFromBlock(tanningrack));
		slowroaster.registerItemModel(Item.getItemFromBlock(slowroaster));
		cowcarcass.registerItemModel(Item.getItemFromBlock(cowcarcass));
		pigcarcass.registerItemModel(Item.getItemFromBlock(pigcarcass));
		chickencarcass.registerItemModel(Item.getItemFromBlock(chickencarcass));
		sheepcarcass.registerItemModel(Item.getItemFromBlock(sheepcarcass));
		coalironmix.registerItemModel(Item.getItemFromBlock(coalironmix));
		roastmutton.registerItemModel(Item.getItemFromBlock(roastmutton));
		roastpork.registerItemModel(Item.getItemFromBlock(roastpork));
		roastchicken.registerItemModel(Item.getItemFromBlock(roastchicken));
		roastbeef.registerItemModel(Item.getItemFromBlock(roastbeef));
		uncookedroastmutton.registerItemModel(Item.getItemFromBlock(uncookedroastmutton));
		uncookedroastpork.registerItemModel(Item.getItemFromBlock(uncookedroastpork));
		uncookedroastchicken.registerItemModel(Item.getItemFromBlock(uncookedroastchicken));
		uncookedroastbeef.registerItemModel(Item.getItemFromBlock(uncookedroastbeef));
		donkeycarcass.registerItemModel(Item.getItemFromBlock(donkeycarcass));
		mulecarcass.registerItemModel(Item.getItemFromBlock(mulecarcass));
		horsecarcass.registerItemModel(Item.getItemFromBlock(horsecarcass));
		llamacarcass.registerItemModel(Item.getItemFromBlock(llamacarcass));
		squidcarcass.registerItemModel(Item.getItemFromBlock(squidcarcass));
		villagercarcass.registerItemModel(Item.getItemFromBlock(villagercarcass));
		zombiecarcass.registerItemModel(Item.getItemFromBlock(zombiecarcass));
		zombievillagercarcass.registerItemModel(Item.getItemFromBlock(zombievillagercarcass));
		zombiepigmancarcass.registerItemModel(Item.getItemFromBlock(zombiepigmancarcass));
		slimeskull.registerItemModel(Item.getItemFromBlock(slimeskull));
		slimecarcass.registerItemModel(Item.getItemFromBlock(slimecarcass));
		creepercarcass.registerItemModel(Item.getItemFromBlock(creepercarcass));
		vindicatorcarcass.registerItemModel(Item.getItemFromBlock(vindicatorcarcass));
		evokercarcass.registerItemModel(Item.getItemFromBlock(evokercarcass));
		
		
		
	}

}