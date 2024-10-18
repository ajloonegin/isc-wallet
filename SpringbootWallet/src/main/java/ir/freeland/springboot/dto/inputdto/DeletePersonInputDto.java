package ir.freeland.springboot.dto.inputdto;

public class DeletePersonInputDto {
	private long id;

	public DeletePersonInputDto() {
		super();
		
	}

	public DeletePersonInputDto(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
