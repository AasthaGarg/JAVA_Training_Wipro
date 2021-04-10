package junit.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import junit.main.Demo2;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		
		Demo2 demo2=new Demo2();
		assertEquals(true,demo2.palindromeCheck("madam"));
	}

}

