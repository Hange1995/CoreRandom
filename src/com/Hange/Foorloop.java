package com.Hange;

import java.util.Scanner;

public class Foorloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  input   = "";
        int i = 0;
//        while (!input.equals("quit")){
//            System.out.println("Please Entry:");
//            input = scanner.next().toLowerCase();
//            i++;
//
//
//        }
//        System.out.println(i);

        do {
            System.out.println("Please Entry:");
            input = scanner.next().toLowerCase();
            i++;
        }while (!input.equals("quit"));
    }
}
