package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    public void testForumStatsForYoungerGroup() {
        //given
        List<User> users = List.of(new User("A", 0, 20, "a"),
                new User("A", 40, 20, "a"),
                new User("A", 30, 20, "a"),
                new User("A", 60, 20, "a"));
        //when
        double average = ForumStats.getAverageNumberOfPostsInGroupOfUsersYoungerThan(users, 40);
        //then
        assertEquals(20, average);
    }

    @Test
    public void testForumStatsForOlderGroup() {
        //given
        List<User> users = List.of(new User("A", 0, 20, "a"),
                new User("A", 40, 20, "a"),
                new User("A", 30, 20, "a"),
                new User("A", 60, 30, "a"));
        //when
        double average = ForumStats.getAverageNumberOfPostsInGroupOfUsersOlderThan(users, 40);
        //then
        assertEquals(25, average);
    }

    @Test
    public void testForumStatsWhenListHasZeroUsers() {
        //given
        List<User> users = new ArrayList<>();
        //when
        double average = ForumStats.getAverageNumberOfPostsInGroupOfUsersOlderThan(users, 40);
        //then
        assertEquals(0, average);
    }
}