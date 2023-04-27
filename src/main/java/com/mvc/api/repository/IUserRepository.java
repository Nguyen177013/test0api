package com.mvc.api.repository;

import java.util.List;

import com.mvc.api.models.User;

public interface IUserRepository {
	public void signUp(User user);
	public boolean signIn(String userName, String password);
	public void changePassword(User user);
	public String userInfo(User user);
}
