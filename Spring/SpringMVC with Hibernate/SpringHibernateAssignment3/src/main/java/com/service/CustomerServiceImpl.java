package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Coupon;
import com.bean.Customer;
import com.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao dao;
	
	public List<Customer> validateCustomer(Customer customer){
		return dao.validateCustomer(customer);
	}

	
	public List<Coupon> validateCoupon(Coupon coupon) {
		return dao.validateCoupon(coupon);
	}


}
