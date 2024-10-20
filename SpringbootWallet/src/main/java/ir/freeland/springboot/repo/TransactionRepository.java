package ir.freeland.springboot.repo;


import java.time.LocalDate;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ir.freeland.springboot.model.constant.Operation;
import ir.freeland.springboot.model.entity.Transaction;



@Service
@Repository
public interface TransactionRepository  extends CrudRepository <Transaction, Long>{
	List<Transaction> findByAccountNumber(String accountNumber);
	List<Transaction> findByAccountNumberAndDateAndOperation(String accountNumber,LocalDate date, Operation operation);

	
}
