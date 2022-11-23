package com.example.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.User;
import com.example.company.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public User saveuser(@RequestBody User user) {
		User response=userService.saveUser(user);
		return response;
	}
	
}
