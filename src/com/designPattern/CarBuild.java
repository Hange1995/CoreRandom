package com.designPattern;

public class CarBuild {
    private String brand;
    private String model;
    private String color;
    private int engine;
    public CarBuild(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public CarBuild setColor(String colorOfCar){
        this.color=colorOfCar;
        return this;
    }
    public CarBuild setEngine(int engineNumber){
        this.engine=engineNumber;
        return this;
    }
    public Car build(){
        return new Car(this);
    }
}
