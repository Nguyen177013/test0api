package com.mvc.api.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/user")
	public List test() {
		return new ArrayList<>(Arrays.asList(1,2,3,4,5));
	}
}
