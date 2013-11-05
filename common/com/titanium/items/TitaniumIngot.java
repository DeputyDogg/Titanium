package com.titanium.items;

import com.titanium.lib.ModInfo;
import com.titanium.lib.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item{

	public TitaniumIngot(int id) {
		
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(Names.TITANIUM_INGOT_UNLOCAL);
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		
		itemIcon = iconRegister.registerIcon(String.format("%s:%s", ModInfo.RESOURCE_LOCATION, Names.TITANIUM_INGOT_TEXTURE));
	
	}

}
