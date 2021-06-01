package com.kash.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kash.auth.model.KashUser;
import com.kash.auth.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final KashUser user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("User '" + username + "' not found");
		}

		return org.springframework.security.core.userdetails.User.withUsername(username).password(user.getPassword())
				.authorities(user.getRoles()).accountExpired(false).accountLocked(false).credentialsExpired(false)
				.disabled(false).build();
	}
}
