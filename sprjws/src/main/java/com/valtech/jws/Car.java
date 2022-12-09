package com.valtech.jws;

public class Car {
	private int id ;
	private String make;
	private String model;
	private int yearMfg;
	private float price;
	private String colour;
	
	public Car() {}
	
	public Car(int id, String make, String model, int yearMfg, float price, String colour) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearMfg = yearMfg;
		this.price = price;
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getYearManufactured() {
		return yearMfg;
	}

	public void setYearManufactured(int yearMfg) {
		this.yearMfg = yearMfg;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}	
}
