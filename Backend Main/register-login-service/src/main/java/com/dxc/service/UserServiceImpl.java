package com.dxc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.UserAlreadyExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.Role;
import com.dxc.model.User;
import com.dxc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository ur;

	@Override
	public User registerUser(User user) throws UserAlreadyExistsException {
		final boolean check= ur.existsByEmail(user.getEmail());
		if(check)
		{
			throw new UserAlreadyExistsException("User already exists");	
		}
		return ur.save(user);
	}

	@Override
	public User authenticateUser(String email, String password, String role) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> optionalUser= ur.findByEmailAndPasswordAndRole(email, password, role);
		if(optionalUser.isEmpty())
		{
			throw new UserNotFoundException("User not found");
		}
		return optionalUser.get();
	}

}
