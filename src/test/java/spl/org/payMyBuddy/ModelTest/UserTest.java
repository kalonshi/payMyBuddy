package spl.org.payMyBuddy.ModelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import spl.org.payMyBuddy.entity.User;

public class UserTest {

	
	@Test
	public void addUserWithEmailAndPassword() {
		
		String email="test@gmail.com";
		String password="1234";
		double payment=100;
		User addUser= new User(email, password);
		assertEquals("test@gmail.com", addUser.getEmail());
		assertEquals("1234", addUser.getPassword());
		
	}
	@Test
	public void checkSoldeUser() {
		String email="test@gmail.com";
		String password="1234";
		double solde=500;
		double payment=100;
		User addUser= new User(email, password);
		addUser.setSolde(solde);
		assertEquals("test@gmail.com", addUser.getEmail());
		assertEquals("1234", addUser.getPassword());
		assertEquals(true, addUser.isFunded(payment));
		
	}
}
