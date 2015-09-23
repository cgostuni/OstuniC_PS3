
import static org.junit.Assert.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	Account a;
	
	@Before
	public void setUp() throws Exception {
		a = new Account(1122, 20000);
		double b = .045/12;
		a.setAnnualInterestRate(b);
		a.getDateCreated();
		System.out.println("The balance in the account is $" + a.getBalance());
		System.out.println("The monthly interest rate is "+ (a.getAnnualInterestRate() * 100) + "%");
		System.out.println("The account was created on " + a.getDateCreated());		
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testDepositWithdraw() throws InsufficientFundsException {
		a.Deposit(3000);
		assertEquals((long)a.getBalance(),(long)23000.00);
		a.Withdraw(25000);
		assertEquals((long)a.getBalance(),(long)-2000.0);
		
	}
	
	@Test
	public final void testDeposit() {
		a.Deposit(3000);
	}
	
	@Test
	public final void testWithdraw() throws InsufficientFundsException{
		a.Withdraw(2500);
	}
	
	
	
	
	/**
	*@BeforeClass
	*public static void setUpBeforeClass() throws Exception {
	*}
*
	*@AfterClass
	*public static void tearDownAfterClass() throws Exception {
	*}
	
	
	fail("Not yet implemented");
*/		
}

