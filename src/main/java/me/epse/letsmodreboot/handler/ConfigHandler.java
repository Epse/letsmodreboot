package me.epse.letsmodreboot.handler;

import me.epse.letsmodreboot.LetsModReboot;
import me.epse.letsmodreboot.reference.Settings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

// Not an event handler
public class ConfigHandler {
    public static Configuration configuration;
    public static void preInit(File configFile) {
        configuration = new Configuration(configFile);
        sync();
    }

    // Any exceptions will be handled by Forge.
    public static void sync() {

        configuration.load();

        // Load in all the things
        Settings.General.setLogLess(configuration.getBoolean("logLess", Configuration.CATEGORY_GENERAL,
                false, "Log less things to console."));
        Settings.General.setLogTraceToInfo(configuration.getBoolean("logTraceToInfo", Configuration.CATEGORY_GENERAL,
                false,"Log Bug Traces to Info instead of Trace."));

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }


    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent event) {
        if (event.getModID() == LetsModReboot.MOD_ID) {
            sync();
        }
    }
}
