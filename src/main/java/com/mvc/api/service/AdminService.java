package com.mvc.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.api.models.User;
import com.mvc.api.repository.IAdminRepository;

@Service
public class AdminService implements IAdminRepository{

	static public List<User> users = new ArrayList<>(
			Arrays.asList(
			new User("Luden", "150801", -1),
			new User("Phuong.Yoshino", "261001", 7), 
			new User("PhucByte", "050801", 8),
			new User("Shiroyuki", "210501", 7)
			)
	);
	@Override
	public List<User> getAllUser() {
		return users;
	}

	@Override
	public List<User> deleteUser(String userName) {
		users.removeIf(user -> userName.contains(user.getUserName()) );
		return users;
	}
	
}
