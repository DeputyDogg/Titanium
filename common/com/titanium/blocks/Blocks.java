package com.titanium.blocks;

import com.titanium.core.LocalizationHandler;
import com.titanium.lib.BlockIDs;
import com.titanium.lib.Names;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

public class Blocks {

	public static Block titaniumOre;
	
	public static void init() {
		
		// Titanium Ore
		titaniumOre = new TitaniumOre(BlockIDs.titaniumOreID);
		GameRegistry.registerBlock(titaniumOre, Names.TITANIUM_ORE_NAME);
		LanguageRegistry.addName(titaniumOre, LocalizationHandler.getLocalizationString(titaniumOre));
		MinecraftForge.setBlockHarvestLevel(titaniumOre, "pickaxe", 2);
	}
	
	public static void loadBlockIDs(Configuration config) {
		
		BlockIDs.titaniumOreID = config.get(config.CATEGORY_BLOCK, Names.TITANIUM_ORE_NAME + ": Block ID", BlockIDs.TITANIUM_ORE_DEFAULT).getInt(BlockIDs.TITANIUM_ORE_DEFAULT);
	}
	
}
