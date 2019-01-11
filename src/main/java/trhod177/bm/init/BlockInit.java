package trhod177.bm.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.advancements.critereon.BredAnimalsTrigger.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.bm.SlaughterCraft;
import trhod177.bm.blocks.ButcheryTable;
import trhod177.bm.blocks.CoalIronOre;
import trhod177.bm.blocks.EndermanSkull;
import trhod177.bm.blocks.MeatBlock;
import trhod177.bm.blocks.SlimeSkull;
import trhod177.bm.blocks.carcasses.ChickenCarcassBlock;
import trhod177.bm.blocks.carcasses.CowCarcassBlock;
import trhod177.bm.blocks.carcasses.CreeperCarcassBlock;
import trhod177.bm.blocks.carcasses.DonkeyCarcassBlock;
import trhod177.bm.blocks.carcasses.EnderCarcassBlock;
import trhod177.bm.blocks.carcasses.EvokerCarcassBlock;
import trhod177.bm.blocks.carcasses.HorseCarcassBlock;
import trhod177.bm.blocks.carcasses.LlamaCarcassBlock;

import trhod177.bm.blocks.carcasses.MuleCarcassBlock;
import trhod177.bm.blocks.carcasses.PigCarcassBlock;
import trhod177.bm.blocks.carcasses.RabbitCarcassBlock;
import trhod177.bm.blocks.carcasses.SheepCarcassBlock;
import trhod177.bm.blocks.carcasses.SilverFishCarcassBlock;
import trhod177.bm.blocks.carcasses.SlimeCarcassBlock;
import trhod177.bm.blocks.carcasses.SquidCarcassBlock;
import trhod177.bm.blocks.carcasses.VillagerCarcassBlock;
import trhod177.bm.blocks.carcasses.VindicatorCarcassBlock;
import trhod177.bm.blocks.carcasses.ZombieCarcassBlock;
import trhod177.bm.blocks.carcasses.ZombiePigmanCarcassBlock;
import trhod177.bm.blocks.carcasses.ZombieVillagerCarcassBlock;
import trhod177.bm.blocks.machines.slowroaster.SlowRoaster;
import trhod177.bm.blocks.machines.stewpot.StewPot;
import trhod177.bm.blocks.machines.tanningrack.TanningRack;
import trhod177.bm.items.BmItemFood;

public class BlockInit {
	
	
	
	//blocks
	public static ButcheryTable butcherstable = new ButcheryTable("butcherstable").setCreativeTab(SlaughterCraft.BMCT);
	public static TanningRack tanningrack = new TanningRack("tanningrack").setCreativeTab(SlaughterCraft.BMCT);
	public static SlowRoaster slowroaster = new SlowRoaster("slowroaster").setCreativeTab(SlaughterCraft.BMCT);
	public static CoalIronOre coalironmix = new CoalIronOre("coalironmix").setCreativeTab(SlaughterCraft.BMCT);
	public static SlimeSkull slimeskull = new SlimeSkull("slimeskull").setCreativeTab(SlaughterCraft.BMCT);
	public static StewPot stewpot = new StewPot("stewpot").setCreativeTab(SlaughterCraft.BMCT);
	//public static EndermanSkull endermanskull = new EndermanSkull("endermanskull").setCreativeTab(SlaughterCraft.BMCT);
	
	
	//animal carcasses
	public static CowCarcassBlock cowcarcass = new CowCarcassBlock("cowcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static ChickenCarcassBlock chickencarcass = new ChickenCarcassBlock("chickencarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static PigCarcassBlock pigcarcass = new PigCarcassBlock("pigcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static SheepCarcassBlock sheepcarcass = new SheepCarcassBlock("sheepcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static DonkeyCarcassBlock donkeycarcass = new DonkeyCarcassBlock("donkeycarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static MuleCarcassBlock mulecarcass = new MuleCarcassBlock("mulecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static HorseCarcassBlock horsecarcass = new HorseCarcassBlock("horsecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static LlamaCarcassBlock llamacarcass = new LlamaCarcassBlock("llamacarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static SquidCarcassBlock squidcarcass = new SquidCarcassBlock("squidcarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static VillagerCarcassBlock villagercarcass = new VillagerCarcassBlock("villagercarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static ZombieCarcassBlock zombiecarcass = new ZombieCarcassBlock("zombiecarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static ZombieVillagerCarcassBlock zombievillagercarcass = new ZombieVillagerCarcassBlock("zombievillagercarcass").setCreativeTab(SlaughterCraft.BMCT);
	public static ZombiePigmanCarcassBlock zombiepigmancarcass = new ZombiePigmanCarcassBlock("zombiepigmancarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static SlimeCarcassBlock slimecarcass = new SlimeCarcassBlock("slimecarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static CreeperCarcassBlock creepercarcass = new CreeperCarcassBlock("creepercarcass").setCreativeTab(SlaughterCraft.BMCT);
    //public static SilverFishCarcassBlock silverfishcarcass = new SilverFishCarcassBlock("silverfishcarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static VindicatorCarcassBlock vindicatorcarcass = new VindicatorCarcassBlock("vindicatorcarcass").setCreativeTab(SlaughterCraft.BMCT);
    public static EvokerCarcassBlock evokercarcass = new EvokerCarcassBlock("evokercarcass").setCreativeTab(SlaughterCraft.BMCT);
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
				evokercarcass,
				stewpot
				//silverfishcarcass,
				//endermantorso,
				//endermanskull
				
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
				evokercarcass.createItemBlock(),
				stewpot.createItemBlock()
				//silverfishcarcass.createItemBlock(),
				//endermantorso.createItemBlock(),
				//endermanskull.createItemBlock()
				
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
		stewpot.registerItemModel(Item.getItemFromBlock(stewpot));
		//silverfishcarcass.registerItemModel(Item.getItemFromBlock(silverfishcarcass));
		//endermantorso.registerItemModel(Item.getItemFromBlock(endermantorso));
		//endermanskull.registerItemModel(Item.getItemFromBlock(endermanskull));
		
		
	}

}