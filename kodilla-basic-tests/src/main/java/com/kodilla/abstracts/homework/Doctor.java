package com.kodilla.abstracts.homework;

public class Doctor extends Job{

    private String responsibilities;
    public Doctor(String responsibilities){
        this.responsibilities = responsibilities;
    }
    public Doctor(){
        responsibilities = "Healing people";
    }
    @Override
    public void whatResponsibilities() {
        System.out.println(responsibilities);
    }
}
