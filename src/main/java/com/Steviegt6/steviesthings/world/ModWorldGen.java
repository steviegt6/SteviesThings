package com.Steviegt6.steviesthings.world;

import java.util.Random;

import com.Steviegt6.steviesthings.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	private WorldGenerator ruby_ore;
	private WorldGenerator netherrack_ruby_ore;  //copper_ore_end;
	private WorldGenerator essence_of_endstone;
	private WorldGenerator netherrack_coal_ore;
	private WorldGenerator netherrack_gold_ore;
	private WorldGenerator netherrack_diamond_ore;
	private WorldGenerator netherrack_iron_ore;
	private WorldGenerator stone_quartz_ore;
	private WorldGenerator end_stone_emerald_ore;
	
	public ModWorldGen() 
	{
		netherrack_ruby_ore = new WorldGenMinable(ModBlocks.NETHERRACK_RUBY_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		netherrack_iron_ore = new WorldGenMinable(ModBlocks.NETHERRACK_IRON_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		netherrack_coal_ore = new WorldGenMinable(ModBlocks.NETHERRACK_COAL_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		netherrack_gold_ore = new WorldGenMinable(ModBlocks.NETHERRACK_GOLD_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		netherrack_diamond_ore = new WorldGenMinable(ModBlocks.NETHERRACK_DIAMOND_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ruby_ore = new WorldGenMinable(ModBlocks.RUBY_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		essence_of_endstone = new WorldGenMinable(ModBlocks.ESSENCE_INFUSED_ENDSTONE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		stone_quartz_ore = new WorldGenMinable(ModBlocks.STONE_QUARTZ_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		//copper_ore_end = new WorldGenMinable(BlockInit.COPPER_ORE_END.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		end_stone_emerald_ore = new WorldGenMinable(ModBlocks.END_STONE_EMERALD_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(netherrack_ruby_ore, world, random, chunkX, chunkZ, 30, 0, 100);
			runGenerator(netherrack_coal_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(netherrack_gold_ore, world, random, chunkX, chunkZ, 40, 0, 100);
			runGenerator(netherrack_iron_ore, world, random, chunkX, chunkZ, 45, 0, 100);
			runGenerator(netherrack_diamond_ore, world, random, chunkX, chunkZ, 35, 0, 100);
			
			break;
			
		case 0:
			
			runGenerator(ruby_ore, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(stone_quartz_ore, world, random, chunkX, chunkZ, 25, 0, 100);
			
			break;
			
		case 1:
			
			runGenerator(essence_of_endstone, world, random, chunkX, chunkZ, 50, 0, 256);
			runGenerator(end_stone_emerald_ore, world, random, chunkX, chunkZ, 50, 0, 256);
			
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}