package spl.org.payMyBuddy.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.service.IConnectionImpl;
import spl.org.payMyBuddy.service.ITransactionImpl;
import spl.org.payMyBuddy.service.IUserImpl;
@SpringBootTest

@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
public class ITransactionTest {
	@Autowired
	private ITransactionImpl iTransactionImpl;
	
	  @Autowired private IUserImpl iUserImpl;
	 
	  @Autowired private  IConnectionImpl iConnectionImpl;
	
	@Test
	public void listTransactionByUserAdminService() {
		
		  String email="admin"; int page=0; int size=3;
		  Page<Transaction>listTransactionByUserService=iTransactionImpl.listTransactionByUser(email,
		  page,size); 
		  int nb_page=listTransactionByUserService.getTotalPages();
		  assertEquals(2,nb_page);
		 
		
	}
	
	@Test
	public void operationService() {
		String description="bar ticket";
		double amount=100.0;
		String emailUser="admin";
		User user = iUserImpl.getUserByEmail(emailUser);
		String emailConnection="connection@gmail.com";
		String password="1234";
		User connection=iUserImpl.addUser(emailConnection, password);
		String label="toto";
		Connection connectiontest=iConnectionImpl.addConnection(label, connection, user);
		Transaction transactionTest=iTransactionImpl.operation(description, amount, emailUser, connectiontest);
	assertEquals(amount,transactionTest.getAmount());
		assertEquals(description,transactionTest.getDescription());
		  assertEquals(emailUser,transactionTest.getUser().getEmail());
		 
	}
	
	
	
}
