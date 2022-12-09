package com.valtech.Tx.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class ChequeTx extends Tx {

	private int chequeNum;
	private boolean outStation;
	private float collectionCharges;
	
	
	
	
	@Override
	public String toString() {
		return "ChequeTx [chequeNum=" + chequeNum + ", outStation=" + outStation + ", collectionCharges="
				+ collectionCharges + "]";
	}
	public int getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(int chequeNum) {
		this.chequeNum = chequeNum;
	}
	public boolean isOutStation() {
		return outStation;
	}
	public void setOutStation(boolean outStation) {
		this.outStation = outStation;
	}
	public float getCollectionCharges() {
		return collectionCharges;
	}
	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}
	public ChequeTx(float amount, boolean debit, LocalDate txTime, long accountId, int chequeNum, boolean outStation,
			float collectionCharges) {
		super(amount, debit, txTime, accountId);
		this.chequeNum = chequeNum;
		this.outStation = outStation;
		this.collectionCharges = collectionCharges;
	}
	public ChequeTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(float amount, boolean debit, LocalDate txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(long id, float amount, boolean debit, LocalDate txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
