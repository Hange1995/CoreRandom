package com.Interface;

public class TaxReport {
    private canCalculatorTax calculator;

    public TaxReport (canCalculatorTax calculator){
        this.calculator = calculator;
    }

    public void show(){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }
    public void setCalculator(canCalculatorTax calculator) {
        this.calculator = calculator;
    }
}
