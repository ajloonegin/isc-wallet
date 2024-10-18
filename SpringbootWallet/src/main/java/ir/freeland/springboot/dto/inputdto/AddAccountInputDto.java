package ir.freeland.springboot.dto.inputdto;

import java.util.Date;



public class AddAccountInputDto {
	private String accountNumber;
	private long accountBalance;
	private Date dateOfCreate;
	private String shabaNumber;
	
	public AddAccountInputDto() {
		super();
		
	}

	public AddAccountInputDto(String accountNumber, long accountBalance, Date dateOfCreate, String shabaNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.dateOfCreate = dateOfCreate;
		this.shabaNumber = shabaNumber;
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
	
	
	
	
	
	
	
	

}
