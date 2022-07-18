package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {

	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservice Example";
		
	}
	
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name ) {
		return "Welcome : " + name;
	}
	
	
	@RequestMapping(path = "/secondpathvariable/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Path Params  : " + name;
	}
	
	
	@GetMapping(path= "/secondSampleBean")
	public SecondSampleBean secondSampleBean() {
		return new SecondSampleBean("For Pojo Calls ");
	}
}