package com.tka.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;
public class MainClass {
public static void main(String[] args) {
	
	
	System.out.println("wlcome to Spring Core");
	//ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
	ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
	
	//Employee e=(Employee) context.getBean("emp");
//	System.out.println(e);
	Employee e=context.getBean("emp",Employee.class);
	System.out.println(e);
}
}
