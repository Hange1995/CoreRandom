package com.designPattern;

public class HondaCarEngine extends HondaCarDecorate {
    public HondaCarEngine(HondaCar hondaCar) {
        super(hondaCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Set V4 engine");
    }
}
