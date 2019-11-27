package com.Steviegt6.steviesthings.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StoneQuartzOre extends BlockBase
{

	public StoneQuartzOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreadkable();
		
	}

}
