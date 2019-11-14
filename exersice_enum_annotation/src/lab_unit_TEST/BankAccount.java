package lab_unit_TEST;

public class BankAccount {
    private double balance;


    public BankAccount() {
    }
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be higher than zero");
        }
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be higher than zero");
        }
        this.balance += amount;
    }
}
