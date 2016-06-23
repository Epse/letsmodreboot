package me.epse.letsmodreboot.config;

import me.epse.letsmodreboot.reference.Settings;
import me.epse.letsmodreboot.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;
    public static void preInit(File configFile) {
        configuration = new Configuration(configFile);

        try {
            configuration.load();

            // Load in all the things
            Settings.setLogLess(configuration.getBoolean("logLess", Configuration.CATEGORY_GENERAL,
                    false, "Log less things to console."));
        }
        // This is fine, Configuration.load() shoudn't be able to throw. Everything is catched in there.
        catch (Exception e) {
            // Probs want to log the exception
            LogHelper.error(e.getMessage());
        }
        finally {
            configuration.save();
        }
    }
}
