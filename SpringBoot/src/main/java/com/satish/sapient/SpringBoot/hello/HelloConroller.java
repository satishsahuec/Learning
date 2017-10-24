package com.satish.sapient.SpringBoot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {
	
	
	@RequestMapping("/hello")
	public  String sayHello()
	{
		return "Hil";
	}

}
