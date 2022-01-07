package spl.org.payMyBuddy.DTO;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import spl.org.payMyBuddy.dot.TransactionDTO;

public class TransactionDTOTest {
	@Test
	public void addTransactionDTO() {
		 String description="Billet ticket";
		 Double amount=200.0;
		 TransactionDTO transactionDTO = new TransactionDTO(description, amount);
		 assertEquals(amount, transactionDTO.getAmount());
		 assertEquals(description, transactionDTO.getDescription());
	}
	
	
}
