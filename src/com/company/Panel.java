package com.company;

import java.util.ArrayList;

public class Panel {

    ArrayList<Sensor> sensors;

    public Panel()
    {
        sensors=new ArrayList<Sensor>();
    }

    public void checkStatus()
    {
        for (Sensor sensor :sensors)
        {
            sensor.CheckStatus();
        }
    }

    public void AddSensor(Sensor sensor)
    {
        sensors.add(sensor);
    }
}
