package oop.lab;

public interface OnlineService {
    abstract void transferFunds(double amount, String accountNumber);
    abstract void payBills(double amount);
}
