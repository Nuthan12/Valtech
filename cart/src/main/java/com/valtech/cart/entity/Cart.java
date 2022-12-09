package com.valtech.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartId;
	private String name;
	private double price;
	private double tax;
	private int quantity;
	private boolean checkedOut;

	

	public Cart(long id, String name, double price, double tax, int quantity, boolean checkedOut) {
		super();
		this.cartId = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.quantity = quantity;
		this.checkedOut = checkedOut;
	}
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(String name, double price, double tax, int quantity, boolean checkedOut) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.quantity = quantity;
		this.checkedOut = checkedOut;
	}


	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public long getId() {
		return cartId;
	}

	public void setId(long id) {
		this.cartId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [id=" + cartId + ", name=" + name + ", price=" + price + ", tax=" + tax + ", quantity=" + quantity
				+ "]";
	}
	
	

}
