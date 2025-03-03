package e1;

abstract class CoreBankAccount implements BankAccount {

    private int balance = 0;
    protected int fee;
    protected int maxCredit;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        if (this.balance - amount - fee < 0) {
            throw new IllegalStateException();
        } else {
            this.balance = this.balance - amount - fee;
        }
    }
}
