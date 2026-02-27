package bankaccounts;

public abstract class CoreBankAccount {
    private int balance;

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount - feeCalculation(amount);
    }

    protected abstract int feeCalculation(int amount);

    public int getBalance() {
        return this.balance;
    }
}
