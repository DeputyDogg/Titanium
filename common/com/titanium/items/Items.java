package com.titanium.items;

import com.titanium.core.LocalizationHandler;
import com.titanium.lib.BlockIDs;
import com.titanium.lib.Enums;
import com.titanium.lib.ItemIDs;
import com.titanium.lib.Names;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;

public class Items {

	public static Item titaniumIngot;
	public static Item titaniumPickaxe;
	public static Item titaniumAxe;
	public static Item titaniumShovel;
	public static Item titaniumSword;
	public static Item titaniumHoe;
	public static Item titaniumHelmet;
	public static Item titaniumPlate;
	public static Item titaniumLegs;
	public static Item titaniumBoots;
	
	
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
		
		titaniumHelmet = new TitaniumArmor(ItemIDs.titaniumHelmetID, 4, 0)
			.setUnlocalizedName(Names.TITANIUM_HELMET_UNLOCAL)
			.setTextureName("titaniummod:" + Names.TITANIUM_HELMET_TEXTURE)
			.setCreativeTab(CreativeTabs.tabCombat);
		LanguageRegistry.addName(titaniumHelmet, LocalizationHandler.getLocalizationString(titaniumHelmet));
		
		titaniumPlate = new TitaniumArmor(ItemIDs.titaniumPlateID, 4, 1)
			.setUnlocalizedName(Names.TITANIUM_PLATE_UNLOCAL)
			.setTextureName("titaniummod:" + Names.TITANIUM_PLATE_TEXTURE)
			.setCreativeTab(CreativeTabs.tabCombat);
		LanguageRegistry.addName(titaniumPlate, LocalizationHandler.getLocalizationString(titaniumPlate));
		
		titaniumLegs = new TitaniumArmor(ItemIDs.titaniumLegsID, 4, 2)
			.setUnlocalizedName(Names.TITANIUM_LEGS_UNLOCAL)
			.setTextureName("titaniummod:" + Names.TITANIUM_LEGS_TEXTURE)
			.setCreativeTab(CreativeTabs.tabCombat);
		LanguageRegistry.addName(titaniumLegs, LocalizationHandler.getLocalizationString(titaniumLegs));
		
		titaniumBoots = new TitaniumArmor(ItemIDs.titaniumBootsID, 4, 3)
			.setUnlocalizedName(Names.TITANIUM_BOOTS_UNLOCAL)
			.setTextureName("titaniummod:" + Names.TITANIUM_BOOTS_TEXTURE)
			.setCreativeTab(CreativeTabs.tabCombat);
		LanguageRegistry.addName(titaniumBoots, LocalizationHandler.getLocalizationString(titaniumBoots));
	}
	
	public static void loadItemIDs(Configuration config) {
		
		ItemIDs.titaniumIngotID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_INGOT_NAME + ": Item ID", ItemIDs.TITANIUM_INGOT_DEFAULT).getInt(ItemIDs.TITANIUM_INGOT_DEFAULT);
		ItemIDs.titaniumPickaxeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_PICKAXE_NAME + ": Item ID", ItemIDs.TITANIUM_PICKAXE_DEFAULT).getInt(ItemIDs.TITANIUM_PICKAXE_DEFAULT);
		ItemIDs.titaniumAxeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_AXE_NAME + ": Item ID", ItemIDs.TITANIUM_AXE_DEFAULT).getInt(ItemIDs.TITANIUM_AXE_DEFAULT);
		ItemIDs.titaniumShovelID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_SHOVEL_NAME + ": Item ID", ItemIDs.TITANIUM_SHOVEL_DEFAULT).getInt(ItemIDs.TITANIUM_SHOVEL_DEFAULT);
		ItemIDs.titaniumSwordID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_SWORD_NAME + ": Item ID", ItemIDs.TITANIUM_SWORD_DEFAULT).getInt(ItemIDs.TITANIUM_SWORD_DEFAULT);
		ItemIDs.titaniumHoeID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_HOE_NAME + ": Item ID", ItemIDs.TITANIUM_HOE_DEFAULT).getInt(ItemIDs.TITANIUM_HOE_DEFAULT);
		ItemIDs.titaniumHelmetID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_HELMET_NAME + ": Item ID", ItemIDs.TITANIUM_HELMET_DEFAULT).getInt(ItemIDs.TITANIUM_HELMET_DEFAULT);
		ItemIDs.titaniumPlateID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_PLATE_NAME + ": Item ID", ItemIDs.TITANIUM_PLATE_DEFAULT).getInt(ItemIDs.TITANIUM_PLATE_DEFAULT);
		ItemIDs.titaniumLegsID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_LEGS_NAME + ": Item ID", ItemIDs.TITANIUM_LEGS_DEFAULT).getInt(ItemIDs.TITANIUM_LEGS_DEFAULT);
		ItemIDs.titaniumBootsID = config.get(config.CATEGORY_ITEM, Names.TITANIUM_BOOTS_NAME + ": Item ID", ItemIDs.TITANIUM_BOOTS_DEFAULT).getInt(ItemIDs.TITANIUM_BOOTS_DEFAULT);
	}
}
