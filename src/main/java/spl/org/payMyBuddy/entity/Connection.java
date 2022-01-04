package spl.org.payMyBuddy.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Connection implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long connection_id;
	private String label;
	@ManyToOne
	private User connection;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "connection")
	private Collection<Transaction> transactions;

	public Connection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Connection(String label) {
		super();
		this.label = label;
	}

	public Connection(String label, User connection, User user) {
		super();
		this.label = label;
		this.connection = connection;
		this.user = user;
	}

	public Connection(String label, User user) {
		super();
		this.label = label;
		this.user = user;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public User getConnection() {
		return connection;
	}

	public void setConnection(User connection) {
		this.connection = connection;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getConnection_id() {
		return connection_id;
	}

	public void setConnection_id(Long connection_id) {
		this.connection_id = connection_id;
	}

}
