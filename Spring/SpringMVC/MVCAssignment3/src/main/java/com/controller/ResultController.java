package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Marks;

@Controller
public class ResultController {
	@RequestMapping("PreInsert")
	public ModelAndView preInsert() {
		Marks marks=new Marks();
		ModelAndView mv=new ModelAndView("CalculateMarks","marks",marks);
		return mv;
	}
	@RequestMapping("CalculateMarks")
	public ModelAndView calculate(@ModelAttribute("marks") Marks marks) {
		
		int sum=0;
		sum=marks.getEnglish()+marks.getMaths()+marks.getScience();
		ModelAndView mv=new ModelAndView("result");
		mv.addObject("sum",sum);
		return mv;
	}
}
