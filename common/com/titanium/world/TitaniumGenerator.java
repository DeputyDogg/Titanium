package com.titanium.world;

import java.util.Random;

import com.titanium.blocks.Blocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TitaniumGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:	
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		
		// See spawnOres method below for parameter values
		this.spawnOres(Blocks.titaniumOre, world, random, chunkX, chunkZ, 16, 16, 5, 20, 20, 40);
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}
	
	private void generateEnd(World world, Random random, int i, int j) {
		
	}
	
	public void spawnOres(Block block, World world, Random random, int chunkX, int chunkZ, int XMax, int ZMax, int veinSize,
			int spawnChance, int YMin, int YMax) {
	
		for (int i = 0; i < spawnChance; i++) {
			int posX = chunkX + random.nextInt(XMax);
			int posY = YMin + random.nextInt(YMax - YMin);
			int posZ = chunkZ + random.nextInt(ZMax);
			(new WorldGenMinable(Blocks.titaniumOre.blockID, veinSize)).generate(world, random, posX, posY, posZ);
		}
	}

}
