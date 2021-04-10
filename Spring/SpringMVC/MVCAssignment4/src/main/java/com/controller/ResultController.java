package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	@RequestMapping("/Movies")
	public ModelAndView movies() {
		List<String> list=getList();
		ModelAndView mv=new ModelAndView("result");
		mv.addObject("lists",list);
		return mv;
	}
	private List<String> getList(){
		List<String> list =new ArrayList<String>();
		list.add("King Kong");
		list.add("Star Wars");
		list.add("Spider-Man:Far From Home");
		list.add("Black Panther");
		list.add("Wonder Woman");
		list.add("Coco");
		list.add("Logan");
		list.add("Captain America");
		list.add("Incredible 2");
		list.add("Zootopia");
		return list;
	}


}
