package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTestSuite {

        private WeatherAlertService weatherAlertService;
        private Location location1;
        private Location location2;
        private Location location3;

        private Client client1;
        private Client client2;
        private Client client3;

        private Notification notification;
    @BeforeEach
    public void init() {
        weatherAlertService = new WeatherAlertService();
        location1 = Mockito.mock(Location.class);
        location2 = Mockito.mock(Location.class);
        location3 = Mockito.mock(Location.class);

        client1 = Mockito.mock(Client.class);
        client2 = Mockito.mock(Client.class);
        client3 = Mockito.mock(Client.class);

        notification = Mockito.mock(Notification.class);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        //given
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //when then
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        //given
        weatherAlertService.addClientToLocation(client2, location1);
        //when
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //then
        Mockito.verify(client2).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToSubscribersForOneLocation() {
        //given
        weatherAlertService.addClientToLocation(client2, location1);
        weatherAlertService.addClientToLocation(client1, location2);
        weatherAlertService.addClientToLocation(client3, location3);
        weatherAlertService.addClientToLocation(client1, location3);
        //when
        weatherAlertService.sendNotificationToAllSubscribersForTheLocation(location3, notification);
        //then
        Mockito.verify(client3).receive(notification);
        Mockito.verify(client1).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        //given
        weatherAlertService.addClientToLocation(client1, location1);
        weatherAlertService.addClientToLocation(client2, location2);
        weatherAlertService.addClientToLocation(client3, location3);
        //when
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //then
        Mockito.verify(client1).receive(notification);
        Mockito.verify(client2).receive(notification);
        Mockito.verify(client3).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        //given
        weatherAlertService.addClientToLocation(client1, location1);
        weatherAlertService.addClientToLocation(client2, location2);
        weatherAlertService.removeSubscriberFromAllLocations(client2);
        //when
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //then
        Mockito.verify(client1).receive(notification);
    }

    @Test
    public void clientWhoSubscribeMinOneLocationShouldReceiveNotification() {
        //given
        weatherAlertService.addClientToLocation(client1, location1);
        weatherAlertService.addClientToLocation(client2, location2);
        weatherAlertService.addClientToLocation(client3, location3);
        weatherAlertService.addClientToLocation(client1, location2);
        weatherAlertService.removeSubscriberFromLocation(client1, location1);
        //when
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //then
        Mockito.verify(client1).receive(notification);
        Mockito.verify(client2).receive(notification);
        Mockito.verify(client3).receive(notification);
    }

    @Test
    public void shouldWorkWhenLocationIsRemoved() {
        //given
        weatherAlertService.addClientToLocation(client1, location1);
        weatherAlertService.addClientToLocation(client2, location2);
        weatherAlertService.addClientToLocation(client3, location3);
        weatherAlertService.addClientToLocation(client1, location2);
        weatherAlertService.removeLocation(location2);
        //when
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        //then
        Mockito.verify(client1).receive(notification);
        Mockito.verify(client3).receive(notification);
    }

    @BeforeAll
    public static void startMessage() {
        System.out.println("Starting testing");
    }

    @AfterEach
    public void endTest() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishMessage() {
        System.out.println("Finishing testing");
    }
}