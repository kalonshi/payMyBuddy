package spl.org.payMyBuddy.ControllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import spl.org.payMyBuddy.service.IUserImpl;
import spl.org.payMyBuddy.service.InitApp;
import spl.org.payMyBuddy.service.IniAppImpl;
import spl.org.payMyBuddy.web.UserController;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserWebControllerTest {
	@Autowired
	private MockMvc mvc;

	/*
	 * @Autowired private IniAppImpl IniAppImpl;
	 * 
	 * @MockBean private IUserImpl iUserImpl;
	 * 
	 * @MockBean private IniAppImpl IniAppImpl;
	 * 
	 * @WithMockUser(value = "admin")
	 * 
	 * @Test public void givenAuthRequestOnPrivateService_shouldSucceedWith200()
	 * throws Exception { mvc.perform(get("/home")) .andExpect(status().isOk()); }
	 */

	/*
	 * @Test public void testGetuserAccount() throws Exception { String email =
	 * "admin"; String password = "1234";
	 * mvc.perform(get("/login")).andExpect(status().isOk()); }
	 */

}
