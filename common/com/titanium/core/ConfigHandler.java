package com.titanium.core;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.titanium.blocks.Blocks;
import com.titanium.items.Items;
import com.titanium.lib.ModInfo;

import cpw.mods.fml.common.FMLLog;

public class ConfigHandler {

public static void init(File configFile) {
		
		Configuration config = new Configuration(configFile);
		
		try {
			config.load();
			Blocks.loadBlockIDs(config);
			Items.loadItemIDs(config);

		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, ModInfo.MOD_ID + " has trouble loading the configuration file.");
		}
		finally {
			config.save();
		}
	}
	
}
