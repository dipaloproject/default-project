package org.dipalo.ejb.user;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.ejb.Stateless;
import org.dipalo.ejb.adapter.EJBSessionAdapter;
import org.dipalo.model.Student;
import org.dipalo.model.User;
import org.dipalo.model.UserLoginHistory;
import org.dipalo.model.enumeration.UserRole;
import org.dipalo.security.encryption.SHA256Encryptor;
import org.dipalo.services.update.UpdateStatus;

/**
 * Session Bean implementation class UserSessionBean
 */
@Stateless(mappedName = "UserSession")
public class UserSessionBean extends EJBSessionAdapter implements UserSession {

	@Override
	public User authenticateUser(String username, String password)
			throws RemoteException {
		
		User user = null;
		UserRole role = null;
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder();
			query.append("SELECT user_id, user_name, user_password, ")
			.append("user_active, date_added, user_role_id, user_role_desc ")
			.append("FROM general_user ")
			.append("JOIN user_role USING (user_role_id) ")
			.append("WHERE user_name = ? AND user_password = ? ")
			.append("AND user_active = TRUE");
			
			connection = getConnection();
			ps = connection.prepareStatement(query.toString());
			ps.setString(1, username);
			ps.setString(2, SHA256Encryptor.generateSHA256HashCode(password));
			
			ResultSet rs = ps.executeQuery();
			
			if (rs != null && rs.next()) {
				
				user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setUsername(rs.getString("user_name"));
				user.setActive(rs.getBoolean("user_active"));
				user.setDateAdded(rs.getDate("date_added"));
				
				role = resolveUserRole(rs.getInt("user_role_id"));
				user.setRole(role);
			}
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RemoteException(ex.getMessage());
		}
		
		finally {
			closeConnection(connection, ps);
		}
		
		return user;
	}

	/**
	 * Resolves the user role privileges
	 * 
	 * @param userRoleId - the user role ID
	 * @return
	 */
    private UserRole resolveUserRole(int userRoleId) {
    	
    	UserRole role = null;
    	switch (userRoleId) {
    		case 1: 
    			role = UserRole.SystemAdministrator;
    			break;
    		case 2: 
    			role = UserRole.SiteManager;
    			break;
    		case 3: 
    			role = UserRole.Student;
    			break;
    		case 4: 
    			role = UserRole.GuestUser;
    			break;
    		default :
    			role = UserRole.GuestUser;
    			
    	}
    	return role;
    }

	@Override
	public ArrayList<UserLoginHistory> getUserLoginHistory(String username)
			throws RemoteException {
		
		ArrayList<UserLoginHistory> loginHistory = null;
		UserLoginHistory history = null;
		User user = null;
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder();
			query.append("SELECT user_login_history_id, user_login_history.user_id, user_name, ")
			.append("user.user_role_id, date_logged_in, deivce_ip ")
			.append("FROM user_login_history ")
			.append("JOIN general_user USING (user_id) ")
			.append("JOIN user_role USING (user_role_id) ")
			.append("WHERE general_user.user_name = ? AND ")
			.append("user_active = TRUE ")
			.append("ORDER BY date_logged_in DESC");
			
			connection = getConnection();
			ps = connection.prepareStatement(query.toString());
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			if (rs != null) {
				
				loginHistory = new ArrayList<UserLoginHistory>();
				
				while (rs.next()) {
					
					history = new UserLoginHistory(rs.getInt("user_login_history_id"));
					history.setDeviceIp(rs.getString("device_ip"));
					history.setDateLoggedIn(rs.getDate("date_logged_in"));
					
					user = new User();
					user.setUserId(rs.getInt("user_id"));
					user.setUsername(rs.getString("user_name"));
					user.setRole(resolveUserRole(rs.getInt("user_role_id")));
					user.setActive(true);
					
					history.setUser(user);
					
					loginHistory.add(history);
				}
			}
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RemoteException(ex.getMessage());
		}
		finally {
			closeConnection(connection, ps);
		}
		return loginHistory;
	}

	@Override
	public ArrayList<UserLoginHistory> getUserLoginhistory(int userId)
			throws RemoteException {
		ArrayList<UserLoginHistory> loginHistory = null;
		UserLoginHistory history = null;
		User user = null;
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder();
			query.append("SELECT user_login_history_id, user_login_history.user_id, user_name, ")
			.append("user.user_role_id, date_logged_in, deivce_ip ")
			.append("FROM user_login_history ")
			.append("JOIN general_user USING (user_id) ")
			.append("JOIN user_role USING (user_role_id) ")
			.append("WHERE general_user.user_id = ? AND ")
			.append("user_active = TRUE ")
			.append("ORDER BY date_logged_in DESC");
			
			connection = getConnection();
			ps = connection.prepareStatement(query.toString());
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			
			if (rs != null) {
				
				loginHistory = new ArrayList<UserLoginHistory>();
				
				while (rs.next()) {
					
					history = new UserLoginHistory(rs.getInt("user_login_history_id"));
					history.setDeviceIp(rs.getString("device_ip"));
					history.setDateLoggedIn(rs.getDate("date_logged_in"));
					
					user = new User();
					user.setUserId(rs.getInt("user_id"));
					user.setUsername(rs.getString("user_name"));
					user.setRole(resolveUserRole(rs.getInt("user_role_id")));
					user.setActive(true);
					
					history.setUser(user);
					
					loginHistory.add(history);
				}
			}
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RemoteException(ex.getMessage());
		}
		finally {
			closeConnection(connection, ps);
		}
		return loginHistory;
	}

	@Override
	public UpdateStatus updateUserActive(String username, boolean isActive)
			throws RemoteException {
		
		UpdateStatus status = UpdateStatus.Unknown;
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			
			StringBuilder update = new StringBuilder();
			update.append("UPDATE user SET user_active = ? ")
			.append("WHERE user_name = ? ");
			
			connection = getConnection();
			connection.setAutoCommit(false);
			
			ps = connection.prepareStatement(update.toString());
			ps.setBoolean(1, isActive);
			ps.setString(2, username);
			
			status = resolveUpdateStatus(ps.executeUpdate());
			
			if (status == UpdateStatus.Failed)
				connection.rollback();
			else 
				connection.commit();
			
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RemoteException(ex.getMessage());
		}
		finally {
			closeConnection(connection, ps);
		}
		
		return status;
		
	}

}
