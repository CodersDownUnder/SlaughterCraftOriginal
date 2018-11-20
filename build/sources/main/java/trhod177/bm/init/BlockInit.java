package trhod177.bm.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.advancements.critereon.BredAnimalsTrigger.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.bm.ButcheryMod;
import trhod177.bm.blocks.ButcheryTable;
import trhod177.bm.blocks.CoalIronOre;
import trhod177.bm.blocks.MeatBlock;
import trhod177.bm.blocks.carcasses.ChickenCarcassBlock;
import trhod177.bm.blocks.carcasses.CowCarcassBlock;
import trhod177.bm.blocks.carcasses.DonkeyCarcassBlock;
import trhod177.bm.blocks.carcasses.HorseCarcassBlock;
import trhod177.bm.blocks.carcasses.LlamaCarcassBlock;

import trhod177.bm.blocks.carcasses.MuleCarcassBlock;
import trhod177.bm.blocks.carcasses.PigCarcassBlock;
import trhod177.bm.blocks.carcasses.RabbitCarcassBlock;
import trhod177.bm.blocks.carcasses.SheepCarcassBlock;
import trhod177.bm.blocks.carcasses.SquidCarcassBlock;
import trhod177.bm.blocks.machines.slowroaster.SlowRoaster;
import trhod177.bm.blocks.machines.tanningrack.TanningRack;
import trhod177.bm.items.BmItemFood;

public class BlockInit {
	
	
	
	//blocks
	public static ButcheryTable butcherstable = new ButcheryTable("butcherstable").setCreativeTab(ButcheryMod.BMCT);
	public static TanningRack tanningrack = new TanningRack("tanningrack").setCreativeTab(ButcheryMod.BMCT);
	public static SlowRoaster slowroaster = new SlowRoaster("slowroaster").setCreativeTab(ButcheryMod.BMCT);
	public static CoalIronOre coalironmix = new CoalIronOre("coalironmix").setCreativeTab(ButcheryMod.BMCT);
	
	
	//animal carcasses
	public static CowCarcassBlock cowcarcass = new CowCarcassBlock("cowcarcass").setCreativeTab(ButcheryMod.BMCT);
	public static ChickenCarcassBlock chickencarcass = new ChickenCarcassBlock("chickencarcass").setCreativeTab(ButcheryMod.BMCT);
	public static PigCarcassBlock pigcarcass = new PigCarcassBlock("pigcarcass").setCreativeTab(ButcheryMod.BMCT);
	public static SheepCarcassBlock sheepcarcass = new SheepCarcassBlock("sheepcarcass").setCreativeTab(ButcheryMod.BMCT);
	public static DonkeyCarcassBlock donkeycarcass = new DonkeyCarcassBlock("donkeycarcass").setCreativeTab(ButcheryMod.BMCT);
	public static MuleCarcassBlock mulecarcass = new MuleCarcassBlock("mulecarcass").setCreativeTab(ButcheryMod.BMCT);
	public static HorseCarcassBlock horsecarcass = new HorseCarcassBlock("horsecarcass").setCreativeTab(ButcheryMod.BMCT);
	public static LlamaCarcassBlock llamacarcass = new LlamaCarcassBlock("llamacarcass").setCreativeTab(ButcheryMod.BMCT);
	public static SquidCarcassBlock squidcarcass = new SquidCarcassBlock("squidcarcass").setCreativeTab(ButcheryMod.BMCT);
    
	
	//meat blocks
	public static MeatBlock roastmutton = new MeatBlock("roastmutton").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock roastpork = new MeatBlock("roastpork").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock roastchicken = new MeatBlock("roastchicken").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock roastbeef = new MeatBlock("roastbeef").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock uncookedroastmutton = new MeatBlock("uncookedroastmutton").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock uncookedroastpork = new MeatBlock("uncookedroastpork").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock uncookedroastchicken = new MeatBlock("uncookedroastchicken").setCreativeTab(ButcheryMod.BMCT2);
	public static MeatBlock uncookedroastbeef = new MeatBlock("uncookedroastbeef").setCreativeTab(ButcheryMod.BMCT2);
			
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
				squidcarcass
				
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
				squidcarcass.createItemBlock()
				
				
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
		
	}

}