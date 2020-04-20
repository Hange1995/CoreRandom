package com.designPattern.chainDP;

import java.text.NumberFormat;
import java.util.Currency;

public class $50Dispenser implements DispenseChain{
    private DispenseChain chain;
    private int numberOf$50=10;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(int currency) {
        if (currency>=50&&numberOf$50>0){
            int number=currency/50;
            number=Math.min(number,numberOf$50);
            numberOf$50=numberOf$50-number;
            int remainder=currency-number*50;
            System.out.println("$50: "+number);
            this.chain.dispense(remainder);
        }else {
            this.chain.dispense(currency);
        }
    }
}
