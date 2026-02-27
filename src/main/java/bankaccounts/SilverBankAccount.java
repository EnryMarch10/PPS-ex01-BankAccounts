package bankaccounts;

public class SilverBankAccount extends CoreBankAccount {

    @Override
    protected int feeCalculation(int amount) {
        return 1;
    }

}
