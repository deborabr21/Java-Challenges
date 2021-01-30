package com.entertainment.client;

import com.entertainment.Television;

import java.util.Arrays;
import java.util.Scanner;

class TelevisionConsoleClient {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMessage();
    }

    public static void welcomeMessage() {

        //Welcome message to buyer
        System.out.println("Welcome to Our Online Ordering System.");
        System.out.println("Please answer the questions below to submit your order.");

        String brand = brandChoice();
        String display = displayChoice();
        int size = sizeChoice();

        System.out.println("Thank you. The television you ordered is: ");
        television(brand, display, size);

        //close scanner
        scanner.close();
    }


    public static String brandChoice() {
        String brandChoice = null;
        boolean hasBrand = false;

        while (!hasBrand) {

            System.out.println("Please enter the desired brand " + Arrays.toString(Television.VALID_BRANDS) + ":");
            brandChoice = scanner.nextLine();

            if (Television.isValidBrand(brandChoice))
                hasBrand = true;
            else
                System.out.println("Sorry " + brandChoice + " is not a valid brand");
        }
        return brandChoice;
    }

    private static String displayChoice() {
        String displayChoice = null;
        boolean hasDisplay = false;

        while (!hasDisplay) {

            System.out.println("Please enter the desired display type " + Arrays.toString(Television.VALID_DISPLAY) + ":");
            displayChoice = scanner.nextLine();

            if (Television.isValidDisplay(displayChoice))
                hasDisplay = true;
            else
                System.out.println("Sorry " + displayChoice + " is not a valid display type");
        }
        return displayChoice;
    }

    private static int sizeChoice() {
        Integer sizeChoice = null;
        boolean hasSize = false;

        while (!hasSize) {

            System.out.println("Please enter the desired size " + Arrays.toString(Television.VALID_SIZES) + ":");
            sizeChoice = Integer.parseInt(scanner.nextLine());

            if (Television.isValidSize(sizeChoice))
                hasSize = true;
            else
                System.out.println("Sorry " + sizeChoice + " is not a valid size");
        }
        return sizeChoice;
    }

    private static void television(String brand, String display, int size) {
        System.out.println(new Television(brand, display, size));
    }

}
