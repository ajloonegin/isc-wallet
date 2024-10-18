package ir.freeland.springboot.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import ir.freeland.springboot.persistence.model.Transaction;
import ir.freeland.springboot.query.model.User;
import ir.freeland.springboot.query.repository.UserRepositoryCustom;

public class TransactionRepository extends JpaRepository<Transaction, Integer>, UserRepositoryCustom , QueryByExampleExecutor<User>  {

}
