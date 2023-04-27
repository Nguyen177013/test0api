package com.mvc.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mvc.api.models.Account;
import com.mvc.api.models.User;
import com.mvc.api.repository.IAdminRepository;
import com.mvc.api.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminRepository repo;
	
	@GetMapping("/")
	public String testAdmin() {
		return "This is admin api";
	}
	@GetMapping("/list-user")
	public List<User> listUser(){
		try {
		if(repo.getAllUser() == null)
		return new ArrayList<User>();
		return repo.getAllUser();
		}catch(Exception ex) {
			System.out.println("Lỗi List User");
			return repo.getAllUser();
		}
	}
	@PostMapping("/delete-user")
	public List<User> deleteUser(@RequestBody Account account){
		try {	
		String userName = account.getUserName();
		System.out.println(userName);
		return repo.deleteUser(userName);
		}
		catch(Exception ex) {
			System.out.println("Lỗi delete user");
			return repo.getAllUser();
		}
	}
}
