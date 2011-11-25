package com.imdeity.spells.spells;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.imdeity.spells.utils.Inventory;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.utils.Timer;
import com.imdeity.spells.Admin.Override;

public class Humidify implements CommandExecutor {
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            Inventory.getHumidifyInventory(player, Deity.spells.HumidifyItem);
	            Inventory.getBuckets(player, 325);
	            if (Inventory.reagents == true && Override.Override == false && Timer.canHumidify == true) {
	         
	            	Inventory.getHumidifyInventory(player, Deity.spells.HumidifyItem);
	            	Inventory.removeBuckets(player, 325);
	            	Inventory.removeHumidifyItem(player, Deity.spells.HumidifyItem);
	            	Inventory.addHumidifyWater(player, 326);
	            
	            } if (Override.Override == true) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:Spells have been disabled by an admin");
	            } if (Inventory.reagents == false) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You do not have the reagents for this spell");
	            } if (Inventory.bucketamount == 0) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You don't have any buckets");
	            }
	            
	          
	            }
	            
	         
	        
	return true;
	
	        }
	        
	}