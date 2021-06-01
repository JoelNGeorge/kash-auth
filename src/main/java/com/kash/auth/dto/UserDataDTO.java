package com.kash.auth.dto;

import java.util.List;

import com.kash.auth.model.KashRole;

public class UserDataDTO {

	private String username;
	private String email;
	private String password;
	List<KashRole> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public List<KashRole> getKashRoles() {
		return roles;
	}

	public void setKashRoles(List<KashRole> roles) {
		this.roles = roles;
	}

}
