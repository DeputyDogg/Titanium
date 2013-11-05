package com.titanium.items;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class TitaniumHelmet extends ItemArmor {

	public TitaniumHelmet(int id, EnumArmorMaterial material) {
		
		// The 2 will render this as iron armor which I will retexture
		// The 0 marks this as being a helmet
		super(id, material, 2, 0);
	}

}
