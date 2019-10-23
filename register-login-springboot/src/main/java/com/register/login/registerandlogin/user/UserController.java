package com.register.login.registerandlogin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Controls User Details
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	//Returns List of uers
	@GetMapping("/users")
	public List<User> retrieveAll() {
		
		return userRepository.findAll();
		
	}
	
	//Posts new entry to User table
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
