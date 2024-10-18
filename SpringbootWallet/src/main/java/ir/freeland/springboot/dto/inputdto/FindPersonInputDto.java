package ir.freeland.springboot.dto.inputdto;

public class FindPersonInputDto {
	private String nationalCode;

	public FindPersonInputDto() {
		super();
		
	}

	public FindPersonInputDto(String nationalCode) {
		super();
		this.nationalCode = nationalCode;
	}

	public String getNationalCode() {
		return nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	
	
}
