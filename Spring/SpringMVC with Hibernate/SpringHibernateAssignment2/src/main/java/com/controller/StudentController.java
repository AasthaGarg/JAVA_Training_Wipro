package com.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;
import com.dao.StudentDAO;

@Controller
public class StudentController {

	@Autowired
	StudentDAO dao;
	
	
	@RequestMapping("/viewstud")
	public ModelAndView viewstud(ModelAndView m) throws IOException {
		List<Student> list = dao.displayStudent();
		m.addObject("list", list);
		return m;
	}
	
}
	
	



