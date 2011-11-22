package com.imdeity.spells.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import com.imdeity.deityapi.Deity;


public class PlayerListener extends org.bukkit.event.player.PlayerListener {

   
    @Override
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player != null) {
        Deity.chat.sendPlayerMessage(player, "&bNew spells plugin is now on the server");
           
        }
    }

}