package com.register.login.registerandlogin.user.company.authorized.signer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.register.login.registerandlogin.user.company.Company;

@Entity
@Table(name = "authorized_signer")
public class AuthorizedSigner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(min=1, message="First Name is required")
	private String firstName;
	
	@NotNull
	@Size(min=1, message="Last Name is required")
	private String lastName;
	
	@NotNull
	@Size(min=1, message="Address is required")
	private String address;
	
	@NotNull
	@Size(min=1, message="Country is required")
	private String country;
	
	@NotNull
	@Size(min=1, message="State is required")
	private String state;
	
	@NotNull
	@Size(min=1, message="City is required")
	private String city;
	
	@NotNull
	@Size(min=6, max=6, message="Zip Code is required")
	private Long zipCode;
	
	@NotNull
	@Size(min=1, message="Date of Birth is required")
	private Date dateOfBirth;
	
	@OneToOne
	private Company company;

    public AuthorizedSigner() {}
	
	public AuthorizedSigner(Integer id, 
			@NotNull @Size(min = 1, message = "First Name is required") String firstName,
			@NotNull @Size(min = 1, message = "Last Name is required") String lastName,
			@NotNull @Size(min = 1, message = "Address is required") String address,
			@NotNull @Size(min = 1, message = "Country is required") String country,
			@NotNull @Size(min = 1, message = "State is required") String state,
			@NotNull @Size(min = 1, message = "City is required") String city,
			@NotNull @Size(min = 6, max = 6, message = "Zip Code is required") Long zipCode,
			@NotNull @Size(min = 1, message = "Date of Birth is required") Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
		
}
