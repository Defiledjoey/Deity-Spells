package com.imdeity.spells;

import com.imdeity.deityapi.*;
import com.imdeity.spells.listener.BlockListener;
import com.imdeity.spells.listener.PlayerListener;
import com.imdeity.spells.spells.HealSpell;
import com.imdeity.spells.spells.Smelt;
import com.imdeity.spells.spells.Farm;
import com.imdeity.spells.spells.Alch;
import com.imdeity.spells.Admin.Override;
import com.imdeity.spells.spells.Humid;
import com.imdeity.spells.spells.Invince;
import com.imdeity.spells.utils.Timer;

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
    getCommand("pAlch").setExecutor(new Alch());
    getCommand("pSmelt").setExecutor(new Smelt());
    getCommand("pFarm").setExecutor(new Farm());
    getCommand("Invincability").setExecutor(new Invince());
    getCommand("pHumidify").setExecutor(new Humid());
	}
	public void startListener() {
		PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Type.PLAYER_JOIN, playerListener, Priority.Normal, this); 
        pm.registerEvent(Type.BLOCK_BREAK, blockListener, Priority.Highest, this);
        pm.registerEvent(Type.BLOCK_PLACE, blockListener, Priority.Normal, this);
        pm.registerEvent(Type.PLAYER_ITEM_HELD, playerListener, Priority.Normal, this);
    }
	public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String[] args) {
		if (sender instanceof Player) {
            Player player = (Player) sender;
		Deity.chat.sendPlayerMessage(player, "&eDeity Spells", "&f:Version 0.1 Defiledjoey");
		}
        return true;
	}
	public void Invinceability() {
	if (Timer.Invince == true) {
		Player player = Invince.sender;
		player.setHealth(20);
	
	}
	}

}

