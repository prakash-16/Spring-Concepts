package com.bridgelabz.springconcepts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebContainer {
	
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
}
