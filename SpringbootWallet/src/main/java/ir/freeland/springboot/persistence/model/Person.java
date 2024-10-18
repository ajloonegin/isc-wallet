package ir.freeland.springboot.persistence.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="ISC_PERSON")
public class Person {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="person_id")
	private long id;
	
	@Column(nullable = false, unique = false)
	private String name;
	
	@Column(nullable = false, unique = false)
	private String surName;
	
	@Column(nullable = false, unique = true)
	private String nationalCode;
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(nullable = false, unique = false)
	@Pattern(regexp = "(0|\\+98)?([ ]|-|[()]){0,2}9[1|2|3|4]([ ]|-|[()]){0,2}(?:[0-9]([ ]|-|[()]){0,2}){8}")
	private String mobileNumber;
	
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MilitaryStatus militaryStatus;
	
	
	@Column(unique = false, nullable = false)
	@Email(message = "Invalid email address")
//	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    private String email;
	
	@OneToOne(cascade = CascadeType.ALL) //There will be a unique constraint 
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
	private Bill bill;
	
	

	public Person() {
		super();

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
	
	
	
	

	public Bill getBill() {
		return bill;
	}





	public void setBill(Bill bill) {
		this.bill = bill;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nationalCode == null) ? 0 : nationalCode.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (nationalCode == null) {
			if (other.nationalCode != null)
				return false;
		} else if (!nationalCode.equals(other.nationalCode))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surName=" + surName + ", nationalCode=" + nationalCode
				+ ", birthDate=" + birthDate + ", mobileNumber=" + mobileNumber + ", gender=" + gender
				+ ", militaryStatus=" + militaryStatus + ", email=" + email + ", bill=" + bill + "]";
	}


	



	

}
