package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDao;
import com.model.Employee;
import com.model.Login;
import com.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;
	
	public int register(User user) {
		return userDao.register(user);
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public int save(Employee emp) {
		return userDao.save(emp);
	}

	public List<Employee> getEmployees() {
		return userDao.getEmployees();
	}

	public Employee getEmpById(int id) {
		return userDao.getEmpById(id);
	}

	public int update(Employee emp) {
		return userDao.update(emp);
	}

	public int delete(int id) {
		return userDao.delete(id);
	}
}
