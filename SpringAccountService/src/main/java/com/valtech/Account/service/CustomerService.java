package com.valtech.Account.service;

import java.util.List;

import com.valtech.Account.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer getCustomer(long id);

	List<Customer> getAllCustomers();

}