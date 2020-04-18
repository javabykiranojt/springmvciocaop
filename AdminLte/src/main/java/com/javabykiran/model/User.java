package com.javabykiran.model;

//This will be used for UI
public class User {
	String username;

	public String getUsername() {
		return username;
	}

	public User(String username) {
		super();
		this.username = username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
}
