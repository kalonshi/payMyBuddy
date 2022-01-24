package spl.org.payMyBuddy.web;

import java.security.Principal;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import spl.org.payMyBuddy.dot.TransactionDTO;
import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.Transaction;
import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.service.IConnection;
import spl.org.payMyBuddy.service.ITransaction;
import spl.org.payMyBuddy.service.IUser;

@Controller
public class TransactionController {

	@Autowired
	private ITransaction itransaction;
	@Autowired
	private IUser iUser;
	@Autowired
	private IConnection iConnection;

	@GetMapping("/home")
	public String index(ModelMap model, Principal principal,
			@RequestParam(name = "page", defaultValue = "0") int page) {

		String email = principal.getName();
		try {

			User user = iUser.getUserByEmail(email);

			List<Connection> connections = (List<Connection>) user.getConnections();
			model.addAttribute("connectionsByUser", connections);
			model.addAttribute("transactionDTO", new TransactionDTO());
			model.addAttribute("solde", user.getSolde());
			Page<Transaction> pageListe = itransaction.listTransactionByUser(email, page, 3);
			model.addAttribute("transactionsByUser", pageListe.getContent());
			model.addAttribute("pages", new int[pageListe.getTotalPages()]);
			model.addAttribute("currentPage", page);
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("exception", e);
		}

		return "home";

	}

	@PostMapping("/saveConnection")
	public String connection2(Model model, Principal principal, String label, Long user_id) {
		String email = principal.getName();
		User userLink = iUser.getUserByEmail(email);
		User contact = iUser.getUserbyId(user_id);

		iConnection.addConnection(label, contact, userLink);
		return "redirect:/home";

	}

	@GetMapping("/addConnection")
	public String connection(Model model) {

		List<User> users = iUser.users();

		model.addAttribute("usersForConnections", users);

		model.addAttribute("connection", new Connection());
		return "addConnection";
	}

	@PostMapping("/addTransaction")
	public String transaction(Model model, Principal principal, @Valid TransactionDTO transactionDTO,
			BindingResult bindingResultTransactionDTO, Long connection_id) {
		String email = principal.getName();

		if (bindingResultTransactionDTO.hasErrors()) {

			return "home";
		}
		try {

			Connection selectedConnection = iConnection.getConnectionById(connection_id);
			String description = transactionDTO.getDescription();
			double amount = transactionDTO.getAmount();
			itransaction.operation(description, amount, email, selectedConnection);

		} catch (Exception e) {
			model.addAttribute("exception", e);
		}

		return "redirect:/home";
	}

}
