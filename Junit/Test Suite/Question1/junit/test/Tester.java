package junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.main.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Demo1.class,
	Employee.class,
	Demo2.class
})

public class Tester {
	

}
