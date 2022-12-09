package valtechspring.orm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(BankAccountId.class)
public class BankAccount {

	@Id
	private int accountNo;
	@Id
	private String accountType;
	private float balance;
	private Date openingDate;
	private boolean active;

	public BankAccount() {}

	public BankAccount(int accountNo, String accountType, float balance, Date openingDate, boolean active) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.openingDate = openingDate;
		this.active = active;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountType=" + accountType + ", balance=" + balance
				+ ", openingDate=" + openingDate + ", active=" + active + "]";
	}
	
	

}
