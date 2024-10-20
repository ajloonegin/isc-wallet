package ir.freeland.springboot.dto.inputdto;

import ir.freeland.springboot.annotation.CardNumber;
import jakarta.validation.constraints.NotBlank;

public class TransferInputDto {

	// account number= card number
	@CardNumber
	@NotBlank(message = "sourceAccountNumber is required")
	String sourceAccountNumber;
	
	// account number= card number
	@CardNumber
	@NotBlank(message = "destinationAccountNumber is required")
	String destinationAccountNumber;
	
	@NotBlank(message = "amount is required")
	private double amount;

	public TransferInputDto() {
		super();

	}

	public TransferInputDto(String sourceAccountNumber, String destinationAccountNumber, double amount) {
		super();
		this.sourceAccountNumber = sourceAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
		this.amount = amount;
	}

	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(String destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
