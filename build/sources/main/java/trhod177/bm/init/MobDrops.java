package trhod177.bm.init;

import java.util.Collection;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
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
        if (ConfigHandler.overridemobdrops == true) {
            if (event.getEntityLiving() instanceof EntitySheep) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.sheepcarcass), 1, 0.0F);
                    event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.WOOL), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.sheepcarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityPig) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.pigcarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.pigcarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityChicken) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.chickencarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.chickencarcass), 1, 0.0F);
                }
            }

            /*
             * if (event.getEntityLiving() instanceof EntityRabbit) {
             *       event.getDrops().clear();
             *       event.getEntityLiving().dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.rabbitcarcass), 1 ,0.0F);
             *
             * }
             */
            
            if (event.getEntityLiving() instanceof EntityHorse) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.horsecarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.horsecarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityDonkey) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.donkeycarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.donkeycarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityMule) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.mulecarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.mulecarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityLlama) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.llamacarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.llamacarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntitySquid) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.squidcarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.squidcarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityMooshroom) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.BROWN_MUSHROOM), 2, 0.0F);
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(Blocks.RED_MUSHROOM), 2, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {}
            }

            if (event.getEntityLiving() instanceof EntityCow) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.cowcarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.cowcarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityVillager) {
                event.getEntityLiving()
                     .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.villagercarcass), 1, 0.0F);
            }

            if (event.getEntityLiving() instanceof EntityZombie) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombiecarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombiecarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityZombieVillager) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombievillagercarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombievillagercarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityPigZombie) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombiepigmancarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.zombiepigmancarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntitySlime) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.slimecarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.slimecarcass), 1, 0.0F);
                }
            }

            if (event.getEntityLiving() instanceof EntityCreeper) {
                if (ConfigHandler.dropdefaultandcarcassondeath == false) {
                    event.getDrops().clear();
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.creepercarcass), 1, 0.0F);
                }

                if (ConfigHandler.dropdefaultandcarcassondeath == true) {
                    event.getEntityLiving()
                         .dropItemWithOffset(ItemBlock.getItemFromBlock(BlockInit.creepercarcass), 1, 0.0F);
                }
            }
        }
    }
}



