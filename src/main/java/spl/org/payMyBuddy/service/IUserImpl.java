package spl.org.payMyBuddy.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spl.org.payMyBuddy.dao.UserRepository;

import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.sec.SecurityConfig;

@Service
@Transactional
public class IUserImpl implements IUser {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(String email, String password) {

		SecurityConfig secu = new SecurityConfig();
		User addUser = new User();
		if (!email.isEmpty() && !password.isEmpty()) {
			String encodePassword = secu.passwordEncoder().encode(password);
			addUser = new User(email, encodePassword);
			addUser.setSolde(100.0);
			userRepository.save(addUser);

		}
		return addUser;
	}
 
	@Override
	public User getUserByEmail(String email) {
		User getUser = new User();
		if (!email.isEmpty() && !userRepository.findByEmail(email).equals(null)) {
			getUser = userRepository.findByEmail(email);

		}
		return getUser;
	}

	@Override
	public List<User> users() {

		List<User> usersList = new ArrayList<User>();
		usersList = userRepository.findAll();
		return usersList;
	}

	@Override
	public User getUserbyId(Long user_id) {

		User user = userRepository.getById(user_id);
		return user;
	}

	@Override
	public User addMoney(String email, double add) {
		User user = getUserByEmail(email);
		double newSolde = user.getSolde() + add;
		user.setSolde(newSolde);
		userRepository.save(user);
		return user;
	}

	@Override
	public User transfertMoney(double amount, String email) {
		User user = getUserByEmail(email);
		double interest_rate = 0.05;
		double newSolde = user.getSolde() - amount * (1 + interest_rate);
		user.setSolde(newSolde);
		userRepository.save(user);
		return user;
	}

}
