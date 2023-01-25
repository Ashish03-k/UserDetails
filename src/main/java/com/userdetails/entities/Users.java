package com.userdetails.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@Column(name="user_name")
	private String userName;
	
	@Column(nullable = false)
	private String email;
	
	
	@Column(name="date_of_birth", nullable = false)
	private Date dob;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Users() {
		super();
	}

	public Users(String userName, String email, Date dob) {
		super();
		this.userName = userName;
		this.email = email;
		this.dob = dob;
	}

	
    @Override
	public String toString() {
		return "Users [userName=" + userName + ", email=" + email + ", dob=" + dob + "]";
	}
    
    
}
