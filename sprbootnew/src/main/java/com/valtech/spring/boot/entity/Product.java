package com.valtech.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String model;
	private String make;
	private int yearManufactured;
	private int kms;
	private float price;
	private String color;
	
	
	public Product() {
		
	}
	
	
	
	public Product(String name, String model, String make, int yearManufactured, int kms, float price, String color) {
		super();
		this.name = name;
		this.model = model;
		this.make = make;
		this.yearManufactured = yearManufactured;
		this.kms = kms;
		this.price = price;
		this.color = color;
	}
	
	


	public Product(int id, String name, String model, String make, int yearManufactured, int kms, float price,
			String color) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.make = make;
		this.yearManufactured = yearManufactured;
		this.kms = kms;
		this.price = price;
		this.color = color;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}
	
	
	
	
	
	
}
