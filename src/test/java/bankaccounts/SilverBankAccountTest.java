package bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SilverBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new SilverBankAccount();
    }

    @ParameterizedTest
    @CsvSource({
            "100, 20, 79",
            "100, 80, 19"
    })
    void canWithdraw(int deposit, int withdraw, int expectedBalance){
        this.account.deposit(deposit);
        this.account.withdraw(withdraw);
        assertEquals(expectedBalance, this.account.getBalance());
    }
}