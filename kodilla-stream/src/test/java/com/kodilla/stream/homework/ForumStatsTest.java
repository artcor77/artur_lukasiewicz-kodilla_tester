package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    public void testForumStatsForYoungerGroup() {

        //when
        Double users = ForumStats.youngerGroup();
        //then
        assertEquals(2382.0, users);

    }

    @Test
    public void testForumStatsForOlderGroup() {

        //when
        Double users = ForumStats.olderGroup();
        //then
        assertEquals(2.25, users);
    }
}