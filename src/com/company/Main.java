package com.company;

public class Main {

    public static void main(String[] args) {

        Camera camera =new Camera();
        Temperature temperature =new Temperature();
        Proximity proximity=new Proximity();
        Lidar lidar=new Lidar();
        Panel panel =new Panel();
        panel.AddSensor(lidar);
        panel.AddSensor(camera);
        panel.AddSensor(temperature);
        DataModel dataModel=new DataModel();
        dataModel.AddPanel(panel);
        dataModel.AddSensor(proximity);

        lidar.setStatus(new Working());
        camera.setStatus(new NotWorking());
        proximity.setStatus(new ProductionMode());
        temperature.setStatus(new Working());

        dataModel.checkStatus();
    }
}
