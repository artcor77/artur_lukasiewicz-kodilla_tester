package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {

        processUsersStream();  // 1 sposób

        List<String> filterChemistGroupUsernames = filterChemistGroupUsernames();  // 2 sposób
        System.out.println(filterChemistGroupUsernames);

        List<String> filterOlderThanFourty = filterOlderThanFourty();
        System.out.println(filterOlderThanFourty);
    }

    private static void processUsersStream() {  // 1 sposób

        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static List<String> filterChemistGroupUsernames() {  // 2 sposób - LISTA

        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> filterOlderThanFourty() {

        List<String> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return users;
    }

    public static List<String> filterActiveUsersOlderThanFourty() {

        List<String> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 100)
                .filter(user -> user.getAge() > 40)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return users;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
