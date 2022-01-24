package spl.org.payMyBuddy.ControllerTest;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTests {
	@Autowired
	private MockMvc mvc;

	@Autowired
	private WebApplicationContext context;

	@BeforeEach
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();

	}

	
	@Test
	public void shouldReturnDefaultRegisterForm() throws Exception {
		mvc.perform(get("/register")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnDefaultTransfertForm() throws Exception {
		mvc.perform(get("/transfert")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		mvc.perform(get("/login")).andDo(print()).andExpect(status().isOk());
	}

	
	/*
	 * @Test public void userLoginTest() throws Exception {
	 * 
	 * mvc.perform(formLogin("/login").user("admin").password("1234")).andExpect(
	 * authenticated()); }
	 */
	 
	 
	  @Test public void userLoginWrongPasswordTest() throws Exception {
		  
		  mvc.perform(formLogin("/login").user("admin").password("unknown")).andExpect(
				  unauthenticated()); }
}
