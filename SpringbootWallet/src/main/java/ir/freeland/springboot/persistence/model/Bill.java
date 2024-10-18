//package ir.freeland.springboot.persistence.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.antlr.v4.runtime.misc.NotNull;
//
//import ir.freeland.springboot.relation.onetoone.foreignkeybased.User;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="ISC_BILL")
//public class Bill {
//	
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="bill_id")
//    private Long id;
//	
//	@Column(nullable = false)
//	@OneToOne(mappedBy = "bill")
//	private Person person;
//	
//	@Column(nullable = false)
//	@OneToOne(mappedBy = "bill")
//    private Account account;
//
//	
//    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Transaction> transactions = new ArrayList<>(); 
//
//    
//    
//
//	public Bill() {
//		super();
//		
//	}
//
//	
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public Person getPerson() {
//		return person;
//	}
//
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//
//
//	public Account getAccount() {
//		return account;
//	}
//
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//
//
//	public List<Transaction> getTransactions() {
//		return transactions;
//	}
//
//
//	public void setTransactions(List<Transaction> transactions) {
//		this.transactions = transactions;
//	}
//
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bill other = (Bill) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Bill [id=" + id + ", person=" + person + ", account=" + account + "]";
//	}
//
//    
//
//}
