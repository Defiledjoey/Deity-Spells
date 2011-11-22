/*package com.imdeity.spells.spells;



import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.imdeity.spells.utils.Inventory;
import org.bukkit.entity.Player;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Admin.Override;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.*;
import com.sk89q.*;
import com.sk89q.worldedit.WorldVector;
import com.sk89q.worldedit.bukkit.*;

public class JumpSpell implements CommandExecutor {
	
    
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String args[]) {
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            Inventory.getJumpInventory(player, Deity.spells.JumpItem);
	            if (Inventory.reagents == true && Override.Override == false) {
	  	    	  Inventory.getJumpInventory(player, Deity.spells.JumpItem);
	  	          Inventory.removeJumpItem(player, Deity.spells.JumpItem);
	  	        WorldVector pos = player.getSolidBlockTrace(300);
	  	        if (pos != null) {
	  	            player.findFreePosition(pos);
	  
	  	        } else {
	  	            Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:No block in sight!");
	  	        } 
	  	        	
	  	    }
	            }   
	  	      
	        
			return false;
	}
	        
	}
		
*/