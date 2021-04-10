package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Coupon;
import com.bean.Customer;
import com.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("customer", new Customer());
	    return mav;
	  }
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("customer") Customer customer) {
	    ModelAndView mav = null;
	    List<Customer> list = customerService.validateCustomer(customer);
	    if (null != list) {
	    mav = new ModelAndView("success");
	    mav.addObject("coupon", new Coupon());
	    mav.addObject("list", list);
	    } else {
	    mav = new ModelAndView("login");
	    }
	    return mav;
	  }

}