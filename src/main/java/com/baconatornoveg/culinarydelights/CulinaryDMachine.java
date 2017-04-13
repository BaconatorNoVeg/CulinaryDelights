package com.baconatornoveg.culinarydelights;

import net.minecraft.block.material.Material;

public class CulinaryDMachine extends CulinaryDBlockBase {

	public CulinaryDMachine(String name) {
		super(Material.IRON, name);

		this.setHardness(3f);
		this.setResistance(5f);
		
		this.setCreativeTab(CulinaryDelights.tabCulDel);
	}

}
