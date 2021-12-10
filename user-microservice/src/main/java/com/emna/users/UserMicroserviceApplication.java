package com.emna.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.emna.users.entities.Role;
import com.emna.users.entities.User;
import com.emna.users.service.UserService;

@SpringBootApplication
public class UserMicroserviceApplication {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UserMicroserviceApplication.class, args);
	}
	/*
	@PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"emna","123",true,null));
	userService.saveUser(new User(null,"chawki","123",true,null));
	userService.saveUser(new User(null,"fatma","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("admin", "USER");
	userService.addRoleToUser("emna", "USER");
	userService.addRoleToUser("chawki", "USER");
	userService.addRoleToUser("fatma", "USER");
	}*/ 
    
    
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}
	
	

}
