package com.axis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dto.UserDto;
import com.axis.entity.User;
import com.axis.exception.IdNotFoundException;
import com.axis.repository.UserRepository;
import com.axis.utility.AppConstant;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto addUser(UserDto userDto) {
		return convertToDto(userRepository.save(convertToEntity(userDto)));
	}

	
	@Override
	public List<UserDto> getAllUser() {
	List<User> users=	userRepository.findAll();
	
	List<UserDto> userDtos = new ArrayList<UserDto>();
	
	for(User user :users)
	{
		userDtos.add(convertToDto(user));
	}
		
		return userDtos;
	}

	
    @Override
	public UserDto getUserById(int id) {
   Optional<User> optUser = userRepository.findById(id);
     
   if(optUser.isPresent())
	   return convertToDto(optUser.get());
   else   
      throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
   
		
	}

	
	
	private UserDto convertToDto(User user)
	{
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setAge(user.getAge());
		userDto.setContactNo(user.getContactNo());
		
		return userDto;
	}
	
	private User convertToEntity(UserDto userDto)
	{
		User user = new User();
		user.setName(userDto.getName());
		user.setAge(userDto.getAge());
		user.setContactNo(userDto.getContactNo());
		
		return user;
	}
}
