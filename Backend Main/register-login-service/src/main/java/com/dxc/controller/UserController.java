package com.dxc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.UserAlreadyExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.User;
import com.dxc.model.UserCredential;
import com.dxc.service.UserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/fit-my-job")
public class UserController {
	
	
	@Autowired
	UserService service;
	
	
	
	@PostMapping("register")
	public User registerUser(@RequestBody User user) throws UserAlreadyExistsException
	{
		return service.registerUser(user);
	}
	
	
	@PostMapping("login")
	public User authenticateUser(@RequestBody UserCredential uc) throws UserNotFoundException
	{
		return this.service.authenticateUser(uc.getEmail(), uc.getPassword(), uc.getRole());
	}

}
