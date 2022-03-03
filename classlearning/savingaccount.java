package classlearning;

public class savingaccount {
    private int CustomerId;
    private String customerName;
    private static String bankname = "TD Name";
    private double balance;
    private static String currencySymbol = "$";
    private static double tax = 0.85;
    private static double morgadeTax = 0.5;
    private static final double FEES = 100;
    private double interestrate = 0.10;

    // two construtcors
    public savingaccount(int customerId, String customerName, double balance){
        this.CustomerId = customerId;
        this.customerName = customerName;
        this.balance = balance;
    }
    public savingaccount(){

    }

    //methods
    public double getBalance() {
        return balance;
    }
    public void setDeposite(double amount){
        this.balance = this.balance + amount;
    }
    public void setwithDraw(double amount){
        this.balance = this.balance - amount;
    }
    public double caulateInterest()
    {
        double intRate = this.balance * this.interestrate;
        return intRate;
    }
}
