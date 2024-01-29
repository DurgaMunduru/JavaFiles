package com.dxc.exception;

public class UserAlreadyExistsException extends Exception {
	
	String msg;
	
	public UserAlreadyExistsException(String msg)
	{
		super(msg);
	}
	public UserAlreadyExistsException()
	{
		super();
	}
	
}
