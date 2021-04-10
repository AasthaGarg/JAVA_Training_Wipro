package junit.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import junit.main.Employee;

import java.util.ArrayList;
public class EmployeeTest {
	Employee e=new Employee();
	ArrayList<String> list=new ArrayList<>();
	{
		list.add("Bob");
		list.add("Alice");
		list.add("John");
	}

	@Test
	public void testFindName() {
		assertEquals("Result","FOUND",e.findName(list,"Alice"));
	}

}
