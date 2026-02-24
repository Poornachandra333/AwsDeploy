package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CseController {
	
	@GetMapping("/home")
	public String rocks() {
		return " Hey Welcome to Jenkins AWS";
	}
	
	
	
}


//18.232.147.84