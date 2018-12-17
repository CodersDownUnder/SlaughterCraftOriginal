package trhod177.bm.books;

import amerifrance.guideapi.api.GuideAPI;
import amerifrance.guideapi.api.GuideBook;
import amerifrance.guideapi.api.IGuideBook;
import amerifrance.guideapi.api.IPage;
import amerifrance.guideapi.api.impl.Book;
import amerifrance.guideapi.api.impl.Entry;
import amerifrance.guideapi.api.impl.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.impl.abstraction.EntryAbstract;
import amerifrance.guideapi.category.CategoryItemStack;
import amerifrance.guideapi.entry.EntryItemStack;
import amerifrance.guideapi.page.PageFurnaceRecipe;
import amerifrance.guideapi.page.PageIRecipe;
import amerifrance.guideapi.page.PageJsonRecipe;
import amerifrance.guideapi.page.PageText;
import amerifrance.guideapi.page.reciperenderer.ShapedOreRecipeRenderer;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;
import trhod177.bm.handlers.CraftingHandler;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@GuideBook
public class ButcheryModGuideApi implements IGuideBook {


    public static Book ButcheryModGuideBook;

    @Nonnull
    @Override
    public Book buildBook() {
        // Create the map of entries. A LinkedHashMap is used to retain the order of entries.
        Map<ResourceLocation, EntryAbstract> carcasses = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> foods = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> items = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> blocks = new LinkedHashMap<ResourceLocation, EntryAbstract>();

        
        // start of carcasses category
        // Creation of our first entry.
        List<IPage> pages1 = new ArrayList<IPage>();
        pages1.add(new PageText("Current Carcasses In The Game:                Cow Carcass,           Chicken Carcass, Donkey Carcass,       Pig Carcass,            Mule Carcass,            Horse Carcass,          Llama Carcass,         Sheep Carcass,        Squid Carcass "));
        carcasses.put(new ResourceLocation("example", "Carcasses"), new EntryItemStack(pages1, "Carcasses In Mod", new ItemStack(BlockInit.cowcarcass)));

        // Creation of our second entry.
        List<IPage> pages2 = new ArrayList<IPage>();
        pages2.add(new PageText("To collect drops from carcasses mine with a pickaxe or a butchers knife."));
        carcasses.put(new ResourceLocation("example2", "Carcasses2"), new EntryItemStack(pages2, "How to Carcass", new ItemStack(BlockInit.pigcarcass)));
        
        // end of carcasses category
        
        
        // start of blocks category
        
        List<IPage> pages3 = new ArrayList<IPage>();
        pages3.add(new PageText("Steel ore spawns between levels 0 and 100 and is somewhat uncommon"));
        blocks.put(new ResourceLocation("steel", "steel"), new EntryItemStack(pages3, "How to steel", new ItemStack(BlockInit.coalironmix)));
        
        // end of blocks category
        
        
        // start of foods category
        
        List<IPage> pages4 = new ArrayList<IPage>();
        pages4.add(new PageText("All meats added by this mod can be cooked except chicken necks they are useless and chicken carcasses can be cooked in a furnce to make a cooked chicken."));
        foods.put(new ResourceLocation("foods", "foods"), new EntryItemStack(pages4, "How to meat", new ItemStack(ItemInit.cookeddonkeymeat)));
        // end of foods category
        
        
        // start of items category
        
        
        
        
        //end of items category

        // Setup the list of categories and add our entries to it.
        List<CategoryAbstract> categories = new ArrayList<CategoryAbstract>();
        categories.add(new CategoryItemStack(carcasses, "Carcasses", new ItemStack(BlockInit.chickencarcass)));
        categories.add(new CategoryItemStack(blocks, "Blocks", new ItemStack(BlockInit.coalironmix)));
        categories.add(new CategoryItemStack(foods, "Foods", new ItemStack(ItemInit.chickenbreast)));
        categories.add(new CategoryItemStack(items, "Items", new ItemStack(ItemInit.butcherknife)));
        
        

        // Setup the book's base information
        ButcheryModGuideBook = new Book();
        ButcheryModGuideBook.setTitle("ButcheryCraft Guide");
        ButcheryModGuideBook.setDisplayName("ButcheryCraft Guide");
        ButcheryModGuideBook.setAuthor("Trhod177");
        ButcheryModGuideBook.setColor(Color.CYAN);
        ButcheryModGuideBook.setCategoryList(categories);
        ButcheryModGuideBook.setRegistryName(new ResourceLocation("Bm", "ButcheryModGuideBook"));
        return ButcheryModGuideBook;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleModel(ItemStack bookStack) {
        // Use the default GuideAPI model 
        GuideAPI.setModel(ButcheryModGuideBook);
    }

    @Override
    public void handlePost(ItemStack bookStack) {
        // Register a recipe so player's can obtain the book
        CraftingHandler.addShapelessRecipe(bookStack, new Object [] {ItemInit.chickenneck, Items.BOOK});
    }

}