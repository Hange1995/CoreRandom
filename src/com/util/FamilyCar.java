package com.util;

public class FamilyCar {
    private static FamilyCar instance;
    public FamilyCar() {
    }
    public static FamilyCar getInstance(){
        if (instance==null){
            instance = new FamilyCar();
        }return instance;
    }

    public static void main(String[] args) {

    }
}
