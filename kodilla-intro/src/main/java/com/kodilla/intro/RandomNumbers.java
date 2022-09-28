package com.kodilla.intro;

import java.util.Random;

public class RandomNumbers {
    // Losowanie liczb z zakresu 0-30, aż ich suma osiągnie 5000.
    // Zwrócenie najmniejszej i największej wylosowanej liczby.
    // Pętla while

    int minN = 0;
    int maxN = 30;

    public void setMaxN(int maxN) {
        this.maxN = maxN;
    }

    public void setMinN(int minN) {
        this.minN = minN;
    }

    public static void main(String[] args) {
        int minN = 0;
        int maxN = 0;
        int sum = 0;
        int max = 5000;
        int liczba = 0;
        Random random = new Random();
        while (sum <= max) {
            int number = range(0, 31);
            sum = number + sum;

            System.out.println(number + " " + sum);

            }
        }


    static int range(int minN, int maxN) {
        Random random = new Random();
        int range = random.nextInt(maxN-minN);
        return range;
    }


    }

