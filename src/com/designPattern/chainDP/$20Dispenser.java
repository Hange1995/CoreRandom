package com.designPattern.chainDP;

public class $20Dispenser implements DispenseChain {
    private DispenseChain chain;
    private int numberOf$20=10;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(int currency) {
        if (currency>=20&&numberOf$20>0){
            int number=currency/20;
            number=Math.min(number,numberOf$20);
            numberOf$20=numberOf$20-number;
            int remainder=currency-number*20;
            System.out.println("$20: "+number);
            this.chain.dispense(remainder);
        }else {
            this.chain.dispense(currency);
        }
    }
}
