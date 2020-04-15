package com.designPattern;

public class CarFactory {
    //create a instance as null first
    //create some variable for this class
    private String brand;
    private String model;
    private String color;
    private int engine;
    //make the constructor private so other can't make their own instance.
    private CarFactory() {
    }
    //create a method offer other to use to get the instance model i build.
    public static CarFactory getInstance(String brand, String model){
        CarFactory instance=new CarFactory();
        if ("BMW".equalsIgnoreCase(brand)&&"M3".equalsIgnoreCase(model)) {
            instance.setBrand(brand);
            instance.setColor("black");
            instance.setModel(model);
            instance.setEngine(8);
        }
        if ("Alpha Romeo".equalsIgnoreCase(brand)&&"Gulia".equalsIgnoreCase(model)){
            instance.setBrand(brand);
            instance.setColor("red");
            instance.setModel(model);
            instance.setEngine(6);
        }
        return instance;
    }
    //set those variable;
    private void setBrand(String brand) { this.brand = brand; }

    private void setModel(String model) { this.model = model; }

    private void setColor(String color) { this.color = color; }

    private void setEngine(int engine) { this.engine = engine; }
}
