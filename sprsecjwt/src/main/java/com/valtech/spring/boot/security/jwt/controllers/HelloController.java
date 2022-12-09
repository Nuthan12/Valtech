package com.valtech.spring.boot.security.jwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String admin(){
		return "Hello Admin";
	}
	
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String user(){
		return "Hello user";
	}
	
	
	
	
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}
	
}
