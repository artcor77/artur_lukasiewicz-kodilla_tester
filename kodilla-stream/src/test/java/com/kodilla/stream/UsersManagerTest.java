package com.kodilla.stream;

import org.junit.jupiter.api.Test;

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
        assertEquals(List.of(new User("Walter White", 50, 7, "Chemists").getUsername(),
                new User("Gale Boetticher", 44, 2, "Chemists").getUsername()), chemistsUsernames);
    }

    @Test
    public void testFilterOlderThanFourty() {
        //given
        UsersManager usersManager = new UsersManager();
        //when
        List<String> usersOlderThanFourty = UsersManager.filterOlderThanFourty();
        //then
        assertEquals(List.of(new User("Walter White", 50, 7, "Chemists").getUsername(),
                new User("Gus Firing", 49, 0, "Board").getUsername(),
                new User("Gale Boetticher", 44, 2, "Chemists").getUsername(),
                new User("Mike Ehrmantraut", 57, 0, "Security").getUsername()), usersOlderThanFourty);
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