package me.epse.letsmodreboot.config;

public class Settings {
    //<editor-fold desc="FLAME">
    // static variables: no! they are evil!
    // learn the programmer meaning of "evil" fag
    //</editor-fold>
    private static boolean logLess = false;
    public static boolean getLogLess() {
        return logLess;
    }
    public static void setLogLess(boolean logLess) {
        Settings.logLess = logLess;
    }
}
