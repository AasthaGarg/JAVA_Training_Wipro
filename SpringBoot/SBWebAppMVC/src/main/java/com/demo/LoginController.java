package com.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String check(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
	
	@RequestMapping(value="/message",method=RequestMethod.POST)
	public ModelAndView display(@ModelAttribute("user") User user) {
		ModelAndView mv=new ModelAndView();
		String name=user.getName();
		String password=user.getPassword();
		if(password.equals("Wipro@123") && name.equals("Wipro@123")) {
			mv.addObject("name",name);
			mv.setViewName("success");
		}
		else {
			mv.setViewName("fail");
		}
		return mv;
	}

}
