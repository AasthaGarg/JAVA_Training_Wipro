package junit.test;

import junit.main.Demo1;
import static org.junit.Assert.*;
import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 d=new Demo1();
		assertEquals("HelloWorld",d.stringConcat("Hello","World"));
	
	}

}
