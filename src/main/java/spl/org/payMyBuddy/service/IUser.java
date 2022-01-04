package spl.org.payMyBuddy.service;

import java.util.List;
import spl.org.payMyBuddy.entity.User;

public interface IUser {
	public User addUser(String email, String password);

	public User getUserByEmail(String email);

	public List<User> users();

	public User getUserbyId(Long user_id);
	
	public User addMoney(String email,double add);

	public User transfertMoney(double amount,String email);

}
