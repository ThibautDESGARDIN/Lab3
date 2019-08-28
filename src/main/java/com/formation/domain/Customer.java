package com.formation.domain;

public class Customer {
	private String id;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Customer(String id, String firstName, String lastName, double balance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
}
