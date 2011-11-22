package com.imdeity.spells.spells;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.imdeity.spells.utils.Inventory;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Admin.Override;
import com.imdeity.spells.utils.Timer;

public class Invince implements CommandExecutor {
	public static Player sender;
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            sender = player;
	            Inventory.getInvinceInventory(player, Deity.spells.InvinceabilityItem);
	            if (Inventory.reagents == true && Timer.Invince != true && Override.Override == false) {
	            	Inventory.getInvinceInventory(player, Deity.spells.InvinceabilityItem);
	            	Inventory.removeInvinceItem(player, Deity.spells.InvinceabilityItem);
	            	Timer.Invince = true;
	            	Timer.startInvinceDelay();
	            	Timer.startInvinceLength();
	            } if (Override.Override == true) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:Spells have been disabled by an admin");
	            } if (Timer.Invince == true) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You are already invinceable");
	            } if (Inventory.reagents == false) {
	            	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:You do not have the reagents for this spell");
	            }
	            }
	            
	         
	        
	return true;
	
	        }
	        
	}
		