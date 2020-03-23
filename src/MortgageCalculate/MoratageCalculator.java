package MortgageCalculate;

public class MoratageCalculator {
    private int amount;
    private double annaulrate;
    private int periods;
    private int numberOfPaymentMade;

    public MoratageCalculator(int amount, double annaulrate, int periods, int numberOfPaymentMade) {
        this.amount = amount;
        this.annaulrate = annaulrate;
        this.periods = periods;
        this.numberOfPaymentMade= numberOfPaymentMade;
    }

    public double mortgageCalculator (){
        double monthlyrate = annaulrate/1200;
                double motgage = amount*(monthlyrate*Math.pow(1+monthlyrate,periods*12)/(Math.pow(1+monthlyrate,periods*12)-1));
                return motgage;
    }
    public double balanceCalculator(int numberOfPaymentMade){
        double monthlyrate = annaulrate/1200;
        double balance = amount*(-Math.pow(1+monthlyrate,numberOfPaymentMade)+Math.pow(1+monthlyrate,(periods*12)-1))/
                (Math.pow(1+monthlyrate,(periods*12)-1)-1);
        return balance;
    }
//    public double [] getRemainingBalances(){
////        var balances = new double[getNumberOfPaymentMade()];
////        for(int month =numberOfPaymentMade; month <=balances.length;month++) {
////            balances[month-1] = balanceCalculator(month);
////        }   return balances;


    public int getPeriods() {
        return periods;
    }
    public int getNumberOfPaymentMade() {
        return numberOfPaymentMade;
    }
}
