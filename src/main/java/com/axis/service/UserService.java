package com.axis.service;

import java.util.List;

import com.axis.dto.UserDto;

public interface UserService {

	
	UserDto addUser(UserDto userDto);
	List<UserDto> getAllUser();
	UserDto getUserById(int id);
	
	
}
