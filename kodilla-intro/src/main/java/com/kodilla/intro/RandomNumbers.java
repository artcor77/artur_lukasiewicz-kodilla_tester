package com.kodilla.intro;

import java.util.Random;

public class RandomNumbers {
    private int minN = 30;
    private int maxN = 0;

    public int findMin() {
        return minN;
    }

    public int findMax() {
        return maxN;
    }

    public void randomNumbersTo5000() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int number = random.nextInt(0,31);
            if (number < minN) {
                minN = number;
            }
            if (number > maxN) {
                maxN = number;
            }
            sum = sum + number;
            System.out.println("Number: " + number);
            System.out.println("Actual sum = " + sum);
        }
    }

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.randomNumbersTo5000();
        System.out.println("==================");
        System.out.println("min: " + randomNumbers.findMin());
        System.out.println("max: " + randomNumbers.findMax());
    }
}

