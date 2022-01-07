package spl.org.payMyBuddy.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spl.org.payMyBuddy.dao.ConnectionRepository;
import spl.org.payMyBuddy.dao.TransactionRepository;
import spl.org.payMyBuddy.dao.UserRepository;
import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.sec.SecurityConfig;

@Service
public class IniAppImpl implements InitApp {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private ConnectionRepository connectionRepository;

	@Override
	public void initUser() {
		// TODO Auto-generated method stub
		SecurityConfig secu = new SecurityConfig();
		User adminUser = new User("admin", secu.passwordEncoder().encode("1234"));
		adminUser.setSolde(200.0);
		userRepository.save(adminUser);
		String[] prenoms = { "Said", "Michel", "Henry", " Martin", "Louis", "Louisa", "Julien", "Karen", "Sophie",
				"Sofiane", "Demba", "rigobert", "Henry", "Cedric", "olivier", "Eric", "Olivia", "Julia", "Kadijha" };
		String[] noms = { "Omaz", "Milo", "Escobar", "Van", "Pargeot", "Tran", "Lancelot", "Jonhson", "Donovan",
				"Makhlouf", "Diaye", "Diallo", "Dupont", "Balkanz", "Bond", "Belverdere", "Pinot", "West", "Fadi" };
		for (int i = 0; i < noms.length; i++) {

			User newUser = new User();
			String newEmail = noms[i] + "." + prenoms[i] + "@gmail.com";
			newUser.setEmail(newEmail);
			newUser.setPassword(secu.passwordEncoder().encode("1234"));
			newUser.setSolde((double) (i * 100 + 5));
			userRepository.save(newUser);

		}

	}

	@Override
	public void initConnection() {
		// TODO Auto-generated method stub
		String[] prenoms = { "Mikeal", "Mohamed", "Patricia", "Sophie", "Samba" };
		List<User> users = userRepository.findAll();

		users.forEach(user -> {
			for (int i = 0; i < prenoms.length; i++) {
				Connection conn = new Connection(prenoms[i], users.get(new Random().nextInt(users.size())), user);
				connectionRepository.save(conn);
			}
		});

	}

	@Override
	public void initTransaction() {
		// TODO Auto-generated method stub
		String[] descriptions = { "Movie ticket", "Travel Ticket", "Restaurant Bill share", "Shopping Bill Share",
				"FoodTruck Ticket" };
		double[] amounts = { 10, 145, 32, 16, 20, 52 };

		userRepository.findAll().forEach(user -> {

			user.getConnections().forEach(connection -> {

				Transaction transaction = new Transaction(descriptions[new Random().nextInt(descriptions.length)],
						amounts[new Random().nextInt(amounts.length)], user, connection);
				transaction.setDate(new Date());
				transactionRepository.save(transaction);

			});
		});

	}
}