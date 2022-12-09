package valtechspring.orm;

import javax.persistence.Embeddable;

@Embeddable
public class CarDetails {
	private int kms;
	private boolean validInsurance;
	private int numOfOwners;
	
	
	
	public CarDetails(int kms, boolean validInsurance, int numOfOwners) {
		super();
		this.kms = kms;
		this.validInsurance = validInsurance;
		this.numOfOwners = numOfOwners;
	}
	public CarDetails() {}
	
	
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public boolean isValidInsurance() {
		return validInsurance;
	}
	public void setValidInsurance(boolean validInsurance) {
		this.validInsurance = validInsurance;
	}
	public int getNumberOfOwners() {
		return numOfOwners;
	}
	public void setNumberOfOwners(int numOfOwners) {
		this.numOfOwners = numOfOwners;
	}
	@Override
	public String toString() {
		return "CarDetails [kms=" + kms + ", validInsurance=" + validInsurance + ", numberOfOwners=" + numOfOwners
				+ ", getKms()=" + getKms() + ", isValidInsurance()=" + isValidInsurance() + ", getNumberOfOwners()="
				+ getNumberOfOwners() + "]";
	}
	
}
