package com.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {


        Class myClass= MyReflectionClass.class;
        Annotation annotation=myClass.getAnnotation(MyInterface.class);
        if (annotation instanceof MyInterface){
            MyInterface myAnnoation = (MyInterface) annotation;
            System.out.println("name: "+myAnnoation.name());
            System.out.println("value: "+myAnnoation.value());
        }


        Class myMethodClass = MyMethodReflectionClass.class;
        //obtain method object
        Method method = myMethodClass.getDeclaredMethod("doSomething");
        Annotation annotation1 = method.getAnnotation(MyMethodReflectionInterface.class);
            if(annotation1 instanceof MyMethodReflectionInterface){
                MyMethodReflectionInterface myAnnotation = (MyMethodReflectionInterface) annotation1;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());

        }


        Class myParaClass=MyParaReflectionClass.class;
        Method methodParam=myParaClass.getDeclaredMethod("doSomethingElse", String.class);
        Annotation[][] annotation2=methodParam.getParameterAnnotations();
        Class[] parameterTypes=methodParam.getParameterTypes();
        int i=0;
        for (Annotation[] annotations:annotation2){
            Class parameterType=parameterTypes[i++];
            for (Annotation annotation3:annotations){
                if (annotation3 instanceof MyParaInterface){
                    MyParaInterface myParaInterface= (MyParaInterface) annotation3;
                    System.out.println("param: "+parameterType.getName());
                    System.out.println("name: "+myParaInterface.name());
                    System.out.println("value: "+myParaInterface.value());

                }
            }
        }
    }
}
