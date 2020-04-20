package com.designPattern.chainDP;

public class $10Dispenser implements DispenseChain {
    private int numberOf$10=10;
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(int currency) {
            int number=currency/10;
            number=Math.min(number,numberOf$10);
            numberOf$10=numberOf$10-number;
            int remainder=currency-number*10;
            if (remainder>0){
                throw new IllegalStateException("ATM don't have enough amount of money");
            }
            System.out.println("$10: "+number);
    }
}
