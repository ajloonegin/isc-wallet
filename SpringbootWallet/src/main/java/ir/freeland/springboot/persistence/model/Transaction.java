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
	
	@ManyToOne
    @JoinColumn(name = "bill_id", nullable = false)
    private Bill bill; // Reference to the associated bill
	
	@Column(nullable = true, unique = false)
	private String description; // Description of the transaction
	
	@Column(nullable = false, unique = false)
	private double deposit;
	
	@Column(nullable = false, unique = false)
	private double withdraw;

	@Column(nullable = false, unique = false)
    private double balance;
    
	@Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    
    

	public Transaction() {
		super();

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Bill getBill() {
		return bill;
	}


	public void setBill(Bill bill) {
		this.bill = bill;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", bill=" + bill + ", description=" + description + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + ", balance=" + balance + ", date=" + date + "]";
	}
	
	
	

    
    
    


}
