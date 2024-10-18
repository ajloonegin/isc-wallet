package ir.freeland.springboot.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ir.freeland.springboot.persistence.model.Account;
import ir.freeland.springboot.persistence.model.Person;


public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findByAccountNumber(String accountNumber);
	
	Person findByShabaNumber(String shabaNumber);
	
	void deleteById(long id);
  

}
