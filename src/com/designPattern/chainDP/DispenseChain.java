package com.designPattern.chainDP;

import java.util.Currency;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(int currency);
}
