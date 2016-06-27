package me.epse.letsmodreboot;

import me.epse.letsmodreboot.init.ModItems;
import me.epse.letsmodreboot.item.PocketCalculator;
import me.epse.letsmodreboot.reference.Settings;
import me.epse.letsmodreboot.proxy.IProxy;
import me.epse.letsmodreboot.utility.LogHelper;
import me.epse.letsmodreboot.handler.ConfigHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = LetsModReboot.MOD_ID, version = LetsModReboot.VERSION, name = LetsModReboot.NAME, guiFactory = LetsModReboot.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    //<editor-fold desc="... //Constants">
    public static final String MOD_ID = "epseletsmodreboot";
    public static final String VERSION = "1.9-1.0"; // epse: again: this is mcversion-modversion
    public static final String NAME = "Let's Mod Reboot";
    public static final String CLIENT_PROXY = "me.epse.letsmodreboot.proxy.ClientProxy";
    public static final String SERVER_PROXY = "me.epse.letsmodreboot.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "me.epse.letsmodreboot.client.gui.GuiFactory";
    //</editor-fold>

    // Use this when you need to reference this mod (loaded instance of it)
    // SMARTREMARK: kinda like 'this' on steroids
    @Mod.Instance(MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY, modId = MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Here you should load configs, init networks, setup keybindings, init items and blocks
        // Other mods aren't loaded yet, ignore them
        ConfigHandler.preInit(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigHandler());
        ModItems.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Here GUI's should get set up, tile entities, rendering, event handlers, recipies
        // Other mods should be here too, interaction with them
        if (!Settings.General.getLogLess()) {
            LogHelper.info("Let's Mod Reboot in init phase.");
        }

        if (event.getSide() == Side.CLIENT) {
            RenderItem renderitem = Minecraft.getMinecraft().getRenderItem();
            renderitem.getItemModelMesher().register(ModItems.pocketCalculator, 0,
                    new ModelResourceLocation(MOD_ID + ":" + ((PocketCalculator) ModItems.pocketCalculator).getName(), "inventory"));
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // I don't know what happens here
        // All mods are done here
    }
}
