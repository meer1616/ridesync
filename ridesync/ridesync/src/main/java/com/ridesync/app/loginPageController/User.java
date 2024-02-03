package com.ridesync.app.loginPageController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class User {
	
	@Id
	private String emailId;
	private String name;
	private String address;
	private String password;
	private String dob;
	private char role;
	private long phno;
	
	public User() {
		
	}
	public User(String emailId, String name, String address, String password, String dob, char role, long phno) {
		this.emailId = emailId;
		this.name = name;
		this.address = address;
		this.password = password;
		this.dob = dob;
		this.setRole(role);
		this.phno = phno;
	}

	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public long getPhno() {
		return phno;
	}
	
	public void setPhno(long phno) {
		this.phno = phno;
	}

	public char getRole() {
		return role;
	}

	public void setRole(char role) {
		this.role = role;
	} 
	
}
