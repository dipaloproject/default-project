package org.dipalo.model;

import java.io.Serializable;
import java.sql.Date;

public class UserLoginHistory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userLoginHistoryId;
	private User user;
	private Date dateLoggedIn;
	private String deviceIp;
	
	public UserLoginHistory(){
		
		this.userLoginHistoryId = 0;
		this.user = null;
		this.dateLoggedIn = null;
		this.deviceIp = null;
	}
	
	public UserLoginHistory(int userLoginHistoryId) {
		this();
		this.userLoginHistoryId = userLoginHistoryId;
	}

	public int getUserLoginHistoryId() {
		return userLoginHistoryId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateLoggedIn() {
		return dateLoggedIn;
	}
	
	public void setDateLoggedIn(Date dateLoggedIn){
		this.dateLoggedIn = dateLoggedIn;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	
	
	
}
