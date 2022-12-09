package valtechspring.orm;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
//@Table(name="myCars")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int  id;
	private String make;
	private String model;
	private int yearManufactured;
	private float price;
	@Column(name="color")
	private String colour;
	@Version
	private int version;
	
	@Embedded
	private CarDetails carDetails;
	

	public Car(){}
	
	public Car(int id, String make, String model, int yearManufactured, float price, String colour,CarDetails carDetails) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.colour = colour;
		this.carDetails=carDetails;
	}

	
	
	public Car(String make, String model, int yearManufactured, float price, String colour,CarDetails carDetails) {
		super();
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.colour = colour;
		this.carDetails=carDetails;
	}
	
	public CarDetails getCarDetails() {
		return carDetails;
	}
	
	public void setCarDetails(CarDetails carDetails) {
		this.carDetails = carDetails;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
