package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;
import com.designPattern.decorate.HondaCarDecorate;

public class HondaCarBasicWheel extends HondaCarDecorate {
    public HondaCarBasicWheel(HondaCar hondaCar) {
        super(hondaCar);
        System.out.println("in Wheel constructor");
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("assemble wheel");
        System.out.println("Set 16 Inch Wheel");
    }
    @Override
    public int cost(){
        System.out.println(200+super.cost());
        return 200+super.cost();
    }


    public static void main(String[] args) {
        HondaCar car=new HondaCarBasicWheel(new HondaCarBasicEngine(new BasicHondaCar()));
        car.assemble();
//        car.cost();
    }
}
