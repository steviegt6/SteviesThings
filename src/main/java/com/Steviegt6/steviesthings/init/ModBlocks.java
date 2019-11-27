package com.Steviegt6.steviesthings.init;

import java.util.ArrayList;
import java.util.List;

import com.Steviegt6.steviesthings.blocks.BlockBase;
import com.Steviegt6.steviesthings.blocks.EndStoneEmeraldOre;
import com.Steviegt6.steviesthings.blocks.EssenceInfusedEndstone;
import com.Steviegt6.steviesthings.blocks.NetherrackCoalOre;
import com.Steviegt6.steviesthings.blocks.NetherrackDiamondOre;
import com.Steviegt6.steviesthings.blocks.NetherrackGoldOre;
import com.Steviegt6.steviesthings.blocks.NetherrackIronOre;
import com.Steviegt6.steviesthings.blocks.NetherrackRubyOre;
import com.Steviegt6.steviesthings.blocks.RubyBlock;
import com.Steviegt6.steviesthings.blocks.RubyOre;
import com.Steviegt6.steviesthings.blocks.StoneQuartzOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block STONE_QUARTZ_ORE = new StoneQuartzOre("stone_quartz_ore", Material.ROCK);
	
	public static final Block NETHERRACK_RUBY_ORE = new NetherrackRubyOre("netherrack_ruby_ore", Material.ROCK);
	public static final Block NETHERRACK_COAL_ORE = new NetherrackCoalOre("netherrack_coal_ore", Material.ROCK);
	public static final Block NETHERRACK_IRON_ORE = new NetherrackIronOre("netherrack_iron_ore", Material.ROCK);
	public static final Block NETHERRACK_GOLD_ORE = new NetherrackGoldOre("netherrack_gold_ore", Material.ROCK);
	public static final Block NETHERRACK_DIAMOND_ORE = new NetherrackDiamondOre("netherrack_diamond_ore", Material.ROCK);
	
	public static final Block ESSENCE_INFUSED_ENDSTONE = new EssenceInfusedEndstone("essence_infused_endstone", Material.CIRCUITS);
	public static final Block END_STONE_EMERALD_ORE = new EndStoneEmeraldOre("end_stone_emerald_ore", Material.ROCK);
	
}
