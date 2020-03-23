package com.excepetion;

import java.io.IOException;

public class Account {
    private float balance =20;
    public void deposit(float value) throws IOException{
        if (value<= 0){
            throw new IOException("deposit can not be negative");
        }
    }
    public void withdraw(float value) throws AccountException {
        if (value >balance){
            throw new AccountException(new InsufficientSavingException());

        }
    }
}
