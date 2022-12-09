package com.valtech.Tx.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class AtmTx extends Tx{

	private int atmNum;
	private String location;
	
	
	
	@Override
	public String toString() {
		return "AtmTx [atmNum=" + atmNum + ", location=" + location + "]";
	}
	public AtmTx(float amount, boolean debit, LocalDate txTime, long accountId, int atmNum, String location) {
		super(amount, debit, txTime, accountId);
		this.atmNum = atmNum;
		this.location = location;
	}
	public AtmTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AtmTx(float amount, boolean debit, LocalDate txTime, long accountId) {
		super(amount, debit, txTime, accountId);
	}
	public AtmTx(long id, float amount, boolean debit, LocalDate txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
	}
	public int getAtmNum() {
		return atmNum;
	}
	public void setAtmNum(int atmNum) {
		this.atmNum = atmNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
