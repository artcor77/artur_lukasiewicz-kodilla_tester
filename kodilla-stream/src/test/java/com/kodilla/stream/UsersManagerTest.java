package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        UsersManager usersManager = new UsersManager();
        //when
        List<String> chemistsUsernames = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> usernames = new ArrayList<>();
        usernames.add("Walter White");
        usernames.add("Gale Boetticher");
        assertEquals(usernames, chemistsUsernames);
    }

    @Test
    public void testFilterOlderThan() {
        //given
        UsersManager usersManager = new UsersManager();
        //when
        List<User> usersOlderThan = UsersManager.filterOlderThan(40);
        //then
        assertEquals(List.of(new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Firing", 49, 0, "Board"),
                new User("Gale Boetticher", 44, 2, "Chemists"),
                new User("Mike Ehrmantraut", 57, 0, "Security")), usersOlderThan);
    }

    @Test
    public void testFilterActiveUsersOlderThanFourty() {
        //given
        UsersManager usersManager = new UsersManager();
        //when
        List<String> activeUsersOlderThanFourty = UsersManager.filterActiveUsersOlderThanFourty();
        //then
        assertEquals(Collections.emptyList(), activeUsersOlderThanFourty);
    }
}