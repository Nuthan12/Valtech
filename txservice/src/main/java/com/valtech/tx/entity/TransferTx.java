package com.valtech.tx.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@DiscriminatorValue("Tr")
public class TransferTx {
	
	@Id
	private int fromAccount;
	private int toAccount;
	
	
	
	public TransferTx() {
		super();
	}
	public TransferTx(int fromAccount, int toAccount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	
	
	
}
