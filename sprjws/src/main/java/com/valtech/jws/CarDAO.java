package com.valtech.jws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class CarDAO {
private Map<Integer, Car> cars;
	
	{
		cars = new HashMap<Integer, Car>();
	}

	public void saveCar(Car car){
		cars.put(car.getId(), car);
		System.out.println("Successfully created car");
	}
	
	public void updateCar(Car car){
		cars.put(car.getId(), car);
		System.out.println("Successfully updated car");
	}
	
	public void deleteCar(Car car){
		cars.remove(car.getId());
		System.out.println("Successfully deleted car");
	}
	
	public Car getCar(int id){
		System.out.println("Successfully loaded car with id "+id);
		return cars.get(id);
		
	}
	
	public List<Car> getAllCars(){
		System.out.println("Successfully listed cars");
		return cars.values().stream().collect(Collectors.toList());
	}
}
