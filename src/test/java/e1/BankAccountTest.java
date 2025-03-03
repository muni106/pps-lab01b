package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccount silverAccount;
    private BankAccount goldAccount;
    private BankAccount bronzeAccount;

    @BeforeEach
    void init(){
        this.silverAccount = new SilverBankAccount();
        this.goldAccount = new GoldBankAccount();
        this.bronzeAccount = new BronzeBankAccount();
    }

    @Test
    public void testInitiallyEmpty() {
        assertEquals(0, this.silverAccount.getBalance());
    }

    @Test
    public void testSilverCanDeposit() {
        this.silverAccount.deposit(1000);
        assertEquals(1000, this.silverAccount.getBalance());
    }

    @Test
    public void testSilverCanWithdraw() {
        this.silverAccount.deposit(1000);
        this.silverAccount.withdraw(200);
        assertEquals(799, this.silverAccount.getBalance());
    }

    @Test
    public void testSilverCannotWithdrawMoreThanAvailable(){
        this.silverAccount.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.silverAccount.withdraw(1200));
    }

    @Test
    public void testGoldCanDeposit() {
        this.goldAccount.deposit(1000);
        assertEquals(1000, this.goldAccount.getBalance());
    }

    @Test
    public void testGoldCanWithdraw() {
        this.goldAccount.deposit(1000);
        this.goldAccount.withdraw(200);
        assertEquals(800, this.goldAccount.getBalance());
    }

    @Test
    public void testGoldCannotWithdrawMoreThanAvailable(){
        this.goldAccount.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.goldAccount.withdraw(1200));
    }

    @Test
    public void testBronzeCanDeposit() {
        this.bronzeAccount.deposit(1000);
        assertEquals(1000, this.bronzeAccount.getBalance());
    }

    @Test
    public void testBronzeCanWithdraw() {
        this.bronzeAccount.deposit(1000);
        this.bronzeAccount.withdraw(200);
        assertEquals(799, this.bronzeAccount.getBalance());
        this.bronzeAccount.withdraw(99);
        assertEquals(700, this.bronzeAccount.getBalance());
    }

    @Test
    public void testBronzeCannotWithdrawMoreThanAvailable(){
        this.bronzeAccount.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.bronzeAccount.withdraw(1200));
    }



}
