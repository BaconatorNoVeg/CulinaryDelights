package com.baconatornoveg.culinarydelights;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class CulinaryDMachineIB extends ItemBlock {

	public CulinaryDMachineIB(Block block, String regName) {
		super(block);
		block.setRegistryName(regName);
		block.setUnlocalizedName(block.getRegistryName().toString());
	}

}
