package me.hammale.treez;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class treez extends JavaPlugin {

	  Logger log = Logger.getLogger("Minecraft");
	  PluginDescriptionFile pdfFile = this.getDescription();
		
	@Override
	public void onEnable() {

		log.info("[Treez] " + pdfFile.getVersion() + " Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		log.info("[Treez] " + pdfFile.getVersion() + " Enabled!");
		
	}

}
