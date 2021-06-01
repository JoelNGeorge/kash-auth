package com.kash.auth.model;

import org.springframework.security.core.GrantedAuthority;

public enum KashRole implements GrantedAuthority {

	ROLE_ADMIN, ROLE_USER;

	@Override
	public String getAuthority() {
		return name();
	}

}