package es.iessoterohernandes.es.Boletin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SutilAccountTest {
// el cambio es añadir más decimales a los números
	
	private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("Maria Perez", 123456789, 1000.000f);
    }

    @Test
    public void testDeposit() {
        assertTrue(account.deposit(500.000f));
        assertEquals(1500.0f, account.getBalance(), 0.001f);
    }

    @Test
    public void testWithdraw() {
        assertTrue(account.withdraw(200.000f, 0.500f));
        assertEquals(799.5f, account.getBalance(), 0.010f);
    }

    @Test
    public void testWithdrawInvalidAmount() {
        assertFalse(account.withdraw(-200.000f, 0.500f));
        assertEquals(1000.00f, account.getBalance(), 0.010f);
    }

    @Test
    public void testWithdrawInvalidFee() {
        assertFalse(account.withdraw(200.000f, -0.500f));
        assertEquals(1000.00f, account.getBalance(), 0.010f);
    }

    @Test
    public void testWithdrawExceedBalance() {
        assertFalse(account.withdraw(2000.000f, 0.500f));
        assertEquals(1000.000f, account.getBalance(), 0.010f);
    }

    @Test
    public void testAddInterest() {
        account.addInterest();
        assertEquals(1045.000f, account.getBalance(), 0.010f);
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.000f, account.getBalance(), 0.001f);
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals(123456789, account.getAccountNumber());
    }

    @Test
    public void testToString() {
        assertEquals("123456789\tJohn Doe\t$1,000.000", account.toString());
    }
}
