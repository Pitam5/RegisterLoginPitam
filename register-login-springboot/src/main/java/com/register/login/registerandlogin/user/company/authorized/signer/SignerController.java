package com.register.login.registerandlogin.user.company.authorized.signer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.register.login.registerandlogin.user.company.Company;
import com.register.login.registerandlogin.user.company.CompanyRepository;

//Controls authorized signer details
@RestController
public class SignerController {
	
	@Autowired
	private SignerRepository signerRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	//Returns authorized signer details based on company id
	@GetMapping("company/{id}/signer")
	public AuthorizedSigner retrieveOne(@PathVariable int id) {
		
		List<AuthorizedSigner> signers = new ArrayList<>();
		signers = signerRepository.findAll();
		
		for(AuthorizedSigner signer: signers)
			if(signer.getCompany().getId()==id)
				return signer;
		
		return null;
		
	}
	
	//Posts authorized signer details based on company id
	@PostMapping("/company/{id}/signer")
	public void createCompany(@PathVariable int id, @RequestBody AuthorizedSigner signer) {
		
		Optional<Company> company = companyRepository.findById(id);
		
		signer.setCompany(company.get());
		
		signerRepository.save(signer);
	}

}
