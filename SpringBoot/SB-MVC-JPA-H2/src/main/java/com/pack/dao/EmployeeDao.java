package com.pack.dao;

import org.springframework.data.repository.CrudRepository;
import com.pack.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
