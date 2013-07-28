package org.dipalo.ejb.user;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.ejb.Local;

import org.dipalo.model.User;
import org.dipalo.model.UserLoginHistory;
import org.dipalo.services.update.UpdateStatus;

@Local
public interface UserSession {
	
	public User authenticateUser(String username, String password) throws RemoteException;
	public UpdateStatus updateUserActive(String username, boolean isActive) throws RemoteException;
	
	public ArrayList<UserLoginHistory> getUserLoginHistory(String username) throws RemoteException;
	public ArrayList<UserLoginHistory> getUserLoginhistory(int userId) throws RemoteException;
}
