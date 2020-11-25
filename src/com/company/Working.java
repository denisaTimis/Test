package com.company;

public class Working implements Status {

    public void render(Sensor sensor)
    {
        if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is working");
        }
        else if  (sensor instanceof Camera)
        {
            System.out.println("Camera is working");
        }
        else if  (sensor instanceof Temperature)
        {
            System.out.println("Temperature is working");
        }
        else
        {
            System.out.println("Proximity is working");
        }
    }
}
