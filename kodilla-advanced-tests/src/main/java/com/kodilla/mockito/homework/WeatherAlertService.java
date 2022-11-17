package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<Location, Set<Client>> clients = new HashMap<>();

    public void addClientToLocation(Client client, Location location) {
        if (!clients.containsKey(location)) {
            clients.put(location, new HashSet<>());
        }
        clients.get(location).add(client);
    }

    public void removeSubscriberFromLocation(Client client, Location location) {
        clients.get(location).remove(client);
    }

    public void removeLocation(Location location) {
        clients.remove(location);
    }

    public void removeSubscriberFromAllLocations(Client client) {
        for (Map.Entry<Location, Set<Client>> entry : clients.entrySet()) {
            entry.getValue().remove(client);
        }
    }

    public void sendNotificationToAllSubscribers(Notification notification) {
        for (Map.Entry<Location, Set<Client>> entry : clients.entrySet()) {
            entry.getValue().forEach(user -> user.receive(notification));
        }
    }

    public void sendNotificationToAllSubscribersForTheLocation(Location location, Notification notification) {
        if (clients.containsKey(location)) {
            clients.get(location).forEach(client -> client.receive(notification));
        }
    }
}
