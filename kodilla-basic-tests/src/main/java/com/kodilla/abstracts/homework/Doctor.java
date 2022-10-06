package com.kodilla.abstracts.homework;

public class Doctor extends Job{

    private String responsibilities;
    public Doctor(){

        this.responsibilities = "Healing people";
    }
    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
