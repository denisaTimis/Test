package com.company;

public class NotWorking implements Status {
    public void render(Sensor sensor)
    {
        if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is not working");
        }
        else if  (sensor instanceof Camera)
        {
            System.out.println("Camera is not working");
        }
        else if  (sensor instanceof Temperature)
        {
            System.out.println("Temperature is not working");
        }
        else
        {
            System.out.println("Proximity is not working");
        }
    }
}
