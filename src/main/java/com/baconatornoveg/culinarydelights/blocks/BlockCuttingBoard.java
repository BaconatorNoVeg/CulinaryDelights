package com.baconatornoveg.culinarydelights.blocks;

import com.baconatornoveg.culinarydelights.CulinaryDelights;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCuttingBoard extends CulinaryDBlockBase {

    private static final AxisAlignedBB CUTTING_BOARD = new AxisAlignedBB (0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);

    public BlockCuttingBoard() {
        super(Material.WOOD, "block_cutting_board");

        this.setCreativeTab(CulinaryDelights.tabCulDel);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return CUTTING_BOARD;
    }


    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }

}
