package com.register.login.registerandlogin.user.company;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.register.login.registerandlogin.user.User;

//Mapped to Company table
@Entity
@Table(name = "Company")
public class Company {
	
	//Mapped to id field of Company table
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	//Mapped to name field of Company table
	@NotNull
	@Size(min=1, message="Company Name is required")
	private String name;
	
	//Mapped to ssn field of Company table
	@NotNull
	@Size(min=1, message="SSN is required")
	private Integer ssn;
	
	//Mapped to address field of Company table
	@NotNull
	@Size(min=1, message="Company Address is required")
	private String address;
	
	//Mapped to country field of Company table
	@NotNull
	@Size(min=1, message="Country is required")
	private String country;
	
	//Mapped to state field of Company table
	@NotNull
	@Size(min=1, message="State is required")
	private String state;
	
	//Mapped to city field of Company table
	@NotNull
	@Size(min=1, message="City is required")
	private String city;
	
	//Mapped to zipcode field of Company table
	@NotNull
	@Size(min=6, max=6, message="Zip Code is required")
	private Long zipCode;
	
	//Mapped to phone field of Company table
	@NotNull
	@Size(min=10, max=10, message="Phone no. is required")
	private Long phone;
	
	//Mapped to website field of Company table
	@NotNull
	@Size(min=1, message="Website is required")
	private String website;
	
	//Mapped to date field of Company table
	@NotNull
	@Size(min=1, message="Date of Incorporation is required")
	private Date dateOfIncorporation;
	
	//Mapped to stateofincorporation field of Company table
	@NotNull
	@Size(min=1, message="State of Incorporation is required")
	private String stateOfIncorporation;
	
	//Mapped to cityofincorporation field of Company table
	@NotNull
	@Size(min=1, message="City of Incorporation is required")
	private String cityOfIncorporation;
	
	//Mapped with User table in one to one relation
	@OneToOne
	private User user;

	public Company() {}
	
	public Company(Integer id, 
			@NotNull @Size(min = 1, message = "Company Name is required") String name,
			@NotNull @Size(min = 1, message = "SSN is required") Integer ssn,
			@NotNull @Size(min = 1, message = "Company Address is required") String address,
			@NotNull @Size(min = 1, message = "Country is required") String country,
			@NotNull @Size(min = 1, message = "State is required") String state,
			@NotNull @Size(min = 1, message = "City is required") String city,
			@NotNull @Size(min = 6, max = 6, message = "Zip Code is required") Long zipCode,
			@NotNull @Size(min = 10, max = 10, message = "Phone no. is required") Long phone,
			@NotNull @Size(min = 1, message = "Website is required") String website,
			@NotNull @Size(min = 1, message = "Date of Incorporation is required") Date dateOfIncorporation,
			@NotNull @Size(min = 1, message = "State of Incorporation is required") String stateOfIncorporation,
			@NotNull @Size(min = 1, message = "City of Incorporation is required") String cityOfIncorporation) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.phone = phone;
		this.website = website;
		this.dateOfIncorporation = dateOfIncorporation;
		this.stateOfIncorporation = stateOfIncorporation;
		this.cityOfIncorporation = cityOfIncorporation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(Date dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getStateOfIncorporation() {
		return stateOfIncorporation;
	}

	public void setStateOfIncorporation(String stateOfIncorporation) {
		this.stateOfIncorporation = stateOfIncorporation;
	}

	public String getCityOfIncorporation() {
		return cityOfIncorporation;
	}

	public void setCityOfIncorporation(String cityOfIncorporation) {
		this.cityOfIncorporation = cityOfIncorporation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
