package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {

    public static void main(String[] args) {

        System.out.println("Younger group: " + youngerGroup());
        System.out.println("Older group: " + olderGroup());
    }

    public static double youngerGroup() {

        double youngerGroup = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        return youngerGroup;
    }

    public static double olderGroup() {

        double youngerGroup = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        return youngerGroup;
    }
}
