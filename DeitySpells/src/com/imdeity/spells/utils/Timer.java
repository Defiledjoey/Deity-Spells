package com.imdeity.spells.utils;
import com.imdeity.deityapi.Deity;
import com.imdeity.spells.Main;

public class Timer {
	public static boolean canHeal = true;
	public static boolean canInvince = true;
	public static boolean canAlch = true;
	public static boolean canHumidify = true;
	public static boolean canSmelt = true;
	public static boolean Invince = false;
    private static Main plugin;
    public Timer(Main instance) {
        Timer.plugin = instance;
    }
	public static boolean startHealDelay() {
		if (canHeal == false) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        canHeal = true;
			    }
			}, Deity.spells.HealDelay * 1200L);
		}
		
		return false;
	}
	public static boolean startInvinceDelay() {
		if (canInvince == false) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        canInvince = true;
			    }
			}, Deity.spells.InvinceabilityDelay * 1200L);
		}
		
		return false;
	}
	public static boolean startAlchDelay() {
		if (canAlch == false) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        canAlch = true;
			    }
			}, Deity.spells.AlchDelay * 1200L);
		}
		
		return false;
	}
	public static boolean startHumidifyDelay() {
		if (canHumidify == false) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        canHumidify = true;
			    }
			}, Deity.spells.HumidifyDelay * 1200L);
		}
		
		return false;
	}
	public static boolean startSmeltDelay() {
		if (canSmelt == false) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        canSmelt = true;
			    }
			}, Deity.spells.SmeltDelay * 1200L);
		}
		
		return false;
	}
	public static boolean startInvinceLength() {
		if (Invince == true) {
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			    public void run() {
			        Invince = false;
			    }
			}, Deity.spells.InvinceabilityLength * 20L);
		}
		
		return false;
	}
	}
