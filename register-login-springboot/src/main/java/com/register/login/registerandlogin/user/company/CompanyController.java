package com.register.login.registerandlogin.user.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.register.login.registerandlogin.user.User;
import com.register.login.registerandlogin.user.UserRepository;

//Controls Company details
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	UserRepository userRepository;
	
	//Returns Company details based on User id
	@GetMapping("users/{id}/companies")
	public Company retrieveOne(@PathVariable int id) {
		
		List<Company> companies = new ArrayList<>();
		companies = companyRepository.findAll();
		
		for(Company company: companies)
			if(company.getUser().getId()==id)
				return company;
		
		return null;
		
	}
	
	//Posts company details based on user id
	@PostMapping("/users/{id}/company")
	public void createCompany(@PathVariable int id, @RequestBody Company company) {
		
		Optional<User> user = userRepository.findById(id);
		
		company.setUser(user.get()); 
		
		companyRepository.save(company);
	}

}
