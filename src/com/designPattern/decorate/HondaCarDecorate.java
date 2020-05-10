package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;

public class HondaCarDecorate implements HondaCar {
    protected HondaCar hondaCar;

    public HondaCarDecorate(HondaCar hondaCar) {
        this.hondaCar = hondaCar;
    }

    @Override
    public void assemble() {
        this.hondaCar.assemble();
    }
}