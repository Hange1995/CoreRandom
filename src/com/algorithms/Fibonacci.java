package com.algorithms;

public class Fibonacci {
    public int findNthFibo(int n){
        int[] array=new int[n+1];
        findNthFibo(n,array);
        return array[n-1];
    }
    private int findNthFibo(int n, int[] array){
        if (array[n]!=0) return array[n];
        if (n==0) return 1;
        if (n==1) return 2;
        array[n]=findNthFibo(n-1,array)+findNthFibo(n-2,array);
        return array[n];
    }
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println("The Nth Number of this Fibonacci array is: "+fibonacci.findNthFibo(20));
    }
}
