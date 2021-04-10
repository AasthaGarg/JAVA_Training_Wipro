package com.dao;

import java.util.List;

import com.model.Employee;
import com.model.Login;
import com.model.User;

public interface UserDao {
	
    int register(User user);
	User validateUser(Login login);
	int save(Employee emp);
    List<Employee> getEmployees();
    Employee getEmpById(int id);
    int update(Employee emp);
    int delete(int id);
}
