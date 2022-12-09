package com.valtech.jws.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.jws.Car;
import com.valtech.jws.CarWebService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SprjwsclientApplicationTests {
	
	
	@Autowired
	private CarWebService carWebService;
	
	@Test
	void testCarWebService() {
		//int count=carWebService.getAllCars().size();
		carWebService.saveCar(new Car(1,"BMW","B12",2022,1200000,"Silver"));
		//assertEquals(count+1, carWebService.getAllCars().size());
		System.out.println(carWebService.getAllCars());
	}

}
