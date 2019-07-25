package com.revature.funfactory;

import java.io.Serializable;

public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -323392484664483038L;
	String make;
	String model;
	int year;
	String color;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", getMake()="
				+ getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}

	