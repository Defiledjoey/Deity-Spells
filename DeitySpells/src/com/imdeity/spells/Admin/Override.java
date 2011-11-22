package com.imdeity.spells.Admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;

public class Override implements CommandExecutor {
	public static boolean Override;
	
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	           
	        
	        if (Deity.perm.isAdmin(player) && Override != false || Deity.perm.isSubAdmin(player) && Override != false) {
	        	Override = false;
	            Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:All spells are now enabled");
	        } else if (Deity.perm.isAdmin(player) && Override != true || Deity.perm.isSubAdmin(player) && Override != true) {
	        	Override = true;
	        	Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:All spells are now disabled");
	        
	 }
	        }  
	return true;
	
	        }
	
	        
	}



