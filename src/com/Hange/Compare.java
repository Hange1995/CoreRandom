package com.Hange;

public class Compare {
    private int a;
    private int b;

    public void print(int a, int b){

        System.out.println(a + b);
    }

    public void compartion(int a, int b){
        if(a == b){
            System.out.println("a is equal to b");
        }
        else if(a > b){
            System.out.printf("a is bigger than b");
        }else
            System.out.println("a is smaller than b");
    }

    public static void main(String[] args) {
        Compare xiong = new Compare();
//        compare.a = 10;
//        compare.b = 20;
        xiong.compartion(10, 20);
        xiong.print(20,50);
        Compare ryo = new Compare();
        ryo.compartion(30,50);
    }
}
