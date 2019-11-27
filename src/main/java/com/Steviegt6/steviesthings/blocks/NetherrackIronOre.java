package com.Steviegt6.steviesthings.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class NetherrackIronOre extends BlockBase
{

	public NetherrackIronOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(8.0f);
		setResistance(8.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreadkable();
		
	}
	@Override
	public Block getBlockDropped(IBlockState state, Random rand, int fortune) {
		return Blocks.IRON_ORE;
	}
	
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	

}
