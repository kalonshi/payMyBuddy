package spl.org.payMyBuddy.ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import spl.org.payMyBuddy.web.TransactionController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class TransactionControllerTest {
	@Autowired
	private TransactionController transactionController;
	 @Autowired
	   private MockMvc mvc;
	   
	   @Autowired
	   private WebApplicationContext context;
	   
	   
	   @BeforeEach
	   public void setup() {
	      mvc = MockMvcBuilders
	      .webAppContextSetup(context)
	      .apply(springSecurity())
	      .build();
	     
	   }
	
	@Test
	void contextLoads()throws Exception {
	   assertThat(transactionController).isNotNull();
	   }
	 
	 @Test
	   public void shouldReturnDefaultAddConnectionForm() throws Exception {
	   mvc.perform(get("/addConnection")).andExpect(status().isOk());
	   } 
	
	/*
	 * @Test public void shouldReturnPayMyBuddtTemplateUser() throws Exception {
	 * mvc.perform(get("/home")).andExpect(status().isOk()); }
	 */
	 
	 
	 
}
