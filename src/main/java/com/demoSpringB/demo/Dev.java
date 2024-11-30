package com.demoSpringB.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	//Field injection
	/*@Autowired
	Laptop laptop; */

	// constructor injection
	/*public Dev(Laptop laptop) {
		super();
		this.laptop = laptop;
	}*/
	
	// setter injection
	/*	public Laptop getLaptop() {
			return laptop;
		}

		@Autowired
		public void setLaptop(Laptop laptop) {
			this.laptop = laptop;
		}*/
	@Autowired
	@Qualifier("desktop")	
	Computer comp;

	public void build() {
		comp.compile();
		System.out.println("Dev completed");
	}

}
