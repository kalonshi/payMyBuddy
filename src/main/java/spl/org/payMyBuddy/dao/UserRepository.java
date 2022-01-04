package spl.org.payMyBuddy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmailAndPassword(String email, String password);

	public List<User> findAll();

	public User findByEmail(String email);

	public User findByConnectionsUserEmail(String email);

	public Connection findByEmailAndConnectionsConnectionEmail(String email, String emailConnection);

}
