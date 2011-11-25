package com.imdeity.spells;

import java.lang.String;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.listener.BlockListener;
import com.imdeity.spells.listener.PlayerListener;
import com.imdeity.spells.spells.HealSpell;
import com.imdeity.spells.Admin.Override;
import com.imdeity.spells.spells.Invince;
import com.imdeity.spells.spells.Humidify;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor {
	private final PlayerListener playerListener = new PlayerListener();
    private final BlockListener blockListener = new BlockListener(null);

	public void onDisable() {
	System.out.println("[Deity Spells] is now disabled");
		
	}

	
	public void onEnable() {
    startListener();
	System.out.println("[Deity Spells] is enabled");
	getCommand("DeitySpells").setExecutor(this);
    getCommand("pHeal").setExecutor(new HealSpell());
    getCommand("Override").setExecutor(new Override());
    getCommand("Invinceability").setExecutor(new Invince());
    getCommand("pHumidify").setExecutor(new Humidify());
	}
	public void startListener() {
		PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Type.PLAYER_JOIN, playerListener, Priority.Normal, this); 
        pm.registerEvent(Type.BLOCK_BREAK, blockListener, Priority.Highest, this);
        pm.registerEvent(Type.BLOCK_PLACE, blockListener, Priority.Normal, this);
    }
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String[] args) {
		if (sender instanceof Player) {
            Player player = (Player) sender;
		Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:Version 0.1 Defiledjoey");
		}
        return true;
	}
	
	}


	



