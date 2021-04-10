import java.util.Optional;

class InvalidEmployeeException extends Exception{
	InvalidEmployeeException(){
		super();
	}
}
public class Employee {
	public static void main(String[] args) throws InvalidEmployeeException {
		Employee obj = null;
		Optional<Employee> n=Optional.ofNullable(obj);
		System.out.println(n.orElseThrow(InvalidEmployeeException::new));
		
	}

}
