package spl.org.payMyBuddy.entity;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.OneToMany;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class User implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;

	 @Column(length = 30, nullable = false, unique = true) 
	private String email;
	/* @Column(length = 20, nullable = false) */
	private String password;

	private Double solde;

	@OneToMany(mappedBy = "user")
	private Collection<Transaction> transactions;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)

	private Collection<Connection> connections;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Collection<Connection> getConnections() {
		return connections;
	}

	public void setConnections(Collection<Connection> connections) {
		this.connections = connections;
	}

	
	
	public Collection<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Collection<Transaction> transactions) {
		this.transactions = transactions;
	}

	public boolean isFunded(double payment) {
		boolean isFunded = false;
		if ((this.solde - payment) >= 0) {
			isFunded = true;
		}
		;
		return isFunded;
	}

	
	
}
