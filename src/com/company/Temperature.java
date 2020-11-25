package com.company;

public class Temperature implements Sensor {

    private Status status;

    public Temperature(){}

    public void setStatus(Status status){
        this.status=status;
    }

    public Status getStatus(){
        return status;
    }

    public void CheckStatus(){

        if(status==null)
        {
            System.out.println("Status of the sensor Temperature is unknown");
        }
        else
        {
            status.render(this);
        }
    }
}
