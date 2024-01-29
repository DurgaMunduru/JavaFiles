package com.dxc.model;

public class UserCredential {
	private String email;
	private String password;
	private String role;
	public UserCredential() {
		super();
	}
	@Override
	public String toString() {
		return "UserCredential [email=" + email + ", password=" + password + ", role=" + role + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public UserCredential(String email, String password, String role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
