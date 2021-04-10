package com.service;

import java.util.List;

import com.bean.Coupon;
import com.bean.Customer;

public interface CustomerService {
	
	List<Customer> validateCustomer(Customer customer);
    List<Coupon> validateCoupon(Coupon Coupon);
}
