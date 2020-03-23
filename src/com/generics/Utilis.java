package com.generics;

public class Utilis {
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second)<0)?second :first;
    }
    public static <K,V> void print(K a, V b){
        System.out.println(a+ "="+b);
    }
}
