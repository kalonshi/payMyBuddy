package spl.org.payMyBuddy.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import spl.org.payMyBuddy.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	public Page<Transaction> findByUserEmail(String emailUser, Pageable pageable);

}
