package com.designPattern;

public class HondaCarWheel extends HondaCarDecorate {
    public HondaCarWheel(HondaCar hondaCar) {
        super(hondaCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Set 16 Inch Wheel");
    }


    public static void main(String[] args) {
        HondaCarWheel car = new HondaCarWheel(new HondaCarEngine(new BasicHondaCar()));
        car.assemble();
    }
}
