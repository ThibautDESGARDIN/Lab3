package com.formation.service;


import java.util.HashMap;
import java.util.Map;

import com.formation.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
	private Map<String, Customer> customers;

	public CustomerServiceImpl() {
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("id001", "Jules", "Hacker", -3456.78));
		addCustomer(new Customer("id002", "Marc", "Coder", 1234.56));
		addCustomer(new Customer("id003", "Jean", "Programmer", 98754.32));

	}

	public Customer findCustomer(String id) {
		if (id != null) {
			return (customers.get(id.toLowerCase()));
		} else {
			return (null);
		}
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

}
