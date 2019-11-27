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
	
	//Harvest, Uses, Efficiency, Damage, Enchantabiliy
	
	
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 2400, 10.0f, 4.0f, 20);
	public static final ToolMaterial MATERIAL_RUIN = EnumHelper.addToolMaterial("material_ruin", 0, 45, 1.5f, 0.0f, 14); //        WOOD(0, 59, 2.0F, 0.0F, 15),
	//IRON(2, 250, 6.0F, 2.0F, 14),
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 375, 7.0f, 2.5f, 17);
	public static final ToolMaterial MATERIAL_ENDER = EnumHelper.addToolMaterial("material_ender", 4, 5600, 13f, 6f, 35);
	
	public static final ArmorMaterial ARMOR_MATERIAL_WOOD = EnumHelper.addArmorMaterial("armor_material_wood", Reference.MOD_ID + ":oak_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
																										//LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
	public static final ArmorMaterial ARMOR_MATERIAL_DARK_WOOD = EnumHelper.addArmorMaterial("armor_material_dark_wood", Reference.MOD_ID + ":dark_oak_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_ACACIA_WOOD = EnumHelper.addArmorMaterial("armor_material_acacia_wood", Reference.MOD_ID + ":acacia_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_BIRCH_WOOD = EnumHelper.addArmorMaterial("armor_material_birch_wood", Reference.MOD_ID + ":birch_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_JUNGLE_WOOD = EnumHelper.addArmorMaterial("armor_material_jungle_wood", Reference.MOD_ID + ":jungle_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_SPRUCE_WOOD = EnumHelper.addArmorMaterial("armor_material_spruce_wood", Reference.MOD_ID + ":spruce_wood", 4, new int[] {1, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	
	public static final ArmorMaterial ARMOR_MATERIAL_STONE = EnumHelper.addArmorMaterial("armor_material_stone", Reference.MOD_ID + ":stone", 4, new int[] {2, 3, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COBBLE = EnumHelper.addArmorMaterial("armor_material_cobble", Reference.MOD_ID + ":cobble", 4, new int[] {2, 2, 2, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 4, new int[] {4, 7, 9, 4}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f);
	
	
	public static final Item ENDER_HANDLE = new ItemBase("ender_handle");
	public static final Item ESSENCE_OF_ENDER = new ItemBase("essence_of_ender");
	
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item STEEL_POWDER = new ItemBase("steel_powder");
	
	public static final Item BLAZE_HANDLE = new ItemBase("blaze_handle");
	public static final Item RUBY = new ItemBase("ruby");
	
	public static final ItemSword STEEL_COATED_IRON_SWORD = new ToolSword("steel_coated_iron_sword", MATERIAL_STEEL);
	public static final ItemSpade STEEL_COATED_IRON_SHOVEL = new ToolSpade("steel_coated_iron_spade", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_COATED_IRON_PICKAXE = new ToolPickaxe("steel_coated_iron_pickaxe", MATERIAL_STEEL);
	public static final ItemAxe STEEL_COATED_IRON_AXE = new ToolAxe("steel_coated_iron_axe", MATERIAL_STEEL);
	public static final ItemHoe STEEL_COATED_IRON_HOE = new ToolHoe("steel_coated_iron_hoe", MATERIAL_STEEL);
	
	public static final ItemSword ENDER_SWORD = new ToolSword("ender_sword", MATERIAL_ENDER);
	public static final ItemSpade ENDER_SHOVEL = new ToolSpade("ender_spade", MATERIAL_ENDER);
	public static final ItemPickaxe ENDER_PICKAXE = new ToolPickaxe("ender_pickaxe", MATERIAL_ENDER);
	public static final ItemAxe ENDER_AXE = new ToolAxe("ender_axe", MATERIAL_ENDER);
	public static final ItemHoe ENDER_HOE = new ToolHoe("ender_hoe", MATERIAL_ENDER);
	
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
	
	public static final Item ACACIA_WOOD_HELMET = new ArmorBase("acacia_wood_helmet", ARMOR_MATERIAL_ACACIA_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item ACIACA_WOOD_CHESTPLATE = new ArmorBase("acacia_wood_chestplate", ARMOR_MATERIAL_ACACIA_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ACACIA_WOOD_LEGGINGS = new ArmorBase("acacia_wood_leggings", ARMOR_MATERIAL_ACACIA_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item ACACIA_WOOD_BOOTS = new ArmorBase("acacia_wood_boots", ARMOR_MATERIAL_ACACIA_WOOD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item BIRCH_WOOD_HELMET = new ArmorBase("birch_wood_helmet", ARMOR_MATERIAL_BIRCH_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item BIRCH_WOOD_CHESTPLATE = new ArmorBase("birch_wood_chestplate", ARMOR_MATERIAL_BIRCH_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item BIRCH_WOOD_LEGGINGS = new ArmorBase("birch_wood_leggings", ARMOR_MATERIAL_BIRCH_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item BIRCH_WOOD_BOOTS = new ArmorBase("birch_wood_boots", ARMOR_MATERIAL_BIRCH_WOOD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item DARK_OAK_WOOD_HELMET = new ArmorBase("dark_oak_wood_helmet", ARMOR_MATERIAL_DARK_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item DARK_OAK_WOOD_CHESTPLATE = new ArmorBase("dark_oak_wood_chestplate", ARMOR_MATERIAL_DARK_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item DARK_OAK_WOOD_LEGGINGS = new ArmorBase("dark_oak_wood_leggings", ARMOR_MATERIAL_DARK_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item DARK_OAK_WOOD_BOOTS = new ArmorBase("dark_oak_wood_boots", ARMOR_MATERIAL_DARK_WOOD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item JUNGLE_WOOD_HELMET = new ArmorBase("jungle_wood_helmet", ARMOR_MATERIAL_JUNGLE_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item JUNGLE_WOOD_CHESTPLATE = new ArmorBase("jungle_wood_chestplate", ARMOR_MATERIAL_JUNGLE_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item JUNGLE_WOOD_LEGGINGS = new ArmorBase("jungle_wood_leggings", ARMOR_MATERIAL_JUNGLE_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item JUNGLE_WOOD_BOOTS = new ArmorBase("jungle_wood_boots", ARMOR_MATERIAL_JUNGLE_WOOD, 1, EntityEquipmentSlot.FEET);

	public static final Item SPRUCE_WOOD_HELMET = new ArmorBase("spruce_wood_helmet", ARMOR_MATERIAL_SPRUCE_WOOD, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPRUCE_WOOD_CHESTPLATE = new ArmorBase("spruce_wood_chestplate", ARMOR_MATERIAL_SPRUCE_WOOD, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPRUCE_WOOD_LEGGINGS = new ArmorBase("spruce_wood_leggings", ARMOR_MATERIAL_SPRUCE_WOOD, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPRUCE_WOOD_BOOTS = new ArmorBase("spruce_wood_boots", ARMOR_MATERIAL_SPRUCE_WOOD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item STONE_HELMET = new ArmorBase("stone_helmet", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item STONE_CHESTPLATE = new ArmorBase("stone_chestplate", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item STONE_LEGGINGS = new ArmorBase("stone_leggings", ARMOR_MATERIAL_STONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item STONE_BOOTS = new ArmorBase("stone_boots", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COBBLE_HELMET = new ArmorBase("cobble_helmet", ARMOR_MATERIAL_COBBLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item COBBLE_CHESTPLATE = new ArmorBase("cobble_chestplate", ARMOR_MATERIAL_COBBLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COBBLE_LEGGINGS = new ArmorBase("cobble_leggings", ARMOR_MATERIAL_COBBLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item COBBLE_BOOTS = new ArmorBase("cobble_boots", ARMOR_MATERIAL_COBBLE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
}
