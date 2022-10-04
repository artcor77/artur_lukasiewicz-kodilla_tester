package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public String job;

    public Person(String firstName,int age,String job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }

    public static void main(String[] args) {
        Person person = new Person("Adam",30,"Taxi Driver");
        person.responsibilitiesOfPerson();
        TaxiDriver taxiDriver = new TaxiDriver();
        taxiDriver.whatResponsibilities();

        Person person2 = new Person("Julia",35,"Doctor");
        person2.responsibilitiesOfPerson();
        Doctor doctor = new Doctor();
        doctor.whatResponsibilities();

        Person person3 = new Person("Robert",25,"Automation Tester");
        person3.responsibilitiesOfPerson();
        AutomationTester automationTester = new AutomationTester();
        automationTester.whatResponsibilities();

    }
    public void responsibilitiesOfPerson(){
        System.out.println(firstName+", "+age+" years old "+job+" has these responsibilities: ");
    }
}
