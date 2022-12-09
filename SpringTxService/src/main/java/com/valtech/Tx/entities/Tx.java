package com.valtech.Tx.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.valtech.Account.entity.Account;

@Entity
@Table(name="Transactions")
public class Tx {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private float amount;
	private boolean debit;
	private LocalDate txTime;
	private long accountId;
	
//	//@ManyToOne(targetEntity=Account.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
//	private Set<Account> account;
	
	
	public Tx(float amount, boolean debit, LocalDate txTime, long accountId) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.txTime = txTime;
		this.accountId = accountId;
	}
	public Tx(long id, float amount, boolean debit, LocalDate txTime, long accountId) {
		super();
		this.id = id;
		this.amount = amount;
		this.debit = debit;
		this.txTime = txTime;
		this.accountId = accountId;
	}
	public Tx() {
		super();
		// TODO Auto-generated constructor stub
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
	public LocalDate getTxTime() {
		return txTime;
	}
	public void setTxTime(LocalDate txTime) {
		this.txTime = txTime;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	

}
