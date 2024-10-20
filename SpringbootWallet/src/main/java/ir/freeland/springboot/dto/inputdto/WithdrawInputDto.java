package ir.freeland.springboot.dto.inputdto;

import ir.freeland.springboot.annotation.CardNumber;
import jakarta.validation.constraints.NotBlank;

public class WithdrawInputDto {
	
	@CardNumber
	@NotBlank(message = "id is required")
	String accountNumber;
	
	@NotBlank(message = "amount is required")
    private double amount;
    
    

	public WithdrawInputDto() {
		super();
		
	}



	public WithdrawInputDto(String accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
    
    
}
