package MortgageCalculate;

import java.util.Scanner;
public class ReadName {
    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String name){
        return scanner.nextDouble();
    }
    public static double readNumber(String name, int min, int max){
            System.out.print("Please Entre Your " + name+ " from "+min +" to "+ max);
            double amount = Double.parseDouble(scanner.nextLine().trim());
            while ((amount<min || amount>max)){
                System.out.print("Please Entre Your " + name+ " from "+min +" to "+ max);
                amount = Double.parseDouble(scanner.nextLine().trim());
            }
            return amount;
    }
}
