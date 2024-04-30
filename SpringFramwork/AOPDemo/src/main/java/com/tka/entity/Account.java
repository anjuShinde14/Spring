package com.tka.entity;


import org.springframework.stereotype.Component;

@Component
public class Account {
	
	public void Depoist() {
		System.out.println("U Amount is Depoisted");
	
	}
	public void depoist1(double amt) {
		System.out.println("U R " + amt + " Amount is Depoisted");
	}
	public void withdraw() {
		System.out.println("Amount is withdraw..");
	}
	
}
