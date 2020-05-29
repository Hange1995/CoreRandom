package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;

public class HondaCarDecorate implements HondaCar {
    protected HondaCar hondaCar;

    public HondaCarDecorate(HondaCar hondaCar) {
        this.hondaCar = hondaCar;
        System.out.println("In Decorate constructor");
    }

    @Override
    public void assemble() {
        this.hondaCar.assemble();
    }

    @Override
    public int cost() {
        System.out.println("price: "+this.hondaCar.cost());
       return this.hondaCar.cost();
    }
}
