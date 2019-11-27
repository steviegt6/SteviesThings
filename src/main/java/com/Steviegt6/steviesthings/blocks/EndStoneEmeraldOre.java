package com.Steviegt6.steviesthings.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EndStoneEmeraldOre extends BlockBase
{

	public EndStoneEmeraldOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreadkable();
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.EMERALD;
	}
	
	public int quantityDropped(Random rand) {
		int max = 3;
		int min = 2;
		return rand.nextInt(max) + min;
	}

}
