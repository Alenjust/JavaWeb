package com.itheima.model.domain;

import javax.xml.crypto.Data;

public class User {
	private int id;
	private String username;
	private String userpassword;
	private String email;
	private Data created;
	private boolean valid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Data getCreated() {
		return created;
	}
	public void setCreated(Data created) {
		this.created = created;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + ", email=" + email
				+ ", created=" + created + ", valid=" + valid + "]";
	}
	
}
