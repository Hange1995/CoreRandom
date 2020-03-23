package com.lambda;

import java.sql.SQLOutput;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show() {
//        greet((message -> {
//            System.out.println(message);
//        }));
//        ;
//    }
//    }
        Supplier<Double> getRandom= ()-> Math.random();
        Double random = getRandom.get();
        System.out.println(random);


        greet(System.out::print);
        Printer printer = message -> System.out.println(message);
        printer.print("hello world");
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
    }


        public static void greet(Printer printer){
            printer.print("hello world");

        }
    }
