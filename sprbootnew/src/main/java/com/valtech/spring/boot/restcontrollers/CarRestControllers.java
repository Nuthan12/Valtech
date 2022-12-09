package com.valtech.spring.boot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.entity.Product;
import com.valtech.spring.boot.service.CarService;

@RestController
public class CarRestControllers {
	
	@Autowired
	private CarService carService;
	
	@PutMapping("/api/cars/{id}")
	public Product updateCar(@PathVariable("id") int id,@RequestBody Product car ){
		return carService.update(car);
	}
	
	
	@PostMapping("/api/cars")
	public Product createCar(@RequestBody Product car){
		return carService.createCar(car);
		
	}
	
	@GetMapping("/api/cars/{id}")
	public Product getCar(@PathVariable("id") int id){
		return carService.get(id);
	}
	
	@GetMapping("/api/cars")
	public List<Product> getCars(){
		return carService.getAllCars();
	}
	
	
	
}
