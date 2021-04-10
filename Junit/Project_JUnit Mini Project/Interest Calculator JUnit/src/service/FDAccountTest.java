package service;

import static org.junit.Assert.*;
import org.junit.Test;
import bean.FDAccount;

public class FDAccountTest {
    FDAccount fdAccount=new FDAccount();
    
    @Test
	public void testGetSetAmount() {
		fdAccount.setAmount(10000);
		assertEquals(10000,fdAccount.getAmount(),0.0);
	}
    
    @Test
	public void testGetSetInterestRate() {
		fdAccount.setInterestRate(5);
		assertEquals(5,fdAccount.getInterestRate(),0);
	}
    
    @Test
	public void testGetSetNoOfDays() {
		fdAccount.setNoOfDays(91);
		assertEquals(91,fdAccount.getNoOfDays());
	}
    
    @Test
	public void testGetSetAgeOfACHolder() {
		fdAccount.setAgeOfACHolder(65);
		assertEquals(65,fdAccount.getAgeOfACHolder());
	}
    
	@Test
	public void testCalculateInterest() {
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(65);
		assertEquals(800.0,fdAccount.calculateInterest(),0.0);
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(30);
		assertEquals(750.0,fdAccount.calculateInterest(),0.0);
	}	
}

