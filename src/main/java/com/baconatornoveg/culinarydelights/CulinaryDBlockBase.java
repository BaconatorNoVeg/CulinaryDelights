package com.baconatornoveg.culinarydelights;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CulinaryDBlockBase extends Block {

    protected String name;

    public CulinaryDBlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

    }

    public void registerItemModel(ItemBlock itemBlock) {
        CulinaryDelights.proxy.registerItemRenderer(itemBlock, 0, name);
    }
}
