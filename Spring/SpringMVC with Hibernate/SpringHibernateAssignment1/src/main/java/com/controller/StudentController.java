package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;
import com.dao.StudentDAO;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("PreInsert")
	public ModelAndView preInsert() {
		Student student=new Student();
	    ModelAndView mv=new ModelAndView("InsertStudent","student",student);
	    return mv;
	}
	
	@RequestMapping("InsertStudent")
	public ModelAndView insertStudent(@ModelAttribute("student") Student student) {
		ModelAndView mv=new ModelAndView("result","student",student);
		if(dao.insertStudent(student))
			mv.addObject("msg","Inserted successfully");
		else
			mv.addObject("msg","Insertion failed");
		return mv;
	}

}
