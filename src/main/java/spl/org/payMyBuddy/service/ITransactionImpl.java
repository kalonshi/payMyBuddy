package spl.org.payMyBuddy.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import spl.org.payMyBuddy.dao.TransactionRepository;
import spl.org.payMyBuddy.dao.UserRepository;
import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;

@Service
@Transactional
public class ITransactionImpl implements ITransaction {
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<Transaction> listTransactionByUser(String email, int page, int size) {

		if (!email.isEmpty()) {
			Page<Transaction> listTransactionByEmail = transactionRepository.findByUserEmail(email,
					PageRequest.of(page, size, Direction.DESC, "date"));
			return listTransactionByEmail;
		}

		return null;
	}

	@Override
	public Transaction operation(String description, double amount, String emailUser, Connection connection) {
		Transaction transaction = new Transaction();
		double rate = 0.05;
		double debit = amount * (1 + rate);
		User user = userRepository.findByEmail(emailUser);
		if (user.isFunded(debit)) {
			double updatedSolde = user.getSolde() - debit;
			user.setSolde(updatedSolde);
			userRepository.save(user);
		} else
			throw new RuntimeException("Solde insuffisant!");

		User connect = connection.getConnection();

		if (connect != null) {
			double updatedSolde = connect.getSolde() + amount;
			connect.setSolde(updatedSolde);
			userRepository.save(connect);
		} else
			throw new RuntimeException("compte introuvable!");

		if (!user.equals(null) && (!connection.equals(null))) {
			transaction = new Transaction(description, amount, new Date(), user, connection);
			transactionRepository.save(transaction);

		}

		return transaction;
	}

}
