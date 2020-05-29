package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;

public class LuxuryHondaCar implements HondaCar {

    @Override
    public void assemble() {
        System.out.println("12 Air Bags");
        System.out.println("4 Door");
        System.out.println("Moon Roof");
    }

    @Override
    public int cost() {
        return 3000;
    }
}
