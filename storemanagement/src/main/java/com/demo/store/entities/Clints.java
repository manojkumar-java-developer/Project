package com.demo.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clints {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column (length = 30)
    private String username;
@Column (length = 10)
    private String password;
    private String email;
	    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "Clints [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	    // Getters and Setters
	}



