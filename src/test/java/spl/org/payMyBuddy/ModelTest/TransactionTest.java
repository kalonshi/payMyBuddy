package spl.org.payMyBuddy.ModelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;

public class TransactionTest {
	
	@Test
	public void madeTransaction() {
		String label="toto";
		String email="test@gmail.com";
		Double solde=2000.0;
		String password="1234";
		String emailConnection="connection@gmail.com";
		String passwordConnection="1234";
		User user= new User(email, password);
		user.setSolde(solde);
		User connection= new User(emailConnection, passwordConnection);
		Connection addConnectionToUser= new Connection(label, connection, user);
	    String description = "Trip Ticket";
	    Double amount =150.0;
	    Transaction addTransaction= new Transaction(description, amount, new Date(), user, addConnectionToUser);
	    assertEquals("Trip Ticket", addTransaction.getDescription());
	    assertEquals(amount, addTransaction.getAmount());
	    assertEquals(addConnectionToUser, addTransaction.getConnection());
	    assertEquals(user, addTransaction.getUser());
		/* assertEquals(solde-amount, addTransaction.getUser().getSolde()); */
	}
}
