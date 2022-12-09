package com.valtech.Tx.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class TransferTx extends Tx{

	private int fromAccountId;
	private int toAccountId;
	
	
	
	@Override
	public String toString() {
		return "TransferTx [fromAccountId=" + fromAccountId + ", toAccountId=" + toAccountId + "]";
	}
	public int getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(int fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public int getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(int toAccountId) {
		this.toAccountId = toAccountId;
	}
	public TransferTx(float amount, boolean debit, LocalDate txTime, long accountId, int fromAccountId,
			int toAccountId) {
		super(amount, debit, txTime, accountId);
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
	}
	public TransferTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferTx(float amount, boolean debit, LocalDate txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	public TransferTx(long id, float amount, boolean debit, LocalDate txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	
	
}
