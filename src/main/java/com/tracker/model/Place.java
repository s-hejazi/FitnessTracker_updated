package com.tracker.model;

import org.hibernate.validator.constraints.Range;

public class Place {

	private String name;
@Range(min=1, max=10000)
	private int address;
	public Place(){
		
	}
	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
