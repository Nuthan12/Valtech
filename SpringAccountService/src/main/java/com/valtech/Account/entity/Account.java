package com.valtech.Account.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "Accounts")
public class Account {

	public static final String SAVINGS = "SB";
    public static final String CURRENT = "CA";
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String accountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdetedDate;
	private boolean active;
	
//	 @OneToMany(mappedBy = "Account", ,fetch = FetchType.LAZY,
//	            cascade = CascadeType.ALL)
//	@OneToMany(targetEntity=Tx.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="Account")
//	private Set<Tx> txs;
	
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(name="customer_account", joinColumns=@JoinColumn(name="account_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="customer_id",referencedColumnName="id"))
	
	  private Set<Customer> customers;
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", balance=" + balance + ", creationDate="
				+ creationDate + ", lastUpdetedDate=" + lastUpdetedDate + ", active=" + active + "]";
	}
	public Account(long id, String accountType, double balance, LocalDateTime creationDate, LocalDateTime lastUpdetedDate,
			boolean active) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdetedDate = lastUpdetedDate;
		this.active = active;
	}
	public Account(String accountType, double balance
			) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = LocalDateTime.now();
		this.lastUpdetedDate = LocalDateTime.now();
		this.active = false;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCustomer(Set<Customer> customer) {		
		this.customers = customer;
	}
	public Set<Customer> getCustomer() {
		return customers;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastUpdetedDate() {
		return lastUpdetedDate;
	}
	public void setLastUpdetedDate(LocalDateTime lastUpdetedDate) {
		this.lastUpdetedDate = lastUpdetedDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
