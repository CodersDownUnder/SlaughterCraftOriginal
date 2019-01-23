package trhod177.bm.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trhod177.bm.init.BlockInit;
import trhod177.bm.init.ItemInit;

public class SlaughterCraftEventHandler
{

    @SubscribeEvent
    public void addDropForType(HarvestDropsEvent event)
    {

        try {
            Block block = event.getState().getBlock();
            Item iteminhand = event.getHarvester().getHeldItemMainhand().getItem();

            // System.out.println("Item in main hand " + iteminhand);

            /*
             * ChickenCarcass
             */
            if (block == BlockInit.chickencarcass && iteminhand == ItemInit.butcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.chickenbreast, 3));
                event.getDrops().add(new ItemStack(ItemInit.chickenleg, 2));
                event.getDrops().add(new ItemStack(ItemInit.chickenwing, 2));
                event.getDrops().add(new ItemStack(ItemInit.chickenneck, 1));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.CHICKEN));
                }

            }

            if (block == BlockInit.chickencarcass && iteminhand == ItemInit.flintbutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.chickenbreast, 2));
                event.getDrops().add(new ItemStack(ItemInit.chickenleg, 1));
                event.getDrops().add(new ItemStack(ItemInit.chickenwing, 1));
                event.getDrops().add(new ItemStack(ItemInit.chickenneck, 1));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.CHICKEN));
                }

            }

            if (block == BlockInit.chickencarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.chickenbreast, 1));
                event.getDrops().add(new ItemStack(ItemInit.chickenleg, 1));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.CHICKEN));
                }
            }

            /*
             * CowCarcass
             */
            if (block == BlockInit.cowcarcass && iteminhand == ItemInit.butcherknife) {
                Random rand = new Random();

                int a = rand.nextInt(3) + 1;

                event.getDrops().add(new ItemStack(ItemInit.cowbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.cowleg, a));
                event.getDrops().add(new ItemStack(ItemInit.cowshoulder, a));
                event.getDrops().add(new ItemStack(ItemInit.cowrump, a));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.BEEF, a));
                }

            }

            if (block == BlockInit.cowcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.cowbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.cowleg, a));
                event.getDrops().add(new ItemStack(ItemInit.cowshoulder, a));
                event.getDrops().add(new ItemStack(ItemInit.cowrump, a));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.BEEF, a));
                }

            }

            if (block == BlockInit.cowcarcass && iteminhand == ItemInit.stonebutcherknife) {
                Random rand = new Random();

                int a = rand.nextInt(2) + 1;
                int b = rand.nextInt(2) + 2;

                event.getDrops().add(new ItemStack(ItemInit.cowleg, a));
                event.getDrops().add(new ItemStack(Items.LEATHER, b));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.BEEF, 1));
                }
            }
            /*
             * Creeper Carcass
             */

            if (block == BlockInit.creepercarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(Items.SKULL, 1, 4));
                event.getDrops().add(new ItemStack(Items.GUNPOWDER, a));
            }

            if (block == BlockInit.creepercarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(1) + 1;

                event.getDrops().add(new ItemStack(Items.GUNPOWDER, a));

            }

            if (block == BlockInit.creepercarcass && iteminhand == ItemInit.stonebutcherknife) {

                Random rand = new Random();

                event.getDrops().add(new ItemStack(Items.GUNPOWDER, 1));

            }
            /*
             * Donkey Carcass
             */

            if (block == BlockInit.donkeycarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(4) + 1;
                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.donkeymeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

            }

            if (block == BlockInit.donkeycarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.donkeymeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, 1));

            }

            if (block == BlockInit.donkeycarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.donkeymeat, 1));

            }

            /*
             * Evoker Carcass
             */

            if (block == BlockInit.evokercarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int a = rand.nextInt(1);

                event.getDrops().add(new ItemStack(Items.TOTEM_OF_UNDYING, 1));
                event.getDrops().add(new ItemStack(Items.EMERALD, a));

            }

            if (block == BlockInit.evokercarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(1);

                event.getDrops().add(new ItemStack(Items.TOTEM_OF_UNDYING, 1));
                event.getDrops().add(new ItemStack(Items.EMERALD, e));

            }

            if (block == BlockInit.evokercarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(Items.TOTEM_OF_UNDYING, 1));

            }

            /*
             * Horse Carcass
             */

            if (block == BlockInit.horsecarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(4) + 1;
                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.horsemeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

            }

            if (block == BlockInit.horsecarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.horsemeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, 1));

            }

            if (block == BlockInit.horsecarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.horsemeat, 1));

            }

            /*
             * Llama Carcass
             */

            if (block == BlockInit.llamacarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(4) + 1;
                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.llamameat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

            }

            if (block == BlockInit.llamacarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.llamameat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, 1));

            }

            if (block == BlockInit.llamacarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.llamameat, 1));

            }

            /*
             * Mule Carcass
             */

            if (block == BlockInit.mulecarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(4) + 1;
                int a = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.mulemeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, a));

            }

            if (block == BlockInit.mulecarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(2) + 1;

                event.getDrops().add(new ItemStack(ItemInit.mulemeat, e));
                event.getDrops().add(new ItemStack(Items.LEATHER, 1));

            }

            if (block == BlockInit.mulecarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.mulemeat, 1));

            }

            /*
             * Pig Carcass
             */

            if (block == BlockInit.pigcarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(3) + 1;

                event.getDrops().add(new ItemStack(ItemInit.pigbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.pigleg, a));
                event.getDrops().add(new ItemStack(ItemInit.pigshoulder, a));
                event.getDrops().add(new ItemStack(ItemInit.pigrump, a));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.PORKCHOP, a));
                }

            }

            if (block == BlockInit.pigcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(1) + 1;

                event.getDrops().add(new ItemStack(ItemInit.pigbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.pigleg, a));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.PORKCHOP, a));
                }

            }

            if (block == BlockInit.pigcarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.pigleg, 2));

                if (ConfigHandler.adddefaultdrops = true) {

                    event.getDrops().add(new ItemStack(Items.PORKCHOP, 1));
                }

            }

            /*
             * Sheep Carcass
             */

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(3) + 1;

                event.getDrops().add(new ItemStack(ItemInit.muttonbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.muttonleg, a));
                event.getDrops().add(new ItemStack(ItemInit.muttonshoulder, a));
                event.getDrops().add(new ItemStack(ItemInit.muttonrump, a));

                if (ConfigHandler.adddefaultdrops == true) {

                    event.getDrops().add(new ItemStack(Items.MUTTON, a));
                }

            }

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(1) + 1;

                event.getDrops().add(new ItemStack(ItemInit.muttonbelly, a));
                event.getDrops().add(new ItemStack(ItemInit.muttonleg, a));

                if (ConfigHandler.adddefaultdrops == true) {

                    event.getDrops().add(new ItemStack(Items.MUTTON, a));
                }

            }

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.muttonleg, 2));
                event.getDrops().add(new ItemStack(ItemInit.muttonshoulder, 1));

                if (ConfigHandler.adddefaultdrops == true) {

                    event.getDrops().add(new ItemStack(Items.MUTTON, 2));
                }

            }

            /*
             * Slime Carcass
             */

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(2);

                event.getDrops().add(new ItemStack(Items.SLIME_BALL, e));
                event.getDrops().add(new ItemStack(BlockInit.slimeskull, 1));
            }

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(1);

                event.getDrops().add(new ItemStack(Items.SLIME_BALL, e));
                event.getDrops().add(new ItemStack(BlockInit.slimeskull, 1));
            }

            if (block == BlockInit.sheepcarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(Items.SLIME_BALL, 1));

            }

            /**
             * Squid Carcass
             */
            if (block == BlockInit.squidcarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(3) + 1;
                int a = rand.nextInt(6) + 1;

                event.getDrops().add(new ItemStack(Items.DYE, e, 0));
                event.getDrops().add(new ItemStack(ItemInit.rawcalamari, a));
            }

            if (block == BlockInit.squidcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(3) + 1;
               

                event.getDrops().add(new ItemStack(Items.DYE, e, 0));
                event.getDrops().add(new ItemStack(ItemInit.rawcalamari, e));
            }

            if (block == BlockInit.squidcarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(ItemInit.rawcalamari, 2));

            }

            /**
             * Villager Carcass
             */

            if (block == BlockInit.villagercarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                // System.out.println(e);

                if (e <= 10) {

                    event.getDrops().add(new ItemStack(Items.EMERALD, 1));
                }

                else if (e <= 60 != e <= 10) {

                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                } else {

                    event.getDrops().add(new ItemStack(Items.APPLE, 1));
                }
            }

            if (block == BlockInit.villagercarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                // System.out.println(e);

                if (e <= 60 != e <= 10) {

                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                } else {

                    event.getDrops().add(new ItemStack(Items.APPLE, 1));
                }
            }

            if (block == BlockInit.villagercarcass && iteminhand == ItemInit.stonebutcherknife) {

                event.getDrops().add(new ItemStack(Items.APPLE, 1));
            }

            /**
             * Vindicator Carcass
             */
            if (block == BlockInit.vindicatorcarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                // System.out.println(e);

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.IRON_AXE, 1));
                } else if (e <= 60 != e <= 10) {

                    event.getDrops().add(new ItemStack(Items.EMERALD, 1));
                } else {

                    event.getDrops().add(new ItemStack(Items.APPLE, 1));
                }
            }

            if (block == BlockInit.vindicatorcarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                // System.out.println(e);

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.IRON_AXE, 1));
                }

                if (e <= 60 != e <= 10) {

                    event.getDrops().add(new ItemStack(Items.EMERALD, 1));
                }
            }

            if (block == BlockInit.vindicatorcarcass && iteminhand == ItemInit.stonebutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                // System.out.println(e);

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.IRON_AXE, 1));
                }

            }

            /**
             * Zombie Carcass
             */
            if (block == BlockInit.zombiecarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int b = rand.nextInt(10);
                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.IRON_INGOT, 1));
                    event.getDrops().add(new ItemStack(Items.POTATO, 1));
                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                }


            }

            if (block == BlockInit.zombiecarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                }
            }

            if (block == BlockInit.zombiecarcass && iteminhand == ItemInit.stonebutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

            }
            
            /**
             * Zombie Villager Carcass
             */
            if (block == BlockInit.zombievillagercarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int b = rand.nextInt(10);
                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.IRON_INGOT, 1));
                    event.getDrops().add(new ItemStack(Items.POTATO, 1));
                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                }


            }

            if (block == BlockInit.zombievillagercarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

                if (e <= 8) {

                    event.getDrops().add(new ItemStack(Items.CARROT, 1));
                }
            }

            if (block == BlockInit.zombievillagercarcass && iteminhand == ItemInit.stonebutcherknife) {

                Random rand = new Random();

                int a = rand.nextInt(2);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));

            }
            
            
            /**
             * Zombie Pigman Carcass
             */
            if (block == BlockInit.zombiepigmancarcass && iteminhand == ItemInit.butcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int a = rand.nextInt(1);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));
                event.getDrops().add(new ItemStack(Items.GOLD_NUGGET, a));
                
                if (e <= 2.5) {
                    event.getDrops().add(new ItemStack(Items.GOLD_INGOT, 1));
                }
                
                if (e <=8.5) {
                    event.getDrops().add(new ItemStack(Items.GOLDEN_SWORD, 1));
                }

               

            }

            if (block == BlockInit.zombiepigmancarcass && iteminhand == ItemInit.flintbutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int a = rand.nextInt(1);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));
                event.getDrops().add(new ItemStack(Items.GOLD_NUGGET, a));
                
                if (e <= 2.5) {
                    event.getDrops().add(new ItemStack(Items.GOLD_INGOT, 1));
                }
                
               

            }

            if (block == BlockInit.zombiepigmancarcass && iteminhand == ItemInit.stonebutcherknife) {

                Random rand = new Random();
                int e = rand.nextInt(100);
                int a = rand.nextInt(1);
                // System.out.println(e);

                event.getDrops().add(new ItemStack(Items.ROTTEN_FLESH, a));
                event.getDrops().add(new ItemStack(Items.GOLD_NUGGET, a));
                
                


            }

        } catch (NullPointerException e) {

        }

    }
}
