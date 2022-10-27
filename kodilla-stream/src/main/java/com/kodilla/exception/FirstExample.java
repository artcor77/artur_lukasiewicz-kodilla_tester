package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        String[] nameParts = username.split(" "); // Rozdzielamy username na dwie części. Spacja to miejsce podziału w tym przypadku.
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);


        // Błąd NullPointerException - wywołanie metody na obiekcie, który jest null'em.
        String username1 = null;
        String[] nameParts1 = username1.split(" "); // Rozdzielamy username na dwie części. Spacja to miejsce podziału w tym przypadku.
        System.out.println("Firstname: " + nameParts1[0]);
        System.out.println("Lastname: " + nameParts1[1]);


        // Błąd ArrayIndexOutOfBoundsExceptio - odwołujemy się do składowej o indeksie [1], a ona nie istnie
        String username2 = "John";
        String[] nameParts2 = username2.split(" "); // Rozdzielamy username na dwie części. Spacja to miejsce podziału w tym przypadku.
        System.out.println("Firstname: " + nameParts2[0]);
        System.out.println("Lastname: " + nameParts2[1]);
    }
}
