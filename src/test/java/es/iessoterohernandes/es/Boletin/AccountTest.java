package es.iessoterohernandes.es.Boletin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("Maria Perez", 123456789, 1000.0f);
    }

    @Test
    public void testDeposit() {
        assertTrue(account.deposit(500.0f));
        assertEquals(1500.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testWithdraw() {
        assertTrue(account.withdraw(200.0f, 0.5f));
        assertEquals(799.5f, account.getBalance(), 0.01f);
    }

    @Test
    public void testWithdrawInvalidAmount() {
        assertFalse(account.withdraw(-200.0f, 0.5f));
        assertEquals(1000.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testWithdrawInvalidFee() {
        assertFalse(account.withdraw(200.0f, -0.5f));
        assertEquals(1000.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testWithdrawExceedBalance() {
        assertFalse(account.withdraw(2000.0f, 0.5f));
        assertEquals(1000.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testAddInterest() {
        account.addInterest();
        assertEquals(1045.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.0f, account.getBalance(), 0.01f);
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals(123456789, account.getAccountNumber());
    }

    @Test
    public void testToString() {
        assertEquals("123456789\tMaria Perez\t$1,000.00", account.toString());
    }
}
