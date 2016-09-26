package com.firstProject.constructor.FirstProjectConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CustomerBean")
public class Customer {
	
	
	private Person person;

	public Customer(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}
