package me.epse.letsmodreboot;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = LetsModReboot.MODID, version = LetsModReboot.VERSION, name = LetsModReboot.NAME)
public class LetsModReboot
{
    public static final String MODID = "epseletsmodreboot";
    public static final String VERSION = "1.9-1.0"; // epse: again: this is mcversion-modversion
    public static final String NAME = "Let's Mod Reboot";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
