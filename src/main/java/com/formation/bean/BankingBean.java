package com.formation.bean;

import javax.faces.bean.ManagedBean;

import com.formation.domain.Customer;
import com.formation.service.CustomerService;
import com.formation.service.CustomerServiceImpl;

@ManagedBean
public class BankingBean {
	private String customerId;
	private String password;
	private String nom;
	private String prenom;
	private Customer customer;
	private static CustomerService service = new CustomerServiceImpl();
	private static CustomerServiceImpl service2 = new CustomerServiceImpl();
	
	public String getCustomerId() {
		return (customerId);
	}

	public void setCustomerId(String customerId) {
		this.customerId= customerId.trim();
		if (this.customerId.isEmpty()) {
			this.customerId= "(none entered)";
		}
	}

	public String getPassword() {
		return (password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String setCustomer() {
		customer = service.findCustomer(customerId);
		if (customer == null) {
			service.addCustomer(new Customer(customerId, prenom, nom, 0d));
			customer = service.findCustomer(customerId);
			return ("registered");
		} 
		return ("new-customer2");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Customer getCustomer() {
		return (customer);
	}
	
	public String showBalance() {

		customer = service.findCustomer(customerId);
		if (customer == null) {
			return ("unknown-customer");
		} 
		
		if (!password.equals("secret")) {
			return ("wrong-password");
		}
		
		if (customer.getBalance() < 0) {
			return ("negative-balance");
		} else if (customer.getBalance() < 10000) {
			return ("normal-balance");
		} else {
			return ("high-balance");
		}
		

	}
}
