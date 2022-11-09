package com.kodilla.intro.homework;

public class User {

    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean isNameNotNull() {
        if(this.name != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOlderThan(double age) {
        if(this.age > age ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHigherThan(double height) {
        if(this.height > height) {
            return true;
        } else {
            return false;
        }
    }
}
