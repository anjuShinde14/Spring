package com.tka.main;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfiguration;
import com.tka.entity.Employee;

public class MainCalss {
public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	
	Employee e=context.getBean(Employee.class);
	System.out.println(e);
}
}
