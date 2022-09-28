package com.kodilla.intro;

import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4]
            if (name.length() >= 2) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply): ");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static String firstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter of colour:");
        String letter = scanner.next().trim();
        return letter;
    }

    public static String whatColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of colour:");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "B":
                    return "BROWN";
                case "Y":
                    return "YELLOW";
                case "G":
                    return "GREEN";
                case "W":
                    return "WHITE";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}