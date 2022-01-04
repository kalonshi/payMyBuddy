package spl.org.payMyBuddy.web;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import spl.org.payMyBuddy.entity.User;
import spl.org.payMyBuddy.service.IUser;

@Controller
public class UserController {

	@Autowired
	private IUser iUser;

	@GetMapping("/login")
	public String login() {

		return "login";

	}

	@GetMapping("/")
	public String def() {

		return "redirect:/login";
	}

	@GetMapping("/register")
	public String subscribe(Model model) {

		model.addAttribute("newUser", new User());
		return "register";
	}

	@PostMapping("/save_register")
	public String addNewUser(Model model, @Valid User user, BindingResult bindingResultUser) {
		if (bindingResultUser.hasErrors()) {

			return "register";
		}
		iUser.addUser(user.getEmail(), user.getPassword());
		return "login"; 
		/* return "home"; */
	}

	@PostMapping("/save_addMoney")
	public String updateSoldeUser(ModelMap model, Principal principal,
			@RequestParam(name = "solde", defaultValue = "0") double solde) {
		try {
			iUser.addMoney(principal.getName(), solde);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "redirect:/home";
	}

	@GetMapping("/transfert")
	public String transfert(Model model) {

		model.addAttribute("newUser", new User());
		return "transfert";
	}

	@PostMapping("/save_transfert")
	public String updateSoldeTransfertUser(ModelMap model, Principal principal,
			@RequestParam(name = "amount", defaultValue = "0") double amount) {
		try {
			iUser.transfertMoney(amount, principal.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "redirect:/home";
	}

	@GetMapping("/rechargeAccount")
	public String reFillSolde(Model model) {

		model.addAttribute("newUser", new User());
		return "updateSolde";
	}

	@PostMapping("/save_Solde")
	public String updateSolde(ModelMap model, Principal principal,
			@RequestParam(name = "amount", defaultValue = "0") double amount) {
		try {
			iUser.addMoney(principal.getName(), amount);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "redirect:/home";
	}

}
