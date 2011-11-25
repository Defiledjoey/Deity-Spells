package com.imdeity.spells.spells;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.imdeity.spells.utils.Inventory;
import com.imdeity.spells.utils.Timer;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Admin.Override;

public class HealSpell implements CommandExecutor {
	
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            Inventory.getHealInventory(player, Deity.spells.HealItem);
	      if (Inventory.reagents == true && player.getHealth() != 20 && Override.Override == false && Timer.canHeal == true) {
	    	  Inventory.getHealInventory(player, Deity.spells.HealItem);
	          player.setHealth(player.getHealth() + 5);
	          Inventory.removeHealItem(player, Deity.spells.HealItem);
	          Inventory.reagents = false;
	      }
	      else if (Inventory.reagents == false && player.getHealth() < 20 && Override.Override == false) {
	        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You do not have the reagents for this spell");
	        } if (player.getHealth() >= 20 && Inventory.reagents == true && Override.Override == false) { 
	        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You are at full health");
	        	player.setHealth(20);
	        	Inventory.reagents = false;
	        }if (player.getHealth() >= 20 && Inventory.reagents == false && Override.Override == false) { 
		        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You are at full health");
		        	player.setHealth(20);
		        
	   
	        } if (Override.Override == true) {
	        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:Spells have been disabled by an admin");
	        } if (Timer.canHeal == false) {
	        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You have to wait before using this spell again");
	        }
	        }
	        
	        
	return true;
	
	        }
	        
	}
		

