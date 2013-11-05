package com.titanium.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.titanium.lib.ModInfo;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {

	public static String[] localeFiles = {ModInfo.LANGUAGE_LOCATION + "en_US.xml"};
	
	public static void init() {
		for (String LocalizationFile : localeFiles) {
			LanguageRegistry.instance().loadLocalization(LocalizationFile, getLocaleFromFilename(LocalizationFile), isXMLFile(LocalizationFile));
		}
	}
	
	public static boolean isXMLFile(String filename) {
		return filename.endsWith(".xml");
	}
	
	public static String getLocaleFromFilename(String filename) {
		return filename.substring(filename.lastIndexOf("/") + 1, filename.lastIndexOf("."));
	}
	
	public static String getLocalizationString(Block block) {
		String key = block.getUnlocalizedName() + ".name";
		return LanguageRegistry.instance().getStringLocalization(key);
	}
	
	public static String getLocalizationString(Item item) {
		String key = item.getUnlocalizedName() + ".name";
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}
