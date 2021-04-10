package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bean.Coupon;
import com.bean.Customer;
import com.dao.CustomerMapper;

public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    public List<Customer> validateCustomer(Customer customer) {
		
		String sql = "select * from customer where customerid='" + customer.getCustomerid() + "' and password='" + customer.getPassword() + "'";
		
		List<Customer> c = jdbcTemplate.query(sql, new CustomerMapper());
		return c;
	}
    
    public List<Coupon> validateCoupon(Coupon coupon) {
		
		String sql = "select * from coupon where couponcode='" + coupon.getCouponcode()+ "'";
		
		List<Coupon> co= jdbcTemplate.query(sql, new CouponMapper());
		return co;
	}
    

}
class CustomerMapper implements RowMapper<Customer> {
	
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Customer c=new Customer();
		
		c.setCustomerid(rs.getString("customerid"));
		c.setPassword(rs.getString("password"));
		c.setBalance(rs.getInt("balance"));
		
		return c;
	}

}

class CouponMapper implements RowMapper<Coupon> {
	
	public Coupon mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Coupon co=new Coupon();
		
		co.setCouponcode(rs.getString("couponcode"));
		co.setOfferpercentage(rs.getInt("offerpercentage"));
		
		return co;
	}

}
