package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        System.out.println("Average of posts in group of users younger than: "
                + getAverageNumberOfPostsInGroupOfUsersYoungerThan(users, 40));
        System.out.println("Average of posts in group of users older than: "
                + getAverageNumberOfPostsInGroupOfUsersOlderThan(users, 40));
    }

    public static double getAverageNumberOfPostsInGroupOfUsersYoungerThan(List<User> users, int age) {
         double average = users
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToDouble(n -> n.getNumberOfPost())
                .average().orElse(0);
        return average;
    }

    public static double getAverageNumberOfPostsInGroupOfUsersOlderThan(List<User> users, int age) {
        double average = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average().orElse(0);
        return average;
    }
}
