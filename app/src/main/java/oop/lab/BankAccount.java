package oop.lab;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance < amount){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public abstract void calculateInterest();
}
