package com.designPattern;

public class Singleton {
//    //Singleton in lazy load. use static to prevent other override it.
//    private static Singleton singleton;
//    private Singleton() {
//    }
//    public static Singleton getInstance(){
//        if (singleton==null) singleton=new Singleton();
//        return singleton;
//    }
    //Singleton in eager load. Create instance first.

    private static Singleton singleton =new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
