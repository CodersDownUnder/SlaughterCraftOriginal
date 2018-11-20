package trhod177.bm.worldgen;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import trhod177.bm.init.BlockInit;

public class WorldGenCustomOres implements IWorldGenerator{
	
	private WorldGenerator coalironmix;
	
	public WorldGenCustomOres() {
		coalironmix = new WorldGenMinable(BlockInit.coalironmix.getDefaultState(), 3);
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		
		case 0:
			
			runGenerator(coalironmix, world, random, chunkX, chunkZ, 20, 0, 100);
			
			break;
		
		    
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
   
			if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
			
			int heightDiff = maxHeight - minHeight + 1;
			for(int i = 0; i < chance; i++) {
				int x = chunkX * 16 + rand.nextInt(16);
				int y = minHeight + rand.nextInt(heightDiff);
				int z = chunkZ * 16 + rand.nextInt(16);
				
				gen.generate(world, rand, new BlockPos(x,y,z));
			}
}

}
