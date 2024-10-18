package ir.freeland.springboot.dto.inputdto;

import java.util.Date;

import ir.freeland.springboot.persistence.model.Gender;
import ir.freeland.springboot.persistence.model.MilitaryStatus;

public class UpdatePersonInputDto {
	private long id;
	private String name;
	private String surName;
	private String nationalCode;
	private Date birthDate;
	private String mobileNumber;
	private Gender gender;
	private MilitaryStatus militaryStatus;
	private String email;
	
	public UpdatePersonInputDto() {
		super();
		
	}
	
	
	public UpdatePersonInputDto(long id, String name, String surName, String nationalCode, Date birthDate,
			String mobileNumber, Gender gender, MilitaryStatus militaryStatus, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.nationalCode = nationalCode;
		this.birthDate = birthDate;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.militaryStatus = militaryStatus;
		this.email = email;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getNationalCode() {
		return nationalCode;
	}
	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public MilitaryStatus getMilitaryStatus() {
		return militaryStatus;
	}
	public void setMilitaryStatus(MilitaryStatus militaryStatus) {
		this.militaryStatus = militaryStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
