package ir.freeland.springboot.persistence.model;

import java.util.Date;

import ir.freeland.springboot.relation.onetoone.foreignkeybased.Address;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ISC_ACCOUNT")
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_id")
	private long id;
	
	@Column(nullable = false, unique = true)
	private String accountNumber;
	
	
	
	@Column(nullable = false, unique = false)
	private long accountBalance;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfCreate;
	
	@Column(nullable = false, unique = true)
	private String shabaNumber;
	
	@OneToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;
	
	

	public Account() {
		super();
	
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public long getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}



	public Date getDateOfCreate() {
		return dateOfCreate;
	}



	public void setDateOfCreate(Date dateOfCreate) {
		this.dateOfCreate = dateOfCreate;
	}



	public String getShabaNumber() {
		return shabaNumber;
	}



	public void setShabaNumber(String shabaNumber) {
		this.shabaNumber = shabaNumber;
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
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Account other = (Account) obj;
		
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", dateOfCreate=" + dateOfCreate + ", shabaNumber=" + shabaNumber + ", bill=" + bill + "]";
	}



	
	
	
	
	
	
	
	

}
