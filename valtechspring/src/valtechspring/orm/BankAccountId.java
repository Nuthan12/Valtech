package valtechspring.orm;

import java.io.Serializable;

public class BankAccountId implements Serializable{
	
	private int accountNo;
	private String accountType;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNo;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		return result;
		
		//return HashCodeBuilder.reflectionHashCode(this);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountId other = (BankAccountId) obj;
		if (accountNo != other.accountNo)
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		return true;
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
	public BankAccountId() {}
	public BankAccountId(int accountNo, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	
}
