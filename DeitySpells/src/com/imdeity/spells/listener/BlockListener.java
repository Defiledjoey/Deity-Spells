package com.imdeity.spells.listener;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Main;


public class BlockListener extends org.bukkit.event.block.BlockListener {
    public Main plugin;
    
    public BlockListener(Main instance) {
        this.plugin = instance;
    }
    
    
    public void onBlockPlace(BlockPlaceEvent event) {
    	
   /**
    * Was just a test
    * 
    * Deity.chat.sendPlayerMessage(player, "Block listener is working");
    * Deity.chat.sendPlayerMessage(player, "You placed a " + block);
    * 
    */
    	
    
    }

    public void onBlockBreak(BlockBreakEvent event) {
    	
    	if(event.isCancelled())
    		return;
    }
}