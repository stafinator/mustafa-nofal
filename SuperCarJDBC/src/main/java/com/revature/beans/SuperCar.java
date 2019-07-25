package com.revature.beans;

public class SuperCar {
	private int carID;
	private String carName;
	public SuperCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperCar(int carID, String carName) {
		super();
		this.carID = carID;
		this.carName = carName;
	}
	public int getHeroID() {
		return carID;
	}
	public void setHeroID(int carID) {
		this.carID = carID;
	}
	public String getHeroName() {
		return carName;
	}
	public void setHeroName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "SuperHero [carID=" + carID + ", carName=" + carName + "]";
	}
	
}