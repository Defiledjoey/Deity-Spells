package com.imdeity.spells.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.imdeity.deityapi.Deity;

public class Inventory {
	public static boolean reagents;
	public static int bucketamount;
	public static void removeHealItem(Player player, int typeid){
    	ItemStack[] inventory = player.getInventory().getContents();
    	for(ItemStack x : inventory){
    		if(x != null && x.getTypeId() == typeid){
    			if(x.getAmount() < Deity.spells.HealAmount){
    	
    			} else{
    			x.setAmount(x.getAmount() - Deity.spells.HealAmount);
    			player.getInventory().setContents(inventory);
    			}
    			return;
    		}
    	}
    }
  public static boolean getHealInventory(Player player, int typeid){
    	ItemStack[] inventory = player.getInventory().getContents();
    	for(ItemStack x : inventory){
    		if(x != null && x.getTypeId() == typeid){
    			if(x.getAmount() >= 5){
    			      reagents = true;
    			} else {
    		  reagents = false;
    		
    			
    			}
    		
    		
    	}
    
    	}
		return false;
  }
  public static void removeJumpItem(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() < Deity.spells.JumpAmount){
  	
  			} else{
  			x.setAmount(x.getAmount() - Deity.spells.JumpAmount);
  			player.getInventory().setContents(inventory);
  			}
  			return;
  		}
  	}
  }
public static boolean getJumpInventory(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() >= Deity.spells.JumpAmount){
  			      reagents = true;
  			} else {
  		  reagents = false;
  		
  			
  			}
  		
  		
  	}
  
  	}
		return false;
}
public static void removeInvinceItem(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() < Deity.spells.InvinceabilityAmount){
  	
  			} else{
  			x.setAmount(x.getAmount() - Deity.spells.InvinceabilityAmount);
  			player.getInventory().setContents(inventory);
  			}
  			return;
  		}
  	}
  }
public static boolean getInvinceInventory(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() >= Deity.spells.InvinceabilityAmount){
  			      reagents = true;
  			} else {
  		  reagents = false;
  		
  			
  			}
  		
  		
  	}
  
  	}
		return false;
}
public static void removeHumidifyItem(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() < Deity.spells.HumidifyAmount){
  	
  			} else{
  			x.setAmount(x.getAmount() - Deity.spells.HumidifyAmount);
  			player.getInventory().setContents(inventory);
  			}
  			return;
  		}
  	}
}
public static boolean getHumidifyInventory(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() >= Deity.spells.HumidifyAmount){
  			      reagents = true;
  			} else {
  		  reagents = false;
  		
  			
  			}
  		
  		
  	}
  
  	}
		return false;
}
public static boolean getBuckets(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() > 0){
  			      bucketamount = x.getAmount();
  			} else {
  		  bucketamount = 0;
  		
  			
  			}
  		
  		
  	}
  
  	}
		return false;
}
public static void removeBuckets(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() > 0){
  				x.setAmount(x.getAmount() - 5);
  	  			player.getInventory().setContents(inventory);
  			} else{
  			
  			}
  			return;
  		}
  	}
  }
public static void addHumidifyWater(Player player, int typeid){
  	ItemStack[] inventory = player.getInventory().getContents();
  	for(ItemStack x : inventory){
  		if(x != null && x.getTypeId() == typeid){
  			if(x.getAmount() > -1){
  				x.setAmount(x.getAmount() + 5);
  	  			player.getInventory().setContents(inventory);
  			} else{
  			
  			}
  			return;
  		}
  	}
  }
}
