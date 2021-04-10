package com.service;

import com.DAO.EmployeeDAO;
import com.bean.Address;
import com.bean.Employee;

public class EmployeeService {
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("Gajraula");
		address.setStreet("Nehru Park");
		address.setZipcode("244234");
		Employee emp=new Employee();
		emp.setName("Hardik");
		emp.setAddress(address);
		EmployeeDAO dao=new EmployeeDAO();
		System.out.println("Result: "+dao.insertDetails(emp));
	}

}
