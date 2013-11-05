package com.titanium.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenerator {
	
	public static void init() {
		
		GameRegistry.registerWorldGenerator(new TitaniumGenerator());
	}
}
