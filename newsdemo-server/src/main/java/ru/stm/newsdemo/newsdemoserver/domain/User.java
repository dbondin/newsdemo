package ru.stm.newsdemo.newsdemoserver.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "ND_USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ND_USERS_ID_SEQ")
	@SequenceGenerator(sequenceName = "ND_USERS_ID_SEQ", allocationSize = 1, name = "ND_USERS_ID_SEQ")
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

	protected User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("ID[ID=%d, USERNAME='%s', PASSWORD='%s']", id, username, password);
	}

}
