package com.baconatornoveg.culinarydelights.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CulinaryDBlocks {

    public static BlockBlender blockBlender;
    public static BlockCuttingBoard blockCuttingBoard;
    public static CulinaryDMachine blockMeatGrinder;
    public static CulinaryDMachine blockFoodProcessor;

    public static void init() {
        blockBlender = register(new BlockBlender());
        blockCuttingBoard = register(new BlockCuttingBoard());
        blockMeatGrinder = register(new CulinaryDMachine("block_meat_grinder"));
        blockFoodProcessor = register(new CulinaryDMachine("block_food_processor"));

    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof CulinaryDBlockBase) {
            ((CulinaryDBlockBase)block).registerItemModel(itemBlock);
        }

        if (block instanceof CulinaryDTileEntity) {
            GameRegistry.registerTileEntity(((CulinaryDTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
