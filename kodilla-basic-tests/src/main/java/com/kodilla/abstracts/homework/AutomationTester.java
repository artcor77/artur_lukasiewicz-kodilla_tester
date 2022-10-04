package com.kodilla.abstracts.homework;

public class AutomationTester extends Job{

    private String responsibilities;
    public AutomationTester(String responsibilities){
        this.responsibilities = responsibilities;
    }
    public AutomationTester(){
        responsibilities = "Create program to testing";
    }

    @Override
    public void whatResponsibilities() {
        System.out.println(responsibilities);
    }
}
