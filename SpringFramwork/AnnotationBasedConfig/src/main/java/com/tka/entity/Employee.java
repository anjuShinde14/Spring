package com.tka.entity;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	int id;
	String name;

	public Employee(int id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;	
	}
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
