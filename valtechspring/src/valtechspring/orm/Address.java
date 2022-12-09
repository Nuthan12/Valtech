package valtechspring.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String street;
	private String city;
	private String state;
	private int zipCode;
	@OneToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id",referencedColumnName="id")   //name - primary key column on the child,refCalName- PK column on the master..
	private Customer customer;
	
	public Address(){}
	
	
	
	
	



	public Address(String street, String city, String state, int zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}


	public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	
	
	
}
