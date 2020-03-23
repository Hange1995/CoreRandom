package MortgageCalculate;

public class Main {
    public static void main(String[] args) {
        int amount = (int) ReadName.readNumber("amount",100,10000000);
        double annualrate = ReadName.readNumber("amount",1,100);
        int periods = (int) ReadName.readNumber("periods",1,30);
        int numberOfPaymentMade = (int) ReadName.readNumber("numberOfPaymentMade",1,360);
//        var calculator = new MoratageCalculator(amount,annualrate,periods,numberOfPaymentMade);
//        var report = new MortgageReport(calculator);
//        report.printBalance();
//        report.printMortgage();
//        calculator.mortgageCalculator();
//        calculator.balanceCalculator(numberOfPaymentMade);


    }
}
