package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/hi")
	public String first() {
		return "index";
	}

}
