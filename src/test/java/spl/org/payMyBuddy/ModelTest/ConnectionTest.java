package spl.org.payMyBuddy.ModelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.User;

public class ConnectionTest {

	@Test
	public void addConectionWithLabel() {
	
		String label="toto";
		String email="test@gmail.com";
		String password="1234";
		String emailConnection="connection@gmail.com";
		String passwordConnection="1234";
		User user= new User(email, password);
		User connection= new User(emailConnection, passwordConnection);
		Connection addConnectionToUser= new Connection(label, connection, user);
		assertEquals("toto", addConnectionToUser.getLabel());
		assertEquals(connection, addConnectionToUser.getConnection());
		assertEquals(user, addConnectionToUser.getUser());
	}
}
