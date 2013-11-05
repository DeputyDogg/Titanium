package com.titanium;

import com.titanium.blocks.Blocks;
import com.titanium.core.CommonProxy;
import com.titanium.core.ConfigHandler;
import com.titanium.core.LocalizationHandler;
import com.titanium.items.Items;
import com.titanium.lib.ModInfo;
import com.titanium.recipes.Recipes;
import com.titanium.world.WorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(	name = ModInfo.MOD_NAME,
		modid = ModInfo.MOD_ID,
		version = ModInfo.MOD_VERSION	)

@NetworkMod(	clientSideRequired = true,
				serverSideRequired = false	)

public class Titanium {
	
	@SidedProxy(	clientSide = ModInfo.CLIENT_PROXY_LOCATION,
					serverSide = ModInfo.COMMON_PROXY_LOCATION	)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		LocalizationHandler.init();
		Blocks.init();
		Items.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		WorldGenerator.init();
		Recipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
