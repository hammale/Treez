package me.hammale.treez;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class treez extends JavaPlugin {

	  Random gen = new Random();
	
	  Logger log = Logger.getLogger("Minecraft");
	  PluginDescriptionFile pdfFile = this.getDescription();
		
	@Override
	public void onEnable() {

		log.info("[Treez] " + pdfFile.getVersion() + " Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("[Treez] " + pdfFile.getVersion() + " Enabled!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("palmtree")){
			if(sender instanceof Player){
			Player p = (Player) sender;
			plantTree(p);
			sender.sendMessage(ChatColor.GREEN + "Planting tree!");
			return true;
			}
			return false;
		}
		return false; 
	}
	
	public void plantTree(Player p){
		 Block b = p.getTargetBlock(null, 100);
		 int ran1 = gen.nextInt(15);
		 if(ran1 < 10){
			 ran1 = 10;
		 }
		 int i = 1;
		 Block fence = null;
		 while(i < ran1){
			 fence = b.getRelative(BlockFace.UP, i);
			 fence.setTypeId(85);
			 i++;
		 }
		 fence.setTypeId(17);
		 int x = 0;
		 while(x < 2){
		 fence = fence.getRelative(BlockFace.DOWN, x);
		 Block u = fence.getRelative(BlockFace.UP, 1);
		 Block n = fence.getRelative(BlockFace.NORTH, 1);
		 Block s = fence.getRelative(BlockFace.SOUTH, 1);
		 Block e = fence.getRelative(BlockFace.EAST, 1);
		 Block w = fence.getRelative(BlockFace.WEST, 1);
		 
		 u.setTypeId(18);
		 n.setTypeId(18); 
		 s.setTypeId(18); 
		 e.setTypeId(18); 
		 w.setTypeId(18);
		 x++;
		 }
	}

}