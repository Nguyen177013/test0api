package com.mvc.api.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.api.models.User;
import com.mvc.api.repository.IUserRepository;

@Service
public class UserService implements IUserRepository {
	@Autowired
	private AdminService adminService;

	@Override
	public void signUp(User user) {
		// TODO Auto-generated method stub
		adminService.users.add(user);
	}

	@Override
	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		Stream<User> check = adminService.users.stream().filter(preUser -> (userName.contains(preUser.getUserName()))
				&& password.contains(preUser.getPassword()));
		if(check.count() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void changePassword(User user) {
		// TODO Auto-generated method stub
		for(User ele : adminService.users) {
			if(ele.getUserName().contains(user.getUserName())) {
				ele.setPassword(user.getPassword());
			}
		}
	}

	@Override
	public String userInfo(User user) {
		Stream<User> check = adminService.users.stream().filter(preUser -> (preUser.getUserName() == user.getUserName())
				&& preUser.getPassword() == user.getPassword());
		System.out.println(check);
		return null;
	}

}
