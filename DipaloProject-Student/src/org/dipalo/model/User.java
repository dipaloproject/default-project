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

}

