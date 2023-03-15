package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class usersignup {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;	
	private String email;
	private String fullname;
	private String username;
	private String password;
	
	public usersignup(int id, String email, String fullname, String username, String password) {
		super();
		this.id = id;
		this.email = email;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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
		return "usersignup [id=" + id + ", email=" + email + ", fullname=" + fullname + ", username=" + username
				+ ", password=" + password + "]";
	}

	public usersignup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
   

}
