package com.baconatornoveg.culinarydelights.blocks;

import com.baconatornoveg.culinarydelights.blocks.container.ContainerBlender;
import com.baconatornoveg.culinarydelights.blocks.gui.GuiBlender;
import com.baconatornoveg.culinarydelights.tileentity.TileEntityBlender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CulinaryDGuiHandler implements IGuiHandler {
    public static final int BLENDER = 0;

    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case BLENDER:
                return new ContainerBlender(player.inventory, (TileEntityBlender)world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case BLENDER:
                return new GuiBlender(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
            default:
                return null;
        }
    }
}
