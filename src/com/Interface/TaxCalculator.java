package com.Interface;

public class TaxCalculator implements canCalculatorTax {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome*0.34;
    }
}
