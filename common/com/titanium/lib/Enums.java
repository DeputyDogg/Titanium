package com.titanium.lib;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class Enums {

	public static EnumToolMaterial titaniumToolMaterial = EnumHelper.addToolMaterial("TITANIUM", 2, 850, 10.0F, 3.0F, 18);
	public static EnumArmorMaterial titaniumArmorMaterial = EnumHelper.addArmorMaterial("TITANIUM", 24, new int[] {2, 7, 6, 2}, 18);
	
}
