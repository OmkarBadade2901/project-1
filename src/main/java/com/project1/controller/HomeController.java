package com.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project1.model.User;
import com.project1.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/index")
	public String getHomePage() {
		return "index.html";
	}
	
	@GetMapping("/register")
	public String getRegisterPage() {
		return "registration.html";
	}
	
	@PostMapping("/registerUser")
	public String registerMethod(User user) {
		System.out.println("hi");
		System.out.println(user.getName());
		
		
		userService.saveUser(user);
		return "index";
	}
	
}
