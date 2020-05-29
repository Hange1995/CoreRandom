package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;
import com.designPattern.decorate.HondaCarDecorate;

public class HondaCarBasicEngine extends HondaCarDecorate {
    public HondaCarBasicEngine(HondaCar hondaCar) {
        super(hondaCar);
        System.out.println("in Engine constructor");
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("assemble engine");
        System.out.println("Set V4 engine");
    }
    @Override
    public int cost(){
        System.out.println(100+super.cost());
        return 100+super.cost();
    }
}
