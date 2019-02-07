package trhod177.bm.handlers;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.RecipeBookCloning;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.RecipeRepairItem;
import net.minecraft.item.crafting.RecipeTippedArrow;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.item.crafting.RecipesBanners;
import net.minecraft.item.crafting.RecipesMapCloning;
import net.minecraft.item.crafting.RecipesMapExtending;
import net.minecraft.item.crafting.ShieldRecipes;
import net.minecraft.item.crafting.ShulkerBoxRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;
import trhod177.bm.init.ArmourInit;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class RecipeHandler {

    /*
    if (invCraft.getStackInSlot(0).getItem() == AlloycraftItems.alloy) {
        if (invCraft.getStackInSlot(1).getItem() == AlloycraftItems.alloy) {
            if (invCraft.getStackInSlot(2).getItem() == AlloycraftItems.alloy) {
                if (invCraft.getStackInSlot(3).getItem() == AlloycraftItems.alloy) {
                    if (invCraft.getStackInSlot(5).getItem() == AlloycraftItems.alloy) {
                        ItemStack alloy1 = invCraft.getStackInSlot(0);
                        ItemStack alloy2 = invCraft.getStackInSlot(1);
                        ItemStack alloy3 = invCraft.getStackInSlot(2);
                        ItemStack alloy4 = invCraft.getStackInSlot(3);
                        ItemStack alloy5 = invCraft.getStackInSlot(5);
                        int prop1 = (int) Math.sqrt(alloy1.getTagCompound().getInteger("Strength")
                                + alloy2.getTagCompound().getInteger("Strength")
                                + alloy3.getTagCompound().getInteger("Strength")
                                + alloy4.getTagCompound().getInteger("Strength")
                                + alloy5.getTagCompound().getInteger("Strength"));
                        int prop2 = (int) Math.sqrt(alloy1.getTagCompound().getInteger("Durability")
                                + alloy2.getTagCompound().getInteger("Durability")
                                + alloy3.getTagCompound().getInteger("Durability")
                                + alloy4.getTagCompound().getInteger("Durability")
                                + alloy5.getTagCompound().getInteger("Durability"));
                        int prop3 = (int) Math.sqrt(alloy1.getTagCompound().getInteger("Enchantability")
                                + alloy2.getTagCompound().getInteger("Enchantability")
                                + alloy3.getTagCompound().getInteger("Enchantability")
                                + alloy4.getTagCompound().getInteger("Enchantability")
                                + alloy5.getTagCompound().getInteger("Enchantability"));
                        result = new ItemStack(AlloycraftItems.alloyhelmet, 1);
                        ((ItemArmor) result.getItem()).setColor(result, 25555555);    
                        result.setTagCompound(new NBTTagCompound());
                        result.getTagCompound().setInteger("Strength", prop1);
                        result.getTagCompound().setInteger("Durability", prop2);
                        result.getTagCompound().setInteger("Enchantability", prop3);
                        ((ItemArmor) result.getItem()).setColor(result, new Color(result.getTagCompound().getInteger("Strength"), result.getTagCompound().getInteger("Durability"), result.getTagCompound().getInteger("Enchantability")).getRGB());    
                        return result;
                    }
                }
            }
        }
    }
	*/
	
	public static void registerShapedRecipes() {
		
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastbeef), new Object[] {"SSS","SIS","SSS", 'S', "listAllbeefraw", 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastchicken), new Object[] {"BBB","BIB","BBB", 'B', "listAllchickenraw", 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastmutton), new Object[] {"SSS","SIS","SSS", 'S', "listAllmuttonraw", 'I', Items.STICK});
     CraftingHandler.addShapedOreRecipe(new ItemStack(BlockInit.uncookedroastpork), new Object[] {"SSS","SIS","SSS", 'S', "listAllporkraw", 'I', Items.STICK});     
     CraftingHandler.addShapedOreRecipe(new ItemStack(ItemInit.butcherknife), new Object[] {"SXX","XSX","XXT", 'S', "ingotSteel", 'T', Items.STICK, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedOreRecipe(new ItemStack(ItemInit.flintbutcherknife), new Object[] {"SXX","XSX","XXT", 'S', Items.FLINT, 'T', Items.STICK, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedOreRecipe(new ItemStack(ItemInit.stonebutcherknife), new Object[] {"SXX","XSX","XXT", 'S', Blocks.COBBLESTONE, 'T', Items.STICK, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimeboots), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimehelmet), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimechestplate), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     CraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.slimeleggings), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.slimeskinleather, 'X', Ingredient.EMPTY});
     
     
	}

	public static void registerShapelessRecipes() {
		
		
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastbeefslice, 12), new Object[] {new ItemStack(ItemInit.butcherknife, 12, OreDictionary.WILDCARD_VALUE),  BlockInit.roastbeef});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastchickenslice, 12), new Object[] {new ItemStack(ItemInit.butcherknife, 12, OreDictionary.WILDCARD_VALUE), BlockInit.roastchicken});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastporkslice, 12), new Object[] {new ItemStack(ItemInit.butcherknife, 12, OreDictionary.WILDCARD_VALUE), BlockInit.roastpork});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.roastmuttonslice, 12), new Object[] {new ItemStack(ItemInit.butcherknife, 12, OreDictionary.WILDCARD_VALUE), BlockInit.roastmutton});
		CraftingHandler.addShapelessRecipe(new ItemStack(ItemInit.slimeskinleather, 4), new Object[] {new ItemStack(ItemInit.butcherknife, 12, OreDictionary.WILDCARD_VALUE), BlockInit.slimeskull});
		CraftingHandler.addShapelessRecipe(new ItemStack(Items.DYE, 4, 15), new Object[] {ItemInit.chickenneck});
		
	
		
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.beefbroth, 1), new Object[] {Items.BOWL, "listAllbeefcooked", "listAllbeefcooked", "listAllbeefcooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.lambbroth, 1), new Object[] {Items.BOWL, "listAllmuttoncooked", "listAllmuttoncooked", "listAllmuttoncooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.porkbroth, 1), new Object[] {Items.BOWL, "listAllporkcooked", "listAllporkcooked", "listAllporkcooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.chickenbroth, 1), new Object[] {Items.BOWL, "listAllchickencooked", "listAllchickencooked", "listAllchickencooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.fishbroth, 1), new Object[] {Items.BOWL, Items.COOKED_FISH, Items.COOKED_FISH, Items.COOKED_FISH});
		
		
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.beefsoup, 1), new Object[] {ItemInit.beefbroth, Items.CARROT});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.lambsoup, 1), new Object[] {ItemInit.lambbroth, Items.CARROT});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.porksoup, 1), new Object[] {ItemInit.porkbroth, Items.CARROT});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.chickensoup, 1), new Object[] {ItemInit.chickenbroth, Items.CARROT});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.fishsoup, 1), new Object[] {ItemInit.fishbroth, Items.CARROT});
		
		
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.beefstew, 1), new Object[] {ItemInit.beefsoup, Items.CARROT, Items.BAKED_POTATO, "listAllbeefcooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.lambstew, 1), new Object[] {ItemInit.lambsoup, Items.CARROT, Items.BAKED_POTATO, "listAllmuttoncooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.porkstew, 1), new Object[] {ItemInit.porksoup, Items.CARROT, Items.BAKED_POTATO, "listAllporkcooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.chickenstew, 1), new Object[] {ItemInit.chickensoup, Items.CARROT, Items.BAKED_POTATO, "listAllchickencooked"});
		CraftingHandler.addShapelessOreRecipe(new ItemStack(ItemInit.fishstew, 1), new Object[] {ItemInit.fishsoup, Items.CARROT, Items.BAKED_POTATO, Items.COOKED_FISH});
		
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
		
		
		CraftingHandler.addSmelting(BlockInit.coalironmix, new ItemStack(ItemInit.steel), 3.0F);
		
		
		
	}
	        
	
    
	
	    }
	


