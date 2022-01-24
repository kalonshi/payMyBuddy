package spl.org.payMyBuddy.ControllerTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spl.org.payMyBuddy.web.UserController;

@SpringBootTest
/*@WebMvcTest(UserController.class)*/
public class UserWebControllerTest {
	
	@Autowired
	private UserController userController;

	@Test
	void contextLoads()throws Exception {
	   assertThat(userController).isNotNull();
	   }
	
	/*@Autowired
	private MockMvc mvc;

		  @Test 
	  public void testGetuserAccount() throws Exception { 
	  mvc.perform(get("/login")).andExpect(status().isOk()); }*/
	 

}
