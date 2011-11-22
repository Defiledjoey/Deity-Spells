package com.imdeity.spells.spells;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.imdeity.spells.utils.Inventory;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Admin.Override;

public class Farm implements CommandExecutor {
	
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            Inventory.getHealInventory(player, Deity.spells.HealItem);
	      
	        }
	        
	return true;
	
	        }
	        
	}
