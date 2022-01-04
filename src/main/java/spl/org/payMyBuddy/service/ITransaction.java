package spl.org.payMyBuddy.service;

import java.util.Date;

import org.springframework.data.domain.Page;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;

public interface ITransaction {

	public Page<Transaction> listTransactionByUser(String email, int page, int size);

	public Transaction operation(String description, double amount, String emailUser, Connection connection);
	}
