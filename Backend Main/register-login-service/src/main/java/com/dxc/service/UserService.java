package com.dxc.service;

import com.dxc.exception.UserAlreadyExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.Role;
import com.dxc.model.User;

public interface UserService {
	public User registerUser(User user) throws UserAlreadyExistsException;
	public User authenticateUser(String username, String password, String role) throws UserNotFoundException;
}
