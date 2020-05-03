package com.reflection;

import cup.Cup;
import org.omg.CORBA.CurrentOperations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflect {
    public static void main(String[] args) throws Exception {
        //first to get the class is new a instance first and than get the class by this instance.
        Cup cupClass=new Cup();
        Class cls = cupClass.getClass();
        System.out.println(cls);
        System.out.println(cls.getName());
        //another way to directly get the class by the pass
        try {
            Class cup1= Class.forName("cup.Cup");
            Object a =cup1.newInstance();
            System.out.println(cup1.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The name of the class is: "+ cls.getName());


        //get class name
        String className=cls.getName();
        System.out.println(className+"\n");

        //get class modifier
        int classModifiers= cls.getModifiers();
        System.out.println(Modifier.isPublic(classModifiers)+"\n");

        //get super class
        Class superClass = cls.getSuperclass();
        System.out.println(superClass.getName()+"\n");
//
//
        //get constructor may be you pass the wrong const
        Constructor constructor =cls.getConstructor();
        System.out.println("The name of the constructor: "+ constructor.getName());

        //get methods is to ge t the method in this class and the methods from the super class.
//        Method[] method = cls.getMethods();
//        for (Method method1:method){
////            if (method1.getName().contentEquals("asb"))
//            System.out.println("The name of method: "+method1.getName());
//            System.out.println("Return Type: "+method1.getReturnType());
//            Class [] parameterType =method1.getParameterTypes();
//            for (Class parameter:parameterType){
//                System.out.println("Parameter Name: "+parameter.getName());
//            }
//        }

        //get declareMethods is get the methods in this class only
        Method[] methods=cls.getDeclaredMethods();
        for (Method method1:methods){
            System.out.println("The name of method in this class is: "+method1.getName());
        }
//
        //get Filed
//        Class a = Cup.class;
//        System.out.println(a);
        Field field=cls.getDeclaredField("weight");
        System.out.println("The field name is: "+field.getName());
        field.setAccessible(true);
//        field.set(cupClass,50.0);
        System.out.println(cupClass.getWeight());
//
        Method method2=cls.getDeclaredMethod("daoShui");
        method2.invoke(cupClass);
    }


}
