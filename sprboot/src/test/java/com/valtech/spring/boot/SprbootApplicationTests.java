package com.valtech.spring.boot;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.spring.boot.jpa.Employee;
import com.valtech.spring.boot.jpa.EmployeeRepository;

@SpringBootTest
class SprbootApplicationTests {
	
	@Autowired
	private HelloWorld helloWorld;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	@Test
//	void testFinders(){
//		assertEquals(1, employeeRepository.countByGender(1));
//		assertEquals(3, employeeRepository.countByGender(-1));
//		assertEquals(0, employeeRepository.countByGender(0));
//		assertEquals(0, employeeRepository.countBySalaryBetween(14000, 18000));
//	}
	
	@Test
	void testHelloWorld(){
		assertEquals("Hello Valtech", helloWorld.HelloWorld("Valtech"));
	}
	
	
//	@Test
//	void testEmployeeRepo() {
//		long count =employeeRepository.count();
////		Employee emp=new Employee("Abc",-1,LocalDate.of(1974, 8, 18),150000,"Padma Nagar,Bengaluru,560088");
////		employeeRepository.save(emp);
////		emp=new Employee("Efg",-1,LocalDate.of(1984, 9, 28),150000,"Mk Nagar,Bengaluru,560054");
////		employeeRepository.save(emp);
////		emp=new Employee("Hij",-1,LocalDate.of(1950, 8, 18),150000,"VK Nagar,Bengaluru,560034");
////		employeeRepository.save(emp);
//		
//		
////		assertEquals(count+1,employeeRepository.count());
//	}

}
