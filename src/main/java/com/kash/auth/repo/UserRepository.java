package com.kash.auth.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kash.auth.model.KashUser;

public interface UserRepository extends JpaRepository<KashUser, Integer> {

	boolean existsByUsername(String username);

	KashUser findByUsername(String username);

	@Transactional
	void deleteByUsername(String username);

}
