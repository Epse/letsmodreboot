package me.epse.letsmodreboot.config;

import me.epse.letsmodreboot.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static void preInit(File configFile) {
        Configuration config = new Configuration(configFile);

        try {
            config.load();

            // Load in all the things
            Settings.setLogLess(config.getBoolean("logLess", Configuration.CATEGORY_GENERAL,
                    false, "Log less things to console."));
        }
        //FIXME: this you should NEVER EVER DO!
        catch (Exception e) {
            // Probs want to log the exception
            LogHelper.error(e.getMessage());
        }
        finally {
            config.save();
        }
    }
}
