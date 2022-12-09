package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="AllTransactions")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("Tx")
public class Tx {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private float amount;
	private boolean debit;
	private LocalDateTime txTime;
	private long accountId;

	public Tx() {
		super();
	}

	public Tx(float amount, boolean debit, long accountId) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.txTime = LocalDateTime.now();
		this.accountId = accountId;
	}

	public Tx(long id, float amount, boolean debit, long accountId) {
		super();
		this.id = id;
		this.amount = amount;
		this.debit = debit;
		this.txTime = LocalDateTime.now();
		this.accountId = accountId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean isDebit() {
		return debit;
	}

	public void setDebit(boolean debit) {
		this.debit = debit;
	}

	public LocalDateTime getTxTime() {
		return txTime;
	}

	public void setTxTime(LocalDateTime txTime) {
		this.txTime = LocalDateTime.now();
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
