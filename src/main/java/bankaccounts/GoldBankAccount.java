package bankaccounts;

public class GoldBankAccount extends CoreBankAccount {

    @Override
    protected int feeCalculation(int amount) {
        return amount > 50 ? 1 : 0;
    }

}
