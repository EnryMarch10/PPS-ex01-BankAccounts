package bankaccounts;

public class BankAccount {

    private int balance;
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount - feeCalculation(amount);
    }

    private int feeCalculation(int amount) {
        return amount > 50 ? 1 : 0;
    }

    public int getBalance() {
        return this.balance;
    }
}
