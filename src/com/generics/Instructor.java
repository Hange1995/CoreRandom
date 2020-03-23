package com.generics;

public class Instructor extends User {

    public Instructor() {
        super(2);
    }

//    public Instructor(int b){
       // super(1);
//    }

    public static void main(String[] args) {
        Instructor asd = new Instructor();
        Instructor qwe = new Instructor();
        System.out.println(asd);
        System.out.println(qwe);
    }

}
