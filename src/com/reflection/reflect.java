package com.reflection;

import cup.Cup;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect {
    public static void main(String[] args) throws Exception {
        //first to get the class is new a instance first and than get the class by this instance.
        Cup cupClass=new Cup();
        Class cls = cupClass.getClass();

        //
        try {
            Class cup1= Class.forName("cup.Cup");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The name of the class is: "+ cls.getName());

        //get constructor may be you pass the wrong const
        Constructor constructor =cls.getConstructor();
        System.out.println("The name of the constructor: "+ constructor.getName());

        //get methods is to ge t the method in this class and the methods from the super class.
        Method[] method = cls.getMethods();

        //get declareMethods is get the methods in this class only
        Method[] methods=cls.getDeclaredMethods();
        for (Method method1:method){
            System.out.println("The name of method: "+method1.getName());
        }
        for (Method method1:methods){
            System.out.println("The name of method in this class is: "+method1.getName());
        }
        Field field=cls.getField("weight");
        System.out.println("The field name is: "+field.getName());
        field.setAccessible(true);
        field.set(cupClass,50.0);
        System.out.println(cupClass.getWeight());

        Method method2=cls.getDeclaredMethod("daoShui");
        method2.invoke(cupClass);
    }


}
