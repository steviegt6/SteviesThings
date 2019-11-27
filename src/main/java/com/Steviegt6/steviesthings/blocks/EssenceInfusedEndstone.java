package com.Steviegt6.steviesthings.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EssenceInfusedEndstone extends BlockBase
{

	public EssenceInfusedEndstone(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SNOW);
		setHardness(6.0f);
		setResistance(35.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.5f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}

}
