package com.dao;

import java.util.List;

import com.bean.Coupon;
import com.bean.Customer;

public interface CustomerDao {
	
	List<Customer> validateCustomer(Customer customer);
    List<Coupon> validateCoupon(Coupon coupon);
}
