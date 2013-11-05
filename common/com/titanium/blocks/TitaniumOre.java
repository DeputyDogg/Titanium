package com.titanium.blocks;

import com.titanium.lib.ModInfo;
import com.titanium.lib.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumOre extends Block {
	
	public TitaniumOre(int id) {
		
		super(id, Material.rock);
		this.setHardness(10.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Names.TITANIUM_ORE_UNLOCAL);
		this.setStepSound(soundStoneFootstep);
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", ModInfo.RESOURCE_LOCATION, Names.TITANIUM_ORE_TEXTURE));
	
	}
	
}
