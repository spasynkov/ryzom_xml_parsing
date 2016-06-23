package model;

/**
 * Simple helper-class for getting item's color
 */
public class ItemsColors {
    private static String[] colorsTable = {
            "UNKNOWN_COLOR",
            "Beige",
            "Black",
            "Green",
            "Blue",     // 4
            "Purple",
            "Red",
            "Turquoise",
            "White"
    };

    public static String getColorById(byte colorId) {
        return colorsTable[colorId];
    }
}
