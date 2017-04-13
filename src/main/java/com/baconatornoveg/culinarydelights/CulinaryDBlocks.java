package com.baconatornoveg.culinarydelights;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CulinaryDBlocks {

    public static CulinaryDMachine blockBlender;
    public static CulinaryDMachine blockCuttingBoard;
    public static CulinaryDMachine blockMeatGrinder;
    public static CulinaryDMachine blockFoodProcessor;

    public static void init() {
        blockBlender = register(new CulinaryDMachine("block_blender"));
        blockCuttingBoard = register(new CulinaryDMachine("block_cutting_board"));
        blockMeatGrinder = register(new CulinaryDMachine("block_meat_grinder"));
        blockFoodProcessor = register(new CulinaryDMachine("block_food_processor"));

    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof CulinaryDBlockBase) {
            ((CulinaryDBlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
