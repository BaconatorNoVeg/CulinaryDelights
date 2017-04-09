package com.baconatornoveg.culinarydelights;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CulinaryDMachine extends Block {

	public CulinaryDMachine(Material material, String regName) {
		super(material);
		
		this.setCreativeTab(CulinaryDelights.tabCulDel);
		this.setRegistryName(regName);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}

}
