package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);

    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);

    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherAlertService.sendNotificationToAllSubscribers(notification);

        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        weatherAlertService.addSubscribers(client2, location1);

        weatherAlertService.sendNotificationToAllSubscribers(notification);

        Mockito.verify(client2).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToSubscribersForOneLocation() {
        weatherAlertService.addSubscribers(client2, location1);
        weatherAlertService.addSubscribers(client1, location2);
        weatherAlertService.addSubscribers(client3, location3);
        weatherAlertService.addSubscribers(client1, location3);

        weatherAlertService.sendNotificationToAllSubscribersForTheLocation(location3, notification);

        Mockito.verify(client3).receive(notification);
        Mockito.verify(client1).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        weatherAlertService.addSubscribers(client1, location1);
        weatherAlertService.addSubscribers(client2, location2);
        weatherAlertService.addSubscribers(client3, location3);

        weatherAlertService.sendNotificationToAllSubscribers(notification);

        Mockito.verify(client1).receive(notification);
        Mockito.verify(client2).receive(notification);
        Mockito.verify(client3).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        weatherAlertService.addSubscribers(client1, location1);
        weatherAlertService.addSubscribers(client2, location2);
        weatherAlertService.removeSubscriberFromAllLocations(client2);

        weatherAlertService.sendNotificationToAllSubscribers(notification);

        Mockito.verify(client1).receive(notification);
    }

    @Test
    public void clientWhoSubscribeMinOneLocationShouldReceiveNotification() {
        weatherAlertService.addSubscribers(client1, location1);
        weatherAlertService.addSubscribers(client2, location2);
        weatherAlertService.addSubscribers(client3, location3);
        weatherAlertService.addSubscribers(client1, location2);
        weatherAlertService.removeSubscriberFromLocation(client1, location1);

        weatherAlertService.sendNotificationToAllSubscribers(notification);

        Mockito.verify(client1).receive(notification);
        Mockito.verify(client2).receive(notification);
        Mockito.verify(client3).receive(notification);
    }

    @Test
    public void shouldWorkWhenLocationIsRemoved() {
        weatherAlertService.addSubscribers(client1, location1);
        weatherAlertService.addSubscribers(client2, location2);
        weatherAlertService.addSubscribers(client3, location3);
        weatherAlertService.addSubscribers(client1, location2);
        weatherAlertService.removeLocation(location2);

        weatherAlertService.sendNotificationToAllSubscribers(notification);

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