package com.kash.auth.dto;

import java.util.List;

import com.kash.auth.model.KashRole;

public class UserResponseDTO {

	  private Integer id;
	  private String username;
	  private String email;
	  List<KashRole> roles;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

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

	  public List<KashRole> getKashRoles() {
	    return roles;
	  }

	  public void setKashRoles(List<KashRole> roles) {
	    this.roles = roles;
	  }
}
