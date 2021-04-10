package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return dao.findAll();
	}
	
	@GetMapping("/getEmployee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable("eid") Integer eid){
		return dao.findById(eid);
	}
	
	@PostMapping("/createEmployee")
	public Employee createEmployee(Employee emp) {
		return dao.save(emp);
	}
	
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(Employee emp) {
    	return dao.save(emp);
    }
    
    @DeleteMapping("/deleteEmployee/{eid}")
    public void deleteEmployee(@PathVariable("eid") Integer eid) {
    	dao.deleteById(eid);
    }
}
