package com.Steviegt6.steviesthings.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class NetherrackCoalOre extends BlockBase
{

	public NetherrackCoalOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(5.0f);
		setHarvestLevel("pickaxe", 0);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreadkable();
		
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.COAL;
	}
	
	public int quantityDropped(Random rand) {
		int max = 2;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	

}
