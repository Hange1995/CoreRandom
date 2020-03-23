package com.excepetion;

public class InsufficientSavingException extends Exception {
    public InsufficientSavingException() {
        super("Insufficient Saving Amount");
    }
    public InsufficientSavingException(String message){
        super(message);
    }
}
