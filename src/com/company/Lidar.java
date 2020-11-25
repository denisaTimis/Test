package com.company;

public class Lidar implements Sensor {

    private Status status;
    public Lidar() {}

    public void setStatus(Status status){
        this.status=status;
    }

    public Status getStatus(){
        return status;
    }

    public void CheckStatus(){

        if(status==null)
        {
            System.out.println("Status of the sensor Lidar is unknown");
        }
        else
        {
            status.render(this);
        }
    }
}
