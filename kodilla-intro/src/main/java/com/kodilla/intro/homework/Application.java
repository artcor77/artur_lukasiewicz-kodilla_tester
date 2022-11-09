package com.kodilla.intro.homework;

public class Application {

    public static void main(String[] args) {

        User user = new User("Adam", 40.5, 178);
        if (user.isNameNotNull()) {
            if (user.isOlderThan(30) && user.isHigherThan(160))
                System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
