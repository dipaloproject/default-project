package org.dipalo.ejb.adapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.dipalo.services.update.UpdateStatus;

public abstract class EJBSessionAdapter {
	
	private final static String DEFAULT_DATABASE = "default-db-datasource";
	
	private static Connection connection = null;
	private static DataSource dataSource = null;
	
	public static Connection getConnection(){
		try {
			if (connection == null)
				connection = getDataSource().getConnection();
		}
		catch (NamingException e) {
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static DataSource getDataSource() throws NamingException {
		InitialContext ic = new InitialContext();
		dataSource = (DataSource)ic.lookup(DEFAULT_DATABASE);
		return dataSource;
	}
	
	public static void closeConnection(Connection connection, PreparedStatement ps) {
		try {
			ps = null;
			if (connection != null && !connection.isClosed())
				connection.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static UpdateStatus resolveUpdateStatus(int result) {
		UpdateStatus status = null;
		
		switch (result) {
			case -1:
				status = UpdateStatus.Failed;
				break;
			default: 
				status = UpdateStatus.Successful;
		}
		
		return status;
	}
}
