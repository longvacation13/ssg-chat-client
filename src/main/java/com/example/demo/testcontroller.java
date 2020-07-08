package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

	@RequestMapping("/welcome")
	public String testOutput() {
		return "welcome";
	}
}
