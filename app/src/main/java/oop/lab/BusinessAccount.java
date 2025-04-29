package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService{
    private String loanStatus;
    public BusinessAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public void calculateInterest(){
        double interest = getBalance() * 0.05;
        deposit(interest);
    }
    @Override
    public void applyForLoan(double amount){
        this.loanStatus = "Pending";
    }
    @Override
    public void transferFunds(double amount, String accountNumber){}
    @Override
    public void payBills(double amount){}
    @Override
    public String checkLoanStatus(){
        return loanStatus;
    }
}
