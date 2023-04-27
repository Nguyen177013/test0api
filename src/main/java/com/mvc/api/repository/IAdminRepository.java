package com.mvc.api.repository;

import java.util.List;

import com.mvc.api.models.User;

public interface IAdminRepository {
	public List<User> getAllUser();
	public List<User> deleteUser(String userName);
}
