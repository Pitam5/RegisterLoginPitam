package com.register.login.registerandlogin.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.register.login.registerandlogin.user.User;
import com.register.login.registerandlogin.user.UserRepository;

@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user={username}&pw={password}")
	public User retrieveUser(@PathVariable String username, @PathVariable String password) {
		
		List<User> users = new ArrayList<>();
		
		users = userRepository.findAll();
		
		for(User user: users)
			if(user.getCompanyEmail().equals(username) && user.getPassword().equals(password))
				return user;
		
		return null;
		
	}

	
}
