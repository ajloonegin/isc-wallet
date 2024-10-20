package ir.freeland.springboot.dto.inputdto;

import ir.freeland.springboot.annotation.CardNumber;
import jakarta.validation.constraints.NotBlank;

public class TransactionInputDto {

	// account number= card number
	@CardNumber
	@NotBlank(message = "accountNumber is required")
	private String accountNumber;

	public TransactionInputDto() {
		super();

	}

	public TransactionInputDto(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
