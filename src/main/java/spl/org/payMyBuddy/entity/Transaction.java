package spl.org.payMyBuddy.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Transaction implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransaction;
	@Column(length = 30, nullable = false)
	private String description;
	@Column(nullable = false)
	private Double amount;
	private Double interest_rate = 0.05;
	@Column(nullable = false)
	private Date date;

	@NotNull
	@ManyToOne
	private User user;

	@NotNull
	@ManyToOne
	private Connection connection;

	public Transaction() {
		super();

	}

	public Transaction(String description, Double amount, User user, Connection connection) {
		super();
		this.description = description;
		this.amount = amount;
		this.user = user;
		this.connection = connection;
	}

	public Transaction(String description, Double amount, Date date, User user, Connection connection) {
		super();
		this.description = description;
		this.amount = amount;

		this.date = date;
		this.user = user;
		this.connection = connection;
	}

	/*
	 * public Transaction(String description, User user) { super(); this.description
	 * = description; this.user = user; }
	 */

	public String getDescription() {
		return description;
	}

	/*
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/*
	 * public Double getInterest_rate() { return interest_rate; }
	 */
	/*
	 * public Transaction(String description, Double amount, Date date) { super();
	 * this.description = description; this.amount = amount;
	 * 
	 * this.date = date; }
	 */

	public User getUser() {
		return user;
	}

	/*
	 * public void setUser(User user) { this.user = user; }
	 * 
	 * public Date getDate() { return date; }
	 */

	public void setDate(Date date) {
		this.date = date;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
