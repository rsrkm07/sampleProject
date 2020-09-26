package com.dxc.beanAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext  factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	Flight flight =	factory.getBean(Flight.class);
		
		System.out.println(flight);
		
		System.out.println(flight.getPassenger());
		
		Passenger  pas = (Passenger)	factory.getBean("p1");
		
		System.out.println(pas);

	}

}
