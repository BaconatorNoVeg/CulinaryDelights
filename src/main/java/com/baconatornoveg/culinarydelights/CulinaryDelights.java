package com.baconatornoveg.culinarydelights;

import com.baconatornoveg.culinarydelights.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = CulinaryDelights.MODID,
		version = CulinaryDelights.VERSION,
		name = CulinaryDelights.NAME
		)

public class CulinaryDelights
{
    public static final String MODID = "culinarydelights";
    public static final String VERSION = "BLEEDING";
    public static final String NAME = "Culinary Delights";
    
    public static final CreativeTabs tabCulDel = new CreativeTabs(MODID) {
    	@Override public ItemStack getTabIconItem() {
    		ItemStack tabIcon = new ItemStack(Items.DIAMOND);
    		return tabIcon;
    	}
    };

    @SidedProxy(serverSide = "com.baconatornoveg.culinarydelights.proxy.CommonProxy", clientSide = "com.baconatornoveg.culinarydelights.proxy.ClientProxy")
    public static CommonProxy proxy;

    //Remove these in future builds, block now registered through CulinaryDBlocks
    /*public static CulinaryDMachine blender;
    public static CulinaryDMachine cuttingBoard;
    public static ItemBlock blenderItemBlock;
    public static ItemBlock cuttingBoardItemBlock;*/

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CulinaryDBlocks.init();
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("I am being initialized!");

    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
