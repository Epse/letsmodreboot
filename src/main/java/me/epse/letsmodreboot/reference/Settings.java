package me.epse.letsmodreboot.reference;

public class Settings {
    //<editor-fold desc="FLAME">
    // static variables: no! they are evil!
    // learn the programmer meaning of "evil" fag
    //</editor-fold>
    public static class General {
        private static boolean logLess = false;
        private static boolean logTraceToInfo = false;

        public static boolean getLogLess() {
            return logLess;
        }

        public static void setLogLess(boolean logLess) {
            General.logLess = logLess;
        }

        public static boolean getLogTraceToInfo() {
            return logTraceToInfo;
        }

        public static void setLogTraceToInfo(boolean logTraceToInfo) {
            General.logTraceToInfo = logTraceToInfo;
        }
    }
}
