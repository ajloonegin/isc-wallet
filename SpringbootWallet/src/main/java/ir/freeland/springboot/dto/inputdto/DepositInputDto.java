package ir.freeland.springboot.dto.inputdto;





public class DepositInputDto {
	
	
    private String destinationAccountNumber;

    private double amount;

    public DepositInputDto() {
    }
    
    
    

	public DepositInputDto(String destinationAccountNumber, double amount) {
		super();
		this.destinationAccountNumber = destinationAccountNumber;
		this.amount = amount;
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
