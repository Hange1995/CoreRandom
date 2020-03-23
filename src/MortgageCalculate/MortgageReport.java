package MortgageCalculate;

import java.text.NumberFormat;

public class MortgageReport {

    private MoratageCalculator moratageCalculator;

    public MortgageReport(MoratageCalculator moratageCalculator) {
        this.moratageCalculator = moratageCalculator;
    }


    public void printBalance() {
        System.out.println("--------------------------");
        System.out.println("Your Mortgage Balance List");
        System.out.println("--------------------------");
        int month = moratageCalculator.getNumberOfPaymentMade();
        for(; month<= moratageCalculator.getPeriods()*12; month++) {
            double balance = moratageCalculator.balanceCalculator(month);
            System.out.println("The balance of "+month+" month is "+balance);
        }

    }

    public void printMortgage(){
        double mortgage = moratageCalculator.mortgageCalculator();
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("------------------------------------");
        System.out.println("Your Mortgage is "+mortgageFormated);
        System.out.println("------------------------------------");
    }
}
