package com.kodilla.abstracts.homework;

public class TaxiDriver extends Job{
private String responsibilities;
public TaxiDriver(String responsibilities){
    this.responsibilities = responsibilities;
}
public TaxiDriver(){
    responsibilities = "Picking up a passenger from point a to point b, taking care of safety";
}
    @Override
    public void whatResponsibilities() {
        System.out.println(responsibilities);
    }
}
