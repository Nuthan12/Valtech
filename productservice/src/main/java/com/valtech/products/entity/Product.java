package com.valtech.products.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private float cost;
	private int quantity;
	private float taxRate;
	private float tax;


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Product(String name, float cost, int quantity, float taxRate,float tax) {
		super();
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.taxRate = taxRate;
		this.tax=cost*taxRate/100;
	}



	public float getTax() {
		return tax;
	}



	public void setTax(float tax) {
		this.tax = tax;
	}



	public Product(long id, String name, float cost, int quantity, float taxRate,float tax) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.tax=cost*taxRate/100;
		this.taxRate=taxRate;
		
	}



	public float getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}

}
