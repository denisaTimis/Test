package com.company;

import java.util.ArrayList;

public class DataModel {

    ArrayList<Panel> panels;
    ArrayList<Sensor> sensors;

    public DataModel()
    {
        panels=new ArrayList<Panel>();
        sensors=new ArrayList<Sensor>();
    }

    public void checkStatus()
    {
        for (Sensor sensor :sensors)
        {
            sensor.CheckStatus();
        }
        for (Panel panel:panels)
        {
            panel.checkStatus();
        }
    }

    public void AddSensor(Sensor sensor)
    {
        sensors.add(sensor);
    }

    public void AddPanel (Panel panel)
    {
        panels.add(panel);
    }
}
