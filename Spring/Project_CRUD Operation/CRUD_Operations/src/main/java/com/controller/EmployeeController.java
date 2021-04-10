package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.service.UserService;
import com.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	@RequestMapping(value="/empform",method=RequestMethod.GET)
	public String showform(Model m) {
		m.addAttribute("employee", new Employee());
		return "empform";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee) {
	    userService.save(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Employee> list = userService.getEmployees();
		m.addAttribute("list", list);
		return "viewemp";
	}
	
	@RequestMapping(value="/empedit")
	public String getEditId(Model m) {
		m.addAttribute("employee",new Employee());
	    return "empedit";
	}
	
	@RequestMapping(value="/editemp",method = RequestMethod.GET)  
    public String edit(@ModelAttribute("employee") Employee employee){ 
		int id=employee.getId();
        Employee emp = userService.getEmpById(id); 
        ModelAndView mv=new ModelAndView("empeditform");
        mv.addObject("employee",emp);
        return "empeditform";  
    }
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("employee") Employee employee){  
        userService.update(employee);
        return "redirect:/viewemp";  
    }
	
	@RequestMapping(value="/empdelete")
	public String getDeleteId(Model m) {
		m.addAttribute("employee",new Employee());
	    return "empdelete";
	}
	
	@RequestMapping(value="/deleteemp",method = RequestMethod.GET)  
    public String delete(@ModelAttribute("employee") Employee employee){
		int id=employee.getId();
        userService.delete(id);  
        return "redirect:/viewemp";  
    }
	
	@RequestMapping(value="/empselect")
	public String getSelectId(Model m) {
		m.addAttribute("employee",new Employee());
		return "empselect";
	}
	
	@RequestMapping(value="/showemp",method=RequestMethod.GET)
	public ModelAndView showEmp(@ModelAttribute("employee") Employee employee) {
		int id=employee.getId();
		Employee emp= userService.getEmpById(id);
		ModelAndView mv=new ModelAndView("showemp");
		mv.addObject("employee",emp);
		return mv;
	}
}
