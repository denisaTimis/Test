package com.company;

public class ProductionMode implements Status {
    public void render(Sensor sensor)
    {
        if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is in production mode");
        }
        else if  (sensor instanceof Camera)
        {
            System.out.println("Camera is in production mode");
        }
        else if  (sensor instanceof Temperature)
        {
            System.out.println("Temperature is in production mode");
        }
        else
        {
            System.out.println("Proximity is in production mode");
        }
    }
}
