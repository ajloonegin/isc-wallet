package ir.freeland.springboot.persistence.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="ISC_TRANSACTION")
public class Transaction {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transaction_id")
    private Long id;

    private String sourceAccountNumber;

    private String destinationAccountNumber;

    private String destinationAccountName;
    
    @Column(nullable = true, unique = false)
	private String description;
    
    @Column(nullable = false, unique = false)
    private double amount;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date Date;

	public Transaction() {
		super();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDestinationAccountName() {
		return destinationAccountName;
	}

	public void setDestinationAccountName(String destinationAccountName) {
		this.destinationAccountName = destinationAccountName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Date == null) ? 0 : Date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((destinationAccountNumber == null) ? 0 : destinationAccountNumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sourceAccountNumber == null) ? 0 : sourceAccountNumber.hashCode());
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
		Transaction other = (Transaction) obj;
		if (Date == null) {
			if (other.Date != null)
				return false;
		} else if (!Date.equals(other.Date))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (destinationAccountNumber == null) {
			if (other.destinationAccountNumber != null)
				return false;
		} else if (!destinationAccountNumber.equals(other.destinationAccountNumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sourceAccountNumber == null) {
			if (other.sourceAccountNumber != null)
				return false;
		} else if (!sourceAccountNumber.equals(other.sourceAccountNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", sourceAccountNumber=" + sourceAccountNumber + ", destinationAccountNumber="
				+ destinationAccountNumber + ", destinationAccountName=" + destinationAccountName + ", description="
				+ description + ", amount=" + amount + ", Date=" + Date + "]";
	}
	
	
	
	

    

    
	
	
	

    
    
    


}
