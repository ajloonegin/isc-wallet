package ir.freeland.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;

import ir.freeland.springboot.persistence.model.Account;
import ir.freeland.springboot.persistence.model.Operation;
import ir.freeland.springboot.persistence.repo.AccountRepository;

public class TransactionService {

	@Autowired
    private AccountRepository accountRepository;
	
	public void updateAccountBalance(Account account, double amount, Operation op) {
        if (op == Operation.WITHDRAW) {
            account.setAccountBalance((account.getAccountBalance() - amount));
        } else if (op == Operation.DEPOSIT) {
            account.setAccountBalance((account.getAccountBalance() + amount));
        }
        accountRepository.save(account);
    }

}
