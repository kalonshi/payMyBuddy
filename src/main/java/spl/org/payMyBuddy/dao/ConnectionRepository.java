package spl.org.payMyBuddy.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.User;

public interface ConnectionRepository extends JpaRepository<Connection, Long> {

	public Set<Connection> findByUserEmail(String email);
	
	public Set<User> findByConnection(String email);

	public User findByConnectionEmail(String email);
	
	public Connection findByUserEmailAndConnectionEmail(String emailUser, String emailConnection);

	public Connection findByConnectionEmailAndUserEmail(String emailConnection,String emailUser );
}
