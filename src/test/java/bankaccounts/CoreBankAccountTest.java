package bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class CoreBankAccountTest {
    protected CoreBankAccount account;

    @Test
    void canDeposit() {
        int amount1 = 100;
        int amount2 = 20;
        this.account.deposit(amount1);
        this.account.deposit(amount2);
        assertEquals(amount1 + amount2, this.account.getBalance());
    }


}
