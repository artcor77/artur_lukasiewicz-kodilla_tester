package com.kodilla.abstracts.homework;

public class AutomationTester extends Job{

    private String responsibilities;

    public AutomationTester(){

        this.responsibilities = "Create program to testing";
    }

    @Override
    public void PrintResponsibilities() {

        System.out.println(responsibilities);
    }
}
