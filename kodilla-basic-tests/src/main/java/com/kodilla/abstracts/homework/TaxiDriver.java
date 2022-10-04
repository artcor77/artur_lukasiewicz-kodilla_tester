package com.kodilla.abstracts.homework;

public class TaxiDriver extends Job{
private String responsibilities;
public TaxiDriver(){
    this.responsibilities = "Picking up a passenger from point a to point b, taking care of safety";
}
    @Override
    public void PrintResponsibilities() {
    System.out.println(responsibilities);
    }
}
