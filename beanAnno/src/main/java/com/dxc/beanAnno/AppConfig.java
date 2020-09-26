package com.dxc.beanAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dxc.beanAnno"})

public class AppConfig {
	
	@Autowired
	Flight  flight;
	

}
