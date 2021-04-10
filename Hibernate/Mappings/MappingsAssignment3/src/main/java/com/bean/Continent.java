package com.bean;

import java.util.Map;


public class Continent {
	private int id;
	
	private String cname;
	private Map<String, String> countries;
		
	public Continent() {
	}
	
	
	
	public Continent(int id, String cname, Map<String, String> countries) {
		super();
		this.id = id;
		this.cname = cname;
		this.countries = countries;
	}



	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map getCountries() {
		return countries;
	}
	public void setCountries(Map countries) {
		this.countries = countries;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	@Override
	public String toString() {
		return "Continent [cname=" + cname + ", countries=" + countries + "]";
	}
	
	

}
