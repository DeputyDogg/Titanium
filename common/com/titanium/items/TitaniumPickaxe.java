package com.titanium.items;

import com.titanium.lib.ModInfo;
import com.titanium.lib.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class TitaniumPickaxe extends ItemPickaxe {

	public TitaniumPickaxe(int id, EnumToolMaterial material) {

		super(id, material);
		this.setUnlocalizedName(Names.TITANIUM_PICKAXE_UNLOCAL);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		
		itemIcon = iconRegister.registerIcon(String.format("%s:%s", ModInfo.RESOURCE_LOCATION, Names.TITANIUM_PICKAXE_TEXTURE));
	
	}

}
