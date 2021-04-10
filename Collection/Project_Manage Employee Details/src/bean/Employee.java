package bean;

public class Employee implements Comparable<Employee> {
	String FirstName;
	String LastName;
	long MobileNumber;
	String Email;
	String Address;
	public Employee() {
		super();
	}
	public Employee(String FirstName,String LastName,int MobileNumber,String Email,String Address) {
		super();
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.MobileNumber=MobileNumber;
		this.Email=Email;
		this.Address=Address;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public long getMobileNumber() {
		return MobileNumber;
	}
    
    public String getEmail() {
    	return Email;
    }
    
    public String getAddress() {
    	return Address;
    }
    @Override
    public String toString() {
    	return "Employee [firstName="+FirstName+", lastName="+LastName+","
    			+ " mobileNumber="+MobileNumber+", email="+Email+", address="+Address+".";
    }
	@Override
	public int compareTo(Employee emp) {
		return this.FirstName.compareTo(emp.getFirstName());
	}
   
}
