package com.designPattern.chainDP;

public class ATM {
    public void dispense(int amount){
        $50Dispenser d5d =new $50Dispenser();
        $20Dispenser d2d =new $20Dispenser();
        $10Dispenser d1d =new $10Dispenser();
        d5d.setNextChain(d2d);
        d2d.setNextChain(d1d);
        d5d.dispense(amount);
    }

    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.dispense(130);

    }

}
