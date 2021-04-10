package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car_Details")
public class Car {
	@Column(name="RegNo",length=5)
	private String regno;
	@Id
	@Column(name="Model",length=20)
	private String model;
	@Column(name="Color",length=10)
	private String color;
	@Column(name="Manufacturer",length=20)
	private String manufacturer;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String regno, String model, String color, String manufacturer) {
		super();
		this.regno = regno;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Car [regno=" + regno + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer + "]";
	}
	

}
