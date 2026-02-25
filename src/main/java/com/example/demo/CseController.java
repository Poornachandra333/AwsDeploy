package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CseController {
	
	@GetMapping("/home")
	public String rocks() {
		return " Hey Client This is our Home ";
	}
	
	@GetMapping("/message")
	public String rocks1() {
		return "Hey Client Welcome  to this Page  This is 23MH1A05O4";
	}
	
}


//18.232.147.84