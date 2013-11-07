package com.titanium.items;

import com.titanium.lib.Enums;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TitaniumArmor extends ItemArmor {

	public TitaniumArmor(int id, int par3, int par4) {
		super(id, Enums.titaniumArmorMaterial, par3, par4);

	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if(stack.itemID == Items.titaniumHelmet.itemID 
				|| stack.itemID == Items.titaniumPlate.itemID
				|| stack.itemID == Items.titaniumBoots.itemID) {
			return "titaniummod:textures/models/armor/titanium_layer_1.png";
		} else if (stack.itemID == Items.titaniumLegs.itemID) {
			return "titaniummod:textures/models/armor/titanium_layer_2.png";
		} else {
			return null;
		}
	}

}
