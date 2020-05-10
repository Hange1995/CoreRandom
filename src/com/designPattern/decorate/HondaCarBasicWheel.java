package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;
import com.designPattern.decorate.HondaCarDecorate;

public class HondaCarBasicWheel extends HondaCarDecorate {
    public HondaCarBasicWheel(HondaCar hondaCar) {
        super(hondaCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("assemble wheel");
        System.out.println("Set 16 Inch Wheel");
    }


    public static void main(String[] args) {
        HondaCar car=new HondaCarBasicWheel(new HondaCarBasicEngine(new BasicHondaCar()));
        car.assemble();
    }
}
