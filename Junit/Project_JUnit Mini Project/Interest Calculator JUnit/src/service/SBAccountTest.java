package service;

import static org.junit.Assert.*;
import org.junit.Test;
import bean.SBAccount;

public class SBAccountTest {
    SBAccount sbAccount=new SBAccount();
    
    @Test
	public void testSetAmount() {
		sbAccount.setAmount(10000);
		assertEquals(10000.0,sbAccount.getAmount(),0);
	}
    
    @Test
	public void testGetSetInterest() {
		sbAccount.setInterestRate(5);
		assertEquals(5,sbAccount.getInterestRate(),0);
	}
    
	@Test
	public void testCalculateInterest() {
		sbAccount.setAmount(10000);
		assertEquals(400.0,sbAccount.calculateInterest(),0);
	}

	

}
