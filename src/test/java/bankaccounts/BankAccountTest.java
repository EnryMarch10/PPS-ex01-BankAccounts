package bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void init(){
        this.account = new BankAccount();
    }

    @Test
    void canDeposit(){
        int amount1 = 100;
        int amount2 = 20;
        this.account.deposit(amount1);
        this.account.deposit(amount2);
        assertEquals(amount1 + amount2, this.account.getBalance());
    }

    @ParameterizedTest
    @CsvSource({
            "100, 20, 80",
            "100, 80, 19"
    })
    void canWithdraw(int deposit, int withdraw, int expectedBalance){
        this.account.deposit(deposit);
        this.account.withdraw(withdraw);
        assertEquals(expectedBalance, this.account.getBalance());
    }
}