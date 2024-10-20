package ir.freeland.springboot.dto.inputdto;

import java.util.Date;

import ir.freeland.springboot.annotation.CardNumber;
import ir.freeland.springboot.annotation.IbanCode;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class AddAccountInputDto {

	// account number= card number
	@CardNumber
	@NotBlank(message = "accountNumber is required")
	private String accountNumber;

	// rial
	@NotBlank(message = "accountBalance is required")
	@Min(10000)
	private long accountBalance;

	@NotBlank(message = "accountBalance is required")
	private Date dateOfCreate;

	// Iban number= shaba number
	@IbanCode
	@NotBlank(message = "shabaNumber is required")
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
