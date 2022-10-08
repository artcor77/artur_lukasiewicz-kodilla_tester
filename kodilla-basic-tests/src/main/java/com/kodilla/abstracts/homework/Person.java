package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName,int age,Job job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }

    public static void main(String[] args) {
        Person adamKowalski = new Person("Adam Kowalski", 30, new TaxiDriver());
        System.out.println(adamKowalski.getJob().getResponsibilities());

        Person juliaKowalska = new Person("Julia Kowalska", 35, new Doctor());
        System.out.println(juliaKowalska.getJob().getResponsibilities());

        Person robertKowalski = new Person("Robert Kowalski", 25, new AutomationTester());
        System.out.println(robertKowalski.getJob().getResponsibilities());
    }
    public Job getJob() {
        return job;
    }
}
