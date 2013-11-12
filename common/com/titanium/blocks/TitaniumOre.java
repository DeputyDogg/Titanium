package com.titanium.blocks;

import java.util.Random;

import com.titanium.lib.ModInfo;
import com.titanium.lib.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumOre extends Block {
	
	static Random random = new Random();
	
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
	
	public static int getRandomVeinSize() {
		int veinSize = 0;
		int coinFlip;
		
		do {
			veinSize += random.nextInt(4);
			coinFlip = random.nextInt(2);
		} while (coinFlip == 1); 
		return veinSize;
	}
	
	public static int getRandomYValue() {
		int weightedLocation = random.nextInt(6);
		int YValue;
		
		if (weightedLocation <= 1) {
			YValue = getRandomYValueWithRange(65, 90);
		} else {
			YValue = getRandomYValueWithRange(5, 65);
		}
		return YValue;
	}
	
	public static int getRandomYValueWithRange(int YMin, int YMax) {
		int range = YMax - YMin;
		int dice1Sides, dice2Sides, dice3Sides;
		int result;
		
		if (range % 3 == 0) {
			dice1Sides = range / 3 + 1;
			dice2Sides = range / 3 + 1;
			dice3Sides = range / 3 + 1;
		} else if (range % 3 == 1) {
			dice1Sides = range / 3 + 2;
			dice2Sides = range / 3 + 1;
			dice3Sides = range / 3 + 1;
		} else {
			dice1Sides = range / 3 + 2;
			dice2Sides = range / 3 + 2;
			dice3Sides = range / 3 + 1;
		}
		result = random.nextInt(dice1Sides) + random.nextInt(dice2Sides) + random.nextInt(dice3Sides) + YMin;
		return result;
	}
	
}
