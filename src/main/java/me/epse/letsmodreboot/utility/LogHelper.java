package me.epse.letsmodreboot.utility;

import me.epse.letsmodreboot.LetsModReboot;
import me.epse.letsmodreboot.reference.Settings;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(LetsModReboot.NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        if (!Settings.General.getLogTraceToInfo())
        {
            log(Level.TRACE, object);
        }
        else
        {
            log(Level.INFO, object);
        }
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
