package com.register.login.registerandlogin.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Mapped to User Table
@Entity
@Table(name = "User")
public class User {
	
	//Mapped to id field of user table
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	//Mapped to firstname field of user table
	@NotNull
	@Size(min=1, message="First Name is required")
	private String firstName;
	
	//Mapped to lastname field of user table
	@NotNull
	@Size(min=1, message="Last Name is required")
	private String lastName;
	
	//Mapped to company email field of user table
	@NotNull
	@Size(min=1, message="Company Email is required")
	private String companyEmail;
	
	//Mapped to company name field of user table
	@NotNull
	@Size(min=1, message="Company Name is required")
	private String companyName;
	
	//Mapped to password field of user table
	@NotNull
	@Size(min=1, message="Password is required")
	private String password;
	
	public User() {}
	
	public User(int id, String firstName, String lastName, String companyEmail, 
			    String companyName, String password) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyEmail = companyEmail;
		this.companyName = companyName;
		this.password = password;
		
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

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
