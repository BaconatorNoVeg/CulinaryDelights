package com.baconatornoveg.culinarydelights;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.baconatornoveg.culinarydelights.CulinaryDMachine;

@Mod(
		modid = CulinaryDelights.MODID,
		version = CulinaryDelights.VERSION,
		name = CulinaryDelights.NAME
		)
public class CulinaryDelights
{
    public static final String MODID = "culinarydelights";
    public static final String VERSION = "1.0";
    public static final String NAME = "Culinary Delights";
    
    public static final CreativeTabs tabCulDel = new CreativeTabs(MODID) {
    	@Override public ItemStack getTabIconItem() {
    		ItemStack tabIcon = new ItemStack(Items.DIAMOND);
    		return tabIcon;
    	}
    };
    
    public static CulinaryDMachine blender;
    public static CulinaryDMachine cuttingBoard;
    public static ItemBlock blenderItemBlock;
    public static ItemBlock cuttingBoardItemBlock;
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("I am being initialized!");
        
        blender = new CulinaryDMachine(Material.IRON, "blender");
        cuttingBoard = new CulinaryDMachine(Material.WOOD, "cuttingBoard");
        blenderItemBlock = new ItemBlock(blender);
        cuttingBoardItemBlock = new ItemBlock(cuttingBoard);
        
    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	GameRegistry.register(blender);
    	GameRegistry.register(blenderItemBlock.setRegistryName(blender.getRegistryName().toString()));
    	GameRegistry.register(cuttingBoard);
    	GameRegistry.register(cuttingBoardItemBlock.setRegistryName(cuttingBoard.getRegistryName().toString()));
    	
    }
}
