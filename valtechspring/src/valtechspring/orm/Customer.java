package valtechspring.orm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({@NamedQuery(name="customersByAccountType",query="SELECT c FROM Customer c JOIN c.accounts a WHERE a.accountType = ?")})
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private int gender;
	@OneToOne(targetEntity=Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="customer")
	private Address address;
	@ManyToMany(targetEntity=Account.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="customers")
	private Set<Account> accounts;
	
	
	public Customer(){}
	
	
	
	public Customer(String name, Date dateOfBirth, int gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public void addAccount(Account account){
		System.out.println("ACoount d"+account.getId()+" Customer Id "+this.getId());
		if(getAccounts()==null){
			accounts=new HashSet<Account>();
			}
		accounts.add(account);
		if(account.getCustomers()==null){
			account.setCustomers(new HashSet<Customer>());
		}
		account.getCustomers().add(this);
		
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", address=" + address + "]";
	}



	public Set<Account> getAccounts() {
		return accounts;
	}



	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	
	
}
