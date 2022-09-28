package com.kodilla.intro;

public class User {
    User[] user;
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        User artur = new User("Artur", 30);
        User anna = new User("Anna", 15);
        User bartosz = new User("Bartosz", 25);
        User beata = new User("Beata", 35);
        User cezary = new User("Cezary", 20);

        User[] user = {artur, anna, bartosz, beata, cezary};

        double sum = 0;
        for (int i = 0; i < user.length; i++) {
            sum += user[i].age;
        }
        sum = sum / user.length;
        System.out.println("Average of users age: "+sum);

        double averageAge = sum ;
        for (int i = 0; i < user.length; i++) {
            if (user[i].age<averageAge){
                System.out.println(user[i].name + " " + user[i].age);
            }
        }


    }

}
