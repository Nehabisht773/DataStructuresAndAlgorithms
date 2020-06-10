package com.Oracle;

public class Box {
	private float weight;
	private String address;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Box(float weight, String address) {
		super();
		this.weight=weight;
		this.address=address;
		
	}
}
