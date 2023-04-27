package com.mvc.api.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.api.models.User;
import com.mvc.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String test() {
		return "Test user api ";
	}
	
	@PostMapping("/sign-up")
	public String signUp(@RequestBody User user) {
		try {			
		service.signUp(user);
		return "Sign Up Successfully";
		}
		catch(Exception ex) {
			return ex.toString();
		}
	}
	
	@PostMapping("/sign-in")
	public String signIn(@RequestBody User user) {
		try {
			if(service.signIn(user.getUserName(), user.getPassword())) {
				return "Login Successfully";				
			}
			return "User name or password incorrect";
		}catch(Exception ex) {
			return ex.toString();
		}
	}
	@PostMapping("/change-password")
	public String changePassword(@RequestBody User user) {
		try {
			service.changePassword(user);
				return "password has changed ";				
		}catch(Exception ex) {
			return ex.toString();
		}
	}
}
