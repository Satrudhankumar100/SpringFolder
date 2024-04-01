package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repo.UserRepository;
import com.app.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public Integer saveUser(User user) {
		User save = repo.save(user);
		return user.getUserId() ;
	}

	@Override
	public Optional<User> findByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
