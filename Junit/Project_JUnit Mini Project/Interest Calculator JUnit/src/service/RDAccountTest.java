package service;

import static org.junit.Assert.*;
import org.junit.Test;
import bean.RDAccount;

public class RDAccountTest {
    RDAccount rdAccount=new RDAccount();
    
    @Test
	public void testGetSetAmount() {
		rdAccount.setAmount(10000.0);
		assertEquals(10000.0,rdAccount.getAmount(),0.0);
	}
    
    @Test
	public void testGetSetInterestRate() {
		rdAccount.setInterestRate(5);
		assertEquals(5,rdAccount.getInterestRate(),0);
	}
    
    @Test
	public void testGetSetNoOfMonth() {
		rdAccount.setInterestRate(5);
		assertEquals(5,rdAccount.getInterestRate(),0);
	}
    
    @Test
	public void testGetSetMonthlyAmount() {
		rdAccount.setMonthlyAmount(500);
		assertEquals(500,rdAccount.getMonthlyAmount(),0);
	}
    
    @Test
	public void testGetSetAgeOfACHolder() {
		rdAccount.setAgeOfACHolder(65);
		assertEquals(65,rdAccount.getAgeOfACHolder());
	}
    
	@Test
	public void testCalculateInterest() {
		rdAccount.setAmount(10000.0);
		rdAccount.setNoOfMonth(6);
		rdAccount.setAgeOfACHolder(65);
		assertEquals(800.0,rdAccount.calculateInterest(),0.0);
	}

}
