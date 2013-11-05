package com.titanium.items;

import com.titanium.core.LocalizationHandler;
import com.titanium.lib.BlockIDs;
import com.titanium.lib.Enums;
import com.titanium.lib.ItemIDs;
import com.titanium.lib.Names;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

public class Items {

	public static Item titaniumIngot;
	public static Item titaniumPickaxe;
	public static Item titaniumAxe;
	public static Item titaniumShovel;
	public static Item titaniumSword;
	public static Item titaniumHoe;
	
	public static void init() {
		
		titaniumIngot = new TitaniumIngot(ItemIDs.titaniumIngotID);
		LanguageRegistry.addName(titaniumIngot, LocalizationHandler.getLocalizationString(titaniumIngot));
		
		titaniumPickaxe = new TitaniumPickaxe(ItemIDs.titaniumPickaxeID, Enums.titaniumToolMaterial);
		LanguageRegistry.addName(titaniumPickaxe, LocalizationHandler.getLocalizationString(titaniumPickaxe));
		
		titaniumAxe = new TitaniumAxe(ItemIDs.titaniumAxeID, Enums.titaniumToolMaterial);
		LanguageRegistry.addName(titaniumAxe, LocalizationHandler.getLocalizationString(titaniumAxe));
		
		titaniumShovel = new TitaniumShovel(ItemIDs.titaniumShovelID, Enums.titaniumToolMaterial);
		LanguageRegistry.addName(titaniumShovel, LocalizationHandler.getLocalizationString(titaniumShovel));
		
		titaniumSword = new TitaniumSword(ItemIDs.titaniumSwordID, Enums.titaniumToolMaterial);
		LanguageRegistry.addName(titaniumSword, LocalizationHandler.getLocalizationString(titaniumSword));
		
		titaniumHoe = new TitaniumHoe(ItemIDs.titaniumHoeID, Enums.titaniumToolMaterial);
		LanguageRegistry.addName(titaniumHoe, LocalizationHandler.getLocalizationString(titaniumHoe));
	}
	
public static void loadItemIDs(Configuration config) {
		
		ItemIDs.titaniumIngotID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_INGOT_NAME + ": Item ID", ItemIDs.TITANIUM_INGOT_DEFAULT).getInt(ItemIDs.TITANIUM_INGOT_DEFAULT);
		ItemIDs.titaniumPickaxeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_PICKAXE_NAME + ": Item ID", ItemIDs.TITANIUM_PICKAXE_DEFAULT).getInt(ItemIDs.TITANIUM_PICKAXE_DEFAULT);
		ItemIDs.titaniumAxeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_AXE_NAME + ": Item ID", ItemIDs.TITANIUM_AXE_DEFAULT).getInt(ItemIDs.TITANIUM_AXE_DEFAULT);
		ItemIDs.titaniumShovelID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_SHOVEL_NAME + ": Item ID", ItemIDs.TITANIUM_SHOVEL_DEFAULT).getInt(ItemIDs.TITANIUM_SHOVEL_DEFAULT);
		ItemIDs.titaniumSwordID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_SWORD_NAME + ": Item ID", ItemIDs.TITANIUM_SWORD_DEFAULT).getInt(ItemIDs.TITANIUM_SWORD_DEFAULT);
		ItemIDs.titaniumHoeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_HOE_NAME + ": Item ID", ItemIDs.TITANIUM_HOE_DEFAULT).getInt(ItemIDs.TITANIUM_HOE_DEFAULT);
	}
	
}
