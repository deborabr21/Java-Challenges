/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * Lab - Composition
 *
 * The Television class.  With constructors, properties, accessor, and business methods.
 * It now defines static members for MIN/MAX volume values
 * It checks incoming volume values for validity
 * It includes a DisplayType field to represent its display type
 *
 * It's now in a package, and enforces encapsulation
 *
 */

package com.entertainment;

public class Television {

    // CLASS OR STATIC VARIABLES - STORED IN THE SHARED AREA ASSOCIATED WITH A CLASS
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    public static final String[] VALID_DISPLAY = {"LED", "OLED", "PLASMA", "LCD", "CRT"};
    public static final int[] VALID_SIZES = {32, 40, 43, 50, 55, 60, 65, 70, 75, 80};

    // FIELDS - AKA 'INSTANCE VARIABLES', 'ATTRIBUTES', 'PROPERTIES'
    private String brand;
    private String display;
    private int size;


    // CONSTRUCTORS
    // No-arg constructor.
    public Television() {
        // possible additional "setup" or initialization code here
        // want it to run for every instance created
    }

    // 3-arg constructor
    public Television(String brand, String display, int size) {
        this.brand = brand;
        this.display = display;
        this.size = size;
    }


    // ACCESSOR METHODS (getters/setters)

    public String getBrand() {
        return brand;
    }

    public String getDisplay() {
        return display;
    }

    public int getSize() { return size; }


    public static boolean isValidBrand(String brand) {
        boolean isValid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equalsIgnoreCase(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public static boolean isValidDisplay(String display) {
        boolean isValid = false;

        for (String currentDisplay : VALID_DISPLAY) {
            if (currentDisplay.equalsIgnoreCase(display)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public static boolean isValidSize(int size) {
        boolean isValid = false;

        for (int currentSize : VALID_SIZES) {
            if (currentSize == size) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public String toString() {
        return "Television: " + getBrand() + ", Display: " + getDisplay() + ", Size: " + getSize() + " inches.";
    }
}