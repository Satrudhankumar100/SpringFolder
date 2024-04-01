package com.user.registration.api.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.user.registration.api.dto.UserDTO;

public interface UserService {
	
	public UserDTO createUser(@RequestBody UserDTO userDto) ;
	

}
