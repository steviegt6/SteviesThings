package com.Steviegt6.steviesthings.items.tools;

import com.Steviegt6.steviesthings.Main;
import com.Steviegt6.steviesthings.init.ModItems;
import com.Steviegt6.steviesthings.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0f, -3.0f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}