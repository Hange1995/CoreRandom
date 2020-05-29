package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;

public class BasicHondaCar implements HondaCar {

    @Override
    public void assemble() {
        System.out.println("Basic assemble");
        System.out.println("8 Air bag");
        System.out.println("4 Door");
    }

    @Override
    public int cost() {
        return 1000;
    }
}
