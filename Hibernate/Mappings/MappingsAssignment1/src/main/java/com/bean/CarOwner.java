package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Car_Owner")
public class CarOwner {
	@Id
	@Column(name="OnnerId")
	private int ownerId;
	@Column(name="OnerName")
	private String ownerName;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Car carobj;
	
	
	public CarOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarOwner(int ownerId, String ownerName, Car carobj) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.carobj = carobj;
	}

	public int getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	

	public Car getCarobj() {
		return carobj;
	}

	public void setCarobj(Car carobj) {
		this.carobj = carobj;
	}

	@Override
	public String toString() {
		return "CarOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", carobj=" + carobj + "]";
	}

	
	
	
	

}
