package com.valtech.product.list.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private float price;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int id, float price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public Product(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	
}
