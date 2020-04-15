package com.designPattern;

public class BasicHondaCar implements HondaCar {
    @Override
    public void assemble() {
        System.out.println("8 Air bag");
        System.out.println("4 Door");
    }
}
