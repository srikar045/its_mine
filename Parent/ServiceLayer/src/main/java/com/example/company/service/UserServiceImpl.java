package com.example.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.entity.User;
import com.example.company.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User newuser=new User();
		newuser.setName(user.getName());
		newuser.setEmail(user.getEmail());
		User save1=userRepository.save(newuser);
		return save1;
	}

}
