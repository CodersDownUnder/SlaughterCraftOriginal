package trhod177.bm.handlers;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import trhod177.bm.init.ArmourInit;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class RecipeHandler {

	
	
	
	
	public static void registerShapedRecipes() {
		
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastbeef), new Object[] {"BBB","RIR","SSS", 'S', ItemInit.cowshoulder, 'R', ItemInit.cowrump, 'B', ItemInit.cowbelly, 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastchicken), new Object[] {"BBB","BIB","BBB", 'B', ItemInit.chickenbreast, 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastmutton), new Object[] {"BBB","RIR","SSS", 'S', ItemInit.muttonshoulder, 'R', ItemInit.muttonrump, 'B', ItemInit.muttonbelly, 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastpork), new Object[] {"BBB","RIR","SSS", 'S', ItemInit.pigshoulder, 'R', ItemInit.pigrump, 'B', ItemInit.pigbelly, 'I', Items.STICK});     
     CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.butcherknife), new Object[] {"SXX","XSX","XXT", 'S', ItemInit.steel, 'T', Items.STICK, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimeboots), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimehelmet), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimechestplate), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimeleggings), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     
     
	}

	public static void registerShapelessRecipes() {
		
		
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastbeefslice, 12), new Object[] {ItemInit.butcherknife, BlockInit.roastbeef});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastchickenslice, 12), new Object[] {ItemInit.butcherknife, BlockInit.roastchicken});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastporkslice, 12), new Object[] {ItemInit.butcherknife, BlockInit.roastpork});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastmuttonslice, 12), new Object[] {ItemInit.butcherknife, BlockInit.roastmutton});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.slimeskinleather, 4), new Object[] {ItemInit.butcherknife, BlockInit.slimeskull});
		
	}

	public static void registerFurnaceRecipes() {
		
		CraftingHandler.addSmelting(BlockInit.uncookedroastbeef, new ItemStack(BlockInit.roastbeef));
		CraftingHandler.addSmelting(BlockInit.uncookedroastchicken, new ItemStack(BlockInit.roastchicken));
		CraftingHandler.addSmelting(BlockInit.uncookedroastmutton, new ItemStack(BlockInit.roastmutton));
		CraftingHandler.addSmelting(BlockInit.uncookedroastpork, new ItemStack(BlockInit.roastpork));
		
		
		CraftingHandler.addSmelting(ItemInit.chickenbreast, new ItemStack(ItemInit.cookedchickenbreast));
		CraftingHandler.addSmelting(ItemInit.chickenleg, new ItemStack(ItemInit.cookedchickenleg));
		CraftingHandler.addSmelting(ItemInit.chickenwing, new ItemStack(ItemInit.cookedchickenwing));
		CraftingHandler.addSmelting(ItemInit.pigbelly, new ItemStack(ItemInit.cookedpigbelly));
		CraftingHandler.addSmelting(ItemInit.pigleg, new ItemStack(ItemInit.cookedpigleg));
		CraftingHandler.addSmelting(ItemInit.pigrump, new ItemStack(ItemInit.cookedpigrump));
		CraftingHandler.addSmelting(ItemInit.pigshoulder, new ItemStack(ItemInit.cookedpigshoulder));
		CraftingHandler.addSmelting(ItemInit.cowbelly, new ItemStack(ItemInit.cookedcowbelly));
		CraftingHandler.addSmelting(ItemInit.cowleg, new ItemStack(ItemInit.cookedcowleg));
		CraftingHandler.addSmelting(ItemInit.cowrump, new ItemStack(ItemInit.cookedcowrump));
		CraftingHandler.addSmelting(ItemInit.cowshoulder, new ItemStack(ItemInit.cookedcowshoulder));
		CraftingHandler.addSmelting(ItemInit.muttonbelly, new ItemStack(ItemInit.cookedmuttonbelly));
		CraftingHandler.addSmelting(ItemInit.muttonleg, new ItemStack(ItemInit.cookedmuttonleg));
		CraftingHandler.addSmelting(ItemInit.muttonrump, new ItemStack(ItemInit.cookedmuttonrump));
		CraftingHandler.addSmelting(ItemInit.muttonshoulder, new ItemStack(ItemInit.cookedmuttonshoulder));
		CraftingHandler.addSmelting(BlockInit.chickencarcass, new ItemStack(Items.COOKED_CHICKEN));
		CraftingHandler.addSmelting(BlockInit.squidcarcass, new ItemStack(ItemInit.cookedsquid));
		CraftingHandler.addSmelting(ItemInit.rawcalamari, new ItemStack(ItemInit.cookedcalamari));
		CraftingHandler.addSmelting(ItemInit.donkeymeat, new ItemStack(ItemInit.cookeddonkeymeat));
		CraftingHandler.addSmelting(ItemInit.horsemeat, new ItemStack(ItemInit.cookedhorsemeat));
		CraftingHandler.addSmelting(ItemInit.mulemeat, new ItemStack(ItemInit.cookedmulemeat));
		CraftingHandler.addSmelting(ItemInit.llamameat, new ItemStack(ItemInit.cookedllamameat));
		
		
		GameRegistry.addSmelting(BlockInit.coalironmix, new ItemStack(ItemInit.steel), 3.0F);
		
		
		
	}
	        
	
    
	
	    }
	


