package trhod177.bm.init;

import java.util.Collection;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trhod177.bm.handlers.ConfigHandler;

public class MobDrops {
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		
    if(ConfigHandler.overridemobdrops == true) {
		
    	
    	
	
	if (event.getEntityLiving() instanceof EntitySheep) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.sheepcarcass), 1 ,0.0F);
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.WOOL), 1 ,0.0F);
	}
	
	if (event.getEntityLiving() instanceof EntityPig) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.pigcarcass), 1 ,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityChicken) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.chickencarcass), 1 ,0.0F);
		
	}
	
	/*if (event.getEntityLiving() instanceof EntityRabbit) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.rabbitcarcass), 1 ,0.0F);
		
	}*/
	
	if (event.getEntityLiving() instanceof EntityHorse) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.horsecarcass), 1,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityDonkey) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.donkeycarcass), 1,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityMule) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.mulecarcass), 1,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityLlama) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.llamacarcass), 1,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntitySquid) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.squidcarcass), 1,0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityMooshroom) {
		event.getDrops().clear();
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.BROWN_MUSHROOM), 2, 0.0F);
		event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.RED_MUSHROOM), 2, 0.0F);
		
	}
	
	if (event.getEntityLiving() instanceof EntityCow) {
	event.getDrops().clear();
	event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.cowcarcass), 1, 0.0F);
    } 
	
    }
	} 
	}

