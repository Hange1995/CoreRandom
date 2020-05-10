package com.designPattern.decorate;

import com.designPattern.decorate.HondaCar;
import com.designPattern.decorate.HondaCarDecorate;

public class HondaCarBasicEngine extends HondaCarDecorate {
    public HondaCarBasicEngine(HondaCar hondaCar) {
        super(hondaCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("assemble engine");
        System.out.println("Set V4 engine");
    }
}
