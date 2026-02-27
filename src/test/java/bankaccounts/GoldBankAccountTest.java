package bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new GoldBankAccount();
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