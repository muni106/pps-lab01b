package e1;

public interface BankAccount {
    /**
     * get the balance
     *
     * @return balnce
     */
    int getBalance();

    /**
     * deposit a certain amount of money
     *
     */
    void deposit(int amount);

    /**
     * withdraw a certain amount of money
     *
     */
    void withdraw(int amount);
}
