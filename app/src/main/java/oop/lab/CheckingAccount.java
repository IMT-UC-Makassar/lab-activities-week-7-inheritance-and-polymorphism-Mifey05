package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public void calculateInterest(){}
    @Override
    public void transferFunds(double amount, String accountNumber){
        System.out.println("Absolutely nothing happens here, if you're wondering.");
    }
    @Override
    public void payBills(double amount){
        withdraw(amount);
    }
}
