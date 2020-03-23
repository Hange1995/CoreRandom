package com.Hange;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Entry Your Value:");
        int a = scanner.nextInt();
        if (a % 3 == 0) {
            if (a % 5 == 0)
                System.out.println("FezzBuzz");
            else
                System.out.println("Fezz");
        } else if (a % 5 != 0)
            System.out.println("Buzz");
        else
            System.out.println(a);
    }

}


