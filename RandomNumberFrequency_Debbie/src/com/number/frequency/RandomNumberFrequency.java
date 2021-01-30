package com.number.frequency;

public class RandomNumberFrequency {

    //Static variables
    private static final int MIN = 1;
    private static final int MAX = 20;
    private int[] TOTAL = new int[1000];
    private int[] results = new int[20];

    public RandomNumberFrequency() {
        // no-op
    }

    //Method to generate a random number between MIN and MAX range
    public static int randNum(int min, int max) {
        return (int) (Math.random() * MAX) + MIN;
    }

    //Method to invoke randNum method 1000 times and record each result
    public void totalResult() {
        for (int i = 0; i < TOTAL.length; i++) {
            results[(randNum(MIN, MAX) - 1)]++;
        }

        //print results showing how many occurrences of each number there were
        for (int j = 0; j < results.length; j++) {
            System.out.println((j+1) + " was returned " + results[j] + " times.");
        }
    }

}
