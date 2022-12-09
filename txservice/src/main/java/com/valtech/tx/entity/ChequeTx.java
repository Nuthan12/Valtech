package com.valtech.tx.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("ch")
public class ChequeTx {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long chequeNo;
	private boolean outStation;
	private double collectionCharges;

	public ChequeTx() {
		super();
	}

	public ChequeTx(long chequeNo, boolean outStation, double collectionCharges) {
		super();
		this.chequeNo = chequeNo;
		this.outStation = outStation;
		this.collectionCharges = collectionCharges;
	}

	public long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public boolean isOutStation() {
		return outStation;
	}

	public void setOutStation(boolean outStation) {
		this.outStation = outStation;
	}

	public double getCollectionCharges() {
		return collectionCharges;
	}

	public void setCollectionCharges(double collectionCharges) {
		this.collectionCharges = collectionCharges;
	}

	@Override
	public String toString() {
		return "ChequeTx [chequeNo=" + chequeNo + ", outStation=" + outStation + ", collectionCharges="
				+ collectionCharges + "]";
	}

}
