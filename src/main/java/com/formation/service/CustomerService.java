package com.formation.service;

import com.formation.domain.Customer;

public interface CustomerService {
	public Customer findCustomer(String id);
	
	public void addCustomer(Customer customer);
	

}
