package ir.freeland.springboot.dto.inputdto;

public class FindAccountInputDto {

	private String accountNumber;

	public FindAccountInputDto() {
		super();
		
	}

	public FindAccountInputDto(String accountNumber) {
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
