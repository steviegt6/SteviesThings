package com.Steviegt6.steviesthings.init;

import java.util.ArrayList;
import java.util.List;

import com.Steviegt6.steviesthings.items.ItemBase;
import com.Steviegt6.steviesthings.items.armor.ArmorBase;
import com.Steviegt6.steviesthings.items.tools.ToolAxe;
import com.Steviegt6.steviesthings.items.tools.ToolHoe;
import com.Steviegt6.steviesthings.items.tools.ToolPickaxe;
import com.Steviegt6.steviesthings.items.tools.ToolSpade;
import com.Steviegt6.steviesthings.items.tools.ToolSword;
import com.Steviegt6.steviesthings.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 2400, 10.0f, 4.0f, 20);
	public static final ToolMaterial MATERIAL_RUIN = EnumHelper.addToolMaterial("material_ruin", 0, 45, 1.5f, 0.0f, 14); //        WOOD(0, 59, 2.0F, 0.0F, 15),
	public static final ArmorMaterial ARMOR_MATERIAL_WOOD = EnumHelper.addArmorMaterial("armor_material_wood", Reference.MOD_ID + ":oak_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
																										//LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
	public static final Item BLAZE_HANDLE = new ItemBase("blaze_handle");
	public static final Item RUBY = new ItemBase("ruby");
	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_spade", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemSword RUIN_SWORD = new ToolSword("ruin_sword", MATERIAL_RUIN);
	public static final ItemSpade RUIN_SHOVEL = new ToolSpade("ruin_spade", MATERIAL_RUIN);
	public static final ItemPickaxe RUIN_PICKAXE = new ToolPickaxe("ruin_pickaxe", MATERIAL_RUIN);
	public static final ItemAxe RUIN_AXE = new ToolAxe("ruin_axe", MATERIAL_RUIN);
	public static final ItemHoe RUIN_HOE = new ToolHoe("ruin_hoe", MATERIAL_RUIN);
	
	public static final Item OAK_WOOD_HELMET = new ArmorBase("oak_wood_helmet", ARMOR_MATERIAL_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item OAK_WOOD_CHESTPLATE = new ArmorBase("oak_wood_chestplate", ARMOR_MATERIAL_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item OAK_WOOD_LEGGINGS = new ArmorBase("oak_wood_leggings", ARMOR_MATERIAL_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item OAK_WOOD_BOOTS = new ArmorBase("oak_wood_boots", ARMOR_MATERIAL_WOOD, 1, EntityEquipmentSlot.FEET);
	
}
