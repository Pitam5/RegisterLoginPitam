package com.register.login.registerandlogin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> retrieveAll() {
		
		return userRepository.findAll();
		
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
