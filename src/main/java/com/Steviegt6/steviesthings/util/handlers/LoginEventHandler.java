package com.Steviegt6.steviesthings.util.handlers;

import com.Steviegt6.steviesthings.init.ModBlocks;
import com.Steviegt6.steviesthings.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

//Code sampled from https://github.com/Maxwell-lt/MobBlocker/blob/1.12.2-1.5.0/src/main/java/maxwell_lt/mobblocker/LoginEventHandler.java - Many thanks, Maxwell!

public class LoginEventHandler
{
	
	@SubscribeEvent
	public void onPlayerJoinWorld(EntityJoinWorldEvent event)
	{
		if (!event.getEntity().world.isRemote && event.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.getEntity();
			NBTTagCompound persistentTag;
			if (player.getEntityData().hasKey(EntityPlayer.PERSISTED_NBT_TAG)) {
				persistentTag = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
			}
			else
			{
				persistentTag = new NBTTagCompound();
				player.getEntityData().setTag(EntityPlayer.PERSISTED_NBT_TAG, persistentTag);
			}
			NBTTagCompound tag;
			if (persistentTag.hasKey("mobblocker"))
			{
				tag = persistentTag.getCompoundTag("mobblocker");
			}
			else
			{
				tag = new NBTTagCompound();
				persistentTag.setTag("mobblocker", tag);
			}
			if (!tag.getBoolean("receivedprotector"))
			{
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.RUIN_SWORD));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.RUIN_AXE));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.RUIN_PICKAXE));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.RUIN_SHOVEL));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.RUIN_HOE));
				
				tag.setBoolean("receivedprotector", true);
			}
			
		}
	}
}