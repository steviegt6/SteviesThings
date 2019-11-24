package com.Steviegt6.steviesthings.items.tools;

import com.Steviegt6.steviesthings.Main;
import com.Steviegt6.steviesthings.init.ModItems;
import com.Steviegt6.steviesthings.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{

	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
