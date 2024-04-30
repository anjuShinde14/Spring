package com.tka.entity;

import org.springframework.stereotype.Component;

@Component 
public class Job {
 
	String dipartment;
	int salary;
	
	public Job(){
	
	}
	
	public Job(String dipartment, int salary) {
		super();
		this.dipartment = dipartment;
		this.salary = salary;
	}
	public String getDipartment() {
		return dipartment;
	}
	public void setDipartment(String dipartment) {
		this.dipartment = dipartment;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Job [dipartment=" + dipartment + ", salary=" + salary + "]";
	}
	
	
}
