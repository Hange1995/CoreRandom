package com.data;

import com.util.FamilyCar;

public class Factorial {
    public int factorial(int x){
        if (x<=1) return 1;
        return x*factorial(x-1);
    }


    public static void main(String[] args) {
        Factorial factorial= new Factorial();
        System.out.println(factorial.factorial(5));
    }
}
