package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService{
    public SavingsAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public void calculateInterest(){
        double interest = getBalance() * 0.01;
        deposit(interest);
    }
    @Override
    public void transferFunds(double amount, String an){
        this.withdraw(amount);
    }
    @Override
    public void payBills(double amount){
        withdraw(amount);
    }
}
