package me.epse.letsmodreboot;

import me.epse.letsmodreboot.proxy.IProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LetsModReboot.MODID, version = LetsModReboot.VERSION, name = LetsModReboot.NAME)
public class LetsModReboot
{
    public static final String MODID = "epseletsmodreboot";
    public static final String VERSION = "1.9-1.0"; // epse: again: this is mcversion-modversion
    public static final String NAME = "Let's Mod Reboot";
    public static final String CLIENTPROXY = "me.epse.letsmodreboot.proxy.ClientProxy";
    public static final String SERVERPROXY = "me.epse.letsmodreboot.proxy.ServerProxy";

    // Use this when you need to reference this mod (loaded instance of it)
    // SMARTREMARK: kinda like 'this' on steroids
    @Mod.Instance(MODID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = CLIENTPROXY, serverSide = SERVERPROXY, modId = MODID)
    public static IProxy proxy;

    // This thing could be called whatever the fuck, as long as the argument and the annotation are correct
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Here you should load configs, init networks, setup keybindings, init items and blocks
        // Other mods aren't loaded yet, ignore them
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Here GUI's should get set up, tile entities, rendering, event handlers, recipies
        // Other mods should be here too, interaction with them
        System.out.println("Lets mod reboot is initting!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // I don't know what happens here
        // All mods are done here
    }
}
