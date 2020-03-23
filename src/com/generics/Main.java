package com.generics;

public class Main {
    public static void main(String[] args) {
        User max = Utilis.max(new User(10),new User(20));
        System.out.println(max);

    }
}
