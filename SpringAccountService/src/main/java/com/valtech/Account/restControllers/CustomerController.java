package com.valtech.Account.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Account.entity.Customer;
import com.valtech.Account.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/api/customers")
	public Customer createCustomer(@RequestBody Customer customer){
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/api/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
	
   @GetMapping("/api/customers/{id}")
    public Customer getCustomerById(@PathVariable("id")  Long id){
        return customerService.getCustomer(id);
    }
    
    @PutMapping("/api/customers/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("id") Long id){
        return customerService.updateCustomer(customer);
    }
}
