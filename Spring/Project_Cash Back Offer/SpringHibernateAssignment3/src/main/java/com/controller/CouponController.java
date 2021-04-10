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
public class CouponController {
	
	@Autowired
	CustomerService customerService;
	
	  @RequestMapping(value = "/congratulations", method = RequestMethod.POST)
	  public ModelAndView couponProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("coupon") Coupon coupon) {
	    ModelAndView mav = null;
	    List<Coupon> list = customerService.validateCoupon(coupon);
	    if (null != list) {
	    mav = new ModelAndView("congratulations");
	    mav.addObject("coupon",new Coupon());
	    mav.addObject("customer",new Customer());
	    mav.addObject("list", list);
	    } else {
	    mav = new ModelAndView("success");
	    }
	    return mav;
	  }

}
