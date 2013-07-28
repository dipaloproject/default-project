package org.dipalo.model;

import java.io.Serializable;
import java.sql.Date;

import org.dipalo.model.enumeration.UserRole;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userId;
	
	private String username;
	private String newPassword;
	private String confirmedNewPassword;
	private boolean isActive;
	private Date dateAdded;
	
	private UserRole role;
	
	public User(){}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmedNewPassword() {
		return confirmedNewPassword;
	}

	public void setConfirmedNewPassword(String confirmedNewPassword) {
		this.confirmedNewPassword = confirmedNewPassword;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
	
	

}

