package com.app.service;

import java.util.Optional;

import com.app.entity.User;

public interface IUserService {
	public Integer saveUser(User user);
	public Optional<User> findByUserEmail(String userEmail);

}
