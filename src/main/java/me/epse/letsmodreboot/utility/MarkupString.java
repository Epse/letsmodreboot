package me.epse.letsmodreboot.utility;

public class MarkupString {
    public enum Colour {
        BLACK, DARK_BLUE, DARK_GREEN, DARK_AQUA, DARK_RED, DARK_PURPLE, GOLD, GRAY, DARK_GRAY,
        BLUE, GREEN, AQUA, RED, LIGHT_PURPLE, YELLOW, WHITE
    }

    public static String bold(String s) {
        return "§l" + s + "§r";
    }
    public static String underlined(String s) {
        return "§n" + s + "§r";
    }
    public static String obfuscated(String s) {
        return "§k" + s + "§r";
    }
    public static String italic(String s) {
        return "§o" + s + "§r";
    }
    public static String strikeThrough(String s) {
        return "§m" + s +"§r";
    }

    public static String colour(String s, Colour c) {
        switch (c) {
            case BLACK:
                return "§0" + s + "§r";
            case DARK_BLUE:
                return "§1" + s + "§r";
            case DARK_GREEN:
                return "§2" + s + "§r";
            case DARK_AQUA:
                return "§3" + s + "§r";
            case DARK_RED:
                return "§4" + s + "§r";
            case DARK_PURPLE:
                return "§5" + s + "§r";
            case GOLD:
                return "§6" + s + "§r";
            case GRAY:
                return "§7" + s + "§r";
            case DARK_GRAY:
                return "§8" + s + "§r";
            case BLUE:
                return "§9" + s + "§r";
            case GREEN:
                return "§a" + s + "§r";
            case AQUA:
                return "§b" + s + "§r";
            case RED:
                return "§c" + s + "§r";
            case LIGHT_PURPLE:
                return "§d" + s + "§r";
            case YELLOW:
                return "§e" + s + "§r";
            case WHITE:
                return "§f" + s + "§r";
        }
        // This shouldn't ever EVER be reached. Let's test for it anyhow
        LogHelper.error("Reached the unreachable in MarkupString, after the switch.");
        return null;
    }
}
