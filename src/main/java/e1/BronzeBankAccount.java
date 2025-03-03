package e1;

public class BronzeBankAccount extends CoreBankAccount {
    BronzeBankAccount() {
        this.maxCredit = 0;
    }

    @Override
    public void withdraw(int amount){
        if (amount < 100) {
            this.fee = 0;
        } else {
            this.fee = 1;
        }
        super.withdraw(amount);
    }
}
