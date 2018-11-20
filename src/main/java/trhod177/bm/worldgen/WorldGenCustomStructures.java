package trhod177.bm.worldgen;

import java.util.ArrayList;
import java.util.Random;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.biome.BiomeMushroomIsland;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.actors.threadpool.Arrays;
import trhod177.bm.handlers.ConfigHandler;

public class WorldGenCustomStructures implements IWorldGenerator
{
	public static final WorldGenStructure Butcher = new WorldGenStructure("butcher");
	
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 2:
			
			break;
			
		case 1:
			
			break;
			
		case 0:
			
			if (ConfigHandler.addbutcherbuildingtp == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 100, Blocks.GRASS, BiomePlains.class);
			} 
			if (ConfigHandler.addbutcherbuildingtf == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 100, Blocks.GRASS, BiomeForest.class);
			}
			if (ConfigHandler.addbutcherbuildingtt == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 100, Blocks.GRASS, BiomeTaiga.class);
			}
			if (ConfigHandler.addbutcherbuildingtj == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 100, Blocks.GRASS, BiomeJungle.class);
			}
			if (ConfigHandler.addbutcherbuildingts == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 100, Blocks.GRASS, BiomeSavanna.class);
			}
			if (ConfigHandler.addbutcherbuildingtd == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 300, Blocks.SAND, BiomeDesert.class);
			}
			if (ConfigHandler.addbutcherbuildingth == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 300, Blocks.GRASS, BiomeHills.class);
			}
			if (ConfigHandler.addbutcherbuildingtms == true) { 
			generateStructure(Butcher, world, random, chunkX, chunkZ, 300, Blocks.STAINED_HARDENED_CLAY, BiomeMesa.class);
			}
			if (ConfigHandler.addbutcherbuildingtm == true) {
			generateStructure(Butcher, world, random, chunkX, chunkZ, 300, Blocks.MYCELIUM, BiomeMushroomIsland.class);
			}
			
			
			
			break;
			
		case -1:
			
		}
	}
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15) + 8;
		int z = (chunkZ * 16) + random.nextInt(15) + 8;
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		
		
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15) + 8;
		int z = (chunkZ * 16) + random.nextInt(15) + 8;
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}