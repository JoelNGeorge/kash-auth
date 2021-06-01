package com.kash.auth;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.kash.auth.model.KashRole;
import com.kash.auth.model.KashUser;
import com.kash.auth.service.UserService;

@SpringBootApplication
@EnableEurekaClient
public class KashAuthApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(KashAuthApplication.class, args);
	}

	@Override
	public void run(String... params) throws Exception {
		KashUser admin = new KashUser();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setEmail("admin@email.com");
		admin.setRoles(new ArrayList<KashRole>(Arrays.asList(KashRole.ROLE_ADMIN)));

		userService.signup(admin);

		KashUser client = new KashUser();
		client.setUsername("client");
		client.setPassword("client");
		client.setEmail("client@email.com");
		client.setRoles(new ArrayList<KashRole>(Arrays.asList(KashRole.ROLE_USER)));

		userService.signup(client);
	}
	
	  @Bean
	  public ModelMapper modelMapper() {
	    return new ModelMapper();
	  }
}
