package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/AddEmployee")
	public String showAddForm() {
		return "AddEmp";
	}
	
	@RequestMapping("/SaveEmployee")
	public String addEmployee(Employee emp) {
		dao.save(emp);
		return "redirect:/ShowAll";
	}
	
	@RequestMapping("/DeleteById")
    public String showDeleteForm() {
		return "DeleteById";
	}
	
	@RequestMapping("/DeleteEmployee")
	public String deleteEmployee(Employee emp){
		dao.deleteById(emp.getEid());
		return "redirect:/ShowAll";
	}

	@RequestMapping("/EditById")
	public String showEditForm() {
		return "EditById";
	}
	
	@RequestMapping("/EditEmployee")
	public String editEmployee(Employee e){
		Employee emp=dao.findById(e.getEid()).get();
		ModelAndView mv=new ModelAndView("EditEmp");
		mv.addObject("employee",emp);
		return "EditEmp";
	}
 
	@RequestMapping("/ShowById")
	public String showDisplayForm() {
		return "ShowById";
	}
	
	@RequestMapping("/ShowByIdEmployee")
	public ModelAndView showByIdEmployee(Employee e) {
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.findById(e.getEid()).get();
		mv.addObject("emp",emp);
		mv.setViewName("Show");
		return mv;
	}
	
	@RequestMapping("/ShowAll")
	public ModelAndView showEmployee() {
		ModelAndView mv=new ModelAndView();
		List<Employee> list=(List<Employee>) dao.findAll();
		mv.addObject("list",list);
		mv.setViewName("ShowAll");
		return mv;
	}
	
}
