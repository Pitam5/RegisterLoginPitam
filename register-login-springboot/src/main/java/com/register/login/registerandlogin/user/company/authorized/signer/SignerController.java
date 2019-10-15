package com.register.login.registerandlogin.user.company.authorized.signer;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.register.login.registerandlogin.user.company.Company;
import com.register.login.registerandlogin.user.company.CompanyRepository;

@RestController
public class SignerController {
	
	@Autowired
	private SignerRepository signerRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@PostMapping("/company/{id}/signer")
	public void createCompany(@PathVariable int id, @RequestBody AuthorizedSigner signer) {
		
		Optional<Company> company = companyRepository.findById(id);
		
		signer.setCompany(company.get());
		
		signerRepository.save(signer);
	}

}
