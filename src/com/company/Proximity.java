package com.company;

public class Proximity implements Sensor
{
    private Status status;

    public Proximity() {}

    public void setStatus(Status status){
        this.status=status;
    }

    public Status getStatus(){
        return status;
    }

    public void CheckStatus(){

        if(status==null)
        {
            System.out.println("Status of the sensor Proximity is unknown");
        }
        else
        {
            status.render(this);
        }
    }
}
