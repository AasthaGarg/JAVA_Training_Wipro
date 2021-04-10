package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Car")
public class Car {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="regno")
	private String regno;
	@Column(name="model")
	private String model;
	@Column(name="color")
	private String color;
	@Column(name="manufacturer")
	private String manufacturer;
	private CarOwner carowner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
   
	@ManyToOne
	@JoinColumn(name="oid")
	public CarOwner getCarowner() {
		return carowner;
	}

	public void setCarowner(CarOwner carowner) {
		this.carowner = carowner;
	}
	
	

}
