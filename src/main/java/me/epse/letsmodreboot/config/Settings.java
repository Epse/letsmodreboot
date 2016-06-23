package me.epse.letsmodreboot.config;

public class Settings {
    private static boolean logLess = false;
    public static boolean getLogLess() {
        return logLess;
    }
    public static void setLogLess(boolean logLess) {
        Settings.logLess = logLess;
    }
}
