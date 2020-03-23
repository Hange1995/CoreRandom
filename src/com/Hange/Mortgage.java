package com.Hange;

import MortgageCalculate.MortgageReport;
import MortgageCalculate.ReadName;

public class Mortgage {

        public static void main(String[] args) {

//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please Entre Your Intial Amount (Between $1-$100000000):");
//            int amount = Integer.parseInt(scanner.nextLine().trim());
//            while ((amount<1 || amount>100000000)){
//                System.out.print("Please Entre Your Intial Amount (Between $1-$100000000):");
//                amount = Integer.parseInt(scanner.nextLine().trim());
//            }
//            System.out.print("Please Entre Your Annual rate(1-100):");
//            double annualrate = Double.parseDouble(scanner.nextLine().trim());
//            while ((annualrate<1 || annualrate>100)) {
//                System.out.print("Please Entre Your Annual rate(1-100):");
//                annualrate = Double.parseDouble(scanner.nextLine().trim());
//            }
//            System.out.print("Please Entre Your Periods(Years 1-30):");
//            double periods = Double.parseDouble(scanner.nextLine().trim());
//            while((periods<1 || periods>30)) {
//                System.out.print("Please Entre Your Annual Periods(1-30):");
//                periods = Double.parseDouble(scanner.nextLine().trim());
//            };



//            System.out.print("Please Entre Your Intial Amount (Between $1-$100000000):");
//            amount = Double.parseDouble(scanner.nextLine().trim());
//            do {
//                System.out.print("Please Entre Your Intial Amount (Between $1-$100000000):");
//                amount = Double.parseDouble(scanner.nextLine().trim());
//            }while (amount<1 || amount>100000000);
//            System.out.print("Please Entre Your Annual rate(1-100):");
//            annualrate = Double.parseDouble(scanner.nextLine().trim());
//            do  {
//                System.out.print("Please Entre Your Annual rate(1-100):");
//                annualrate = Double.parseDouble(scanner.nextLine().trim());
//            }while (annualrate<1 || annualrate>100);
//            System.out.print("Please Entre Your Periods(Years 1-30):");
//            do {
//                System.out.print("Please Entre Your Annual Periods(1-30):");
//                periods = Double.parseDouble(scanner.nextLine().trim());
//            }while (periods<1 || periods>30);
            int amount = (int) ReadName.readNumber("amount",100,10000000);
            double annualrate = ReadName.readNumber("amount",1,100);
            int periods = (int) ReadName.readNumber("periods",1,30);
        }

}
