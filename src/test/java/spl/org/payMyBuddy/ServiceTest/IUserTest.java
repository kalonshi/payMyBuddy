package spl.org.payMyBuddy.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.sec.SecurityConfig;

import spl.org.payMyBuddy.service.IUserImpl;

@SpringBootTest

@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
public class IUserTest {
	@Autowired
	private IUserImpl iUserImpl;

	@Test
	public void addUserService() {
		SecurityConfig secu = new SecurityConfig();
		String email = "test@gmail.com";
		String password = "1234";
		String encodePassword = secu.passwordEncoder().encode(password);

		User newUser = iUserImpl.addUser(email, encodePassword);
		assertEquals(email, newUser.getEmail());
		/* assertEquals(encodePassword, newUser.getPassword()); */
	}

	@Test
	public void getUserByEmailService() {
		String email = "admin";
		User getUser = iUserImpl.getUserByEmail(email);
		assertEquals(email, getUser.getEmail());
		
	}

	@Test
	public void addMoneyService() {
		String email = "admin";
		double add = 100.0;
		
		User getUser = iUserImpl.getUserByEmail(email);
		double result = add+getUser.getSolde();
		iUserImpl.addMoney(email, add);
		getUser = iUserImpl.getUserByEmail(email);
		
		assertEquals(result, getUser.getSolde());

	}

	@Test
	public void transfertMoneyService() {
		String email = "admin";
		double amount = 50.0;
		double solde = iUserImpl.getUserByEmail(email).getSolde();
		iUserImpl.transfertMoney(amount, email);
		User getUser = iUserImpl.getUserByEmail(email);
		assertEquals(solde - amount * (1 + 0.05), getUser.getSolde());
	}

	
	
	/*
	 * @Test public void getUserbyIdService() { String email = "admin"; User getUser
	 * = iUserImpl.getUserByEmail(email); Long id =getUser.getUser_id(); User
	 * userById=iUserImpl.getUserbyId(id);
	 * 
	 * assertEquals(email, userById.getEmail()); }
	 */
	 
	 
}