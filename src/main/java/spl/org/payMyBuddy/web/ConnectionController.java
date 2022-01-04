package spl.org.payMyBuddy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spl.org.payMyBuddy.dao.ConnectionRepository;
import spl.org.payMyBuddy.dao.TransactionRepository;
import spl.org.payMyBuddy.dao.UserRepository;

@Controller
public class ConnectionController {
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ConnectionRepository connectionRepository;
}
