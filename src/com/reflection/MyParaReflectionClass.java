package com.reflection;

public class MyParaReflectionClass {
    public void doSomethingElse(@MyParaInterface(name = "hange",value = "para") String str ){
        System.out.println(str);
    }
}
