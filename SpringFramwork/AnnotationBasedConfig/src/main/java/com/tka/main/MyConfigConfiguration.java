package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.demo.Address;
import com.tka.entity.Country;
import com.tka.entity.Employee;
import com.tka.entity.Job;

@ComponentScan(basePackages= {"com.tka"})
public class MyConfigConfiguration {
    
//	@Bean("emp")
//	@Scope(value="prototype")
//    public Employee empObj() {
//		return(new Employee());
//	}

//	@Bean("con")
//	public Country countryInstanc() {
//		return(new Country());
//	}
	
//	@Bean("job")
//	public Job jobInstanc() {
//		return(new Job());
//	}
	
//	@Bean("addr")
//	public Address addressInstanc() {
//		return(new Address());
//	}
}
