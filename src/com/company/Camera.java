package com.company;

public class Camera implements Sensor {

    private Status status;
    public Camera()
    { ;
    }

    public void setStatus(Status status){
        this.status=status;
    }

    public Status getStatus(){
        return status;
    }
    public void CheckStatus(){

        if(status==null)
        {
            System.out.println("Status of the sensor Camera is unknown");
        }
        else
        {
            status.render(this);
        }
    }
}
