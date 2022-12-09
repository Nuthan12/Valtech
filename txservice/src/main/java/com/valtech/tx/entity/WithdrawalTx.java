package com.valtech.tx.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Wi")
public class WithdrawalTx {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String location;
	
	
	
	
	public WithdrawalTx(String location, long id) {
		super();
		this.location = location;
		this.id = id;
	}
	public WithdrawalTx(String location) {
		super();
		this.location = location;
	}
	public WithdrawalTx() {
		super();
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "WithdrawalTx [location=" + location + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
}
