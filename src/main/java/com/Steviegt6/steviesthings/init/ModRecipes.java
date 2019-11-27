package com.Steviegt6.steviesthings.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 2), 3.0f);
		GameRegistry.addSmelting(ModBlocks.NETHERRACK_RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.STONE_QUARTZ_ORE, new ItemStack(Items.QUARTZ, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.ESSENCE_INFUSED_ENDSTONE, new ItemStack(ModItems.ESSENCE_OF_ENDER, 4), 5.0f);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.STEEL_INGOT, 1), 0.5f);
	}
	
}
