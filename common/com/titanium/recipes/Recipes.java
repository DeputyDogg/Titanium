package com.titanium.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.titanium.blocks.Blocks;
import com.titanium.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		GameRegistry.addSmelting(Blocks.titaniumOre.blockID, new ItemStack(Items.titaniumIngot, 1, 0), 0.1F);
		
		GameRegistry.addRecipe(new ItemStack(Items.titaniumPickaxe, 1, 0), new Object[] {
			"III", " S ", " S ", 'I', Items.titaniumIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.titaniumAxe, 1, 0), new Object[] {
			"II ", "IS ", " S ", 'I', Items.titaniumIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.titaniumShovel, 1, 0), new Object[] {
			" I ", " S ", " S ", 'I', Items.titaniumIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.titaniumSword, 1, 0), new Object[] {
			" I ", " I ", " S ", 'I', Items.titaniumIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.titaniumHoe, 1, 0), new Object[] {
			"II ", " S ", " S ", 'I', Items.titaniumIngot, 'S', Item.stick
		});
	}
	
}
