/* i) Create the following class and implement the method to check whether the given string is a palindrome and return the result.

Class Name : Demo2
Method : palindromeCheck(String):boolean

(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.*/
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 demo2=new Demo2();
		assertEquals(true,demo2.palindromeCheck("madam"));
	}

}
