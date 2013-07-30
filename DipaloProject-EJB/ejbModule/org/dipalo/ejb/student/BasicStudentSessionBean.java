package org.dipalo.ejb.student;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.ejb.Stateless;
import java.sql.ResultSet;

import org.dipalo.ejb.adapter.EJBSessionAdapter;
import org.dipalo.model.Student;
import org.dipalo.security.encryption.SHA256Encryptor;

/**
 * Session Bean implementation class BasicStudentSessionBean
 */
@Stateless(mappedName = "BasicStudentSession")
public class BasicStudentSessionBean extends EJBSessionAdapter implements BasicStudentSession {

	@Override
	public Student getBasicStudent(int studentId)
			throws RemoteException {
		
		return null;
	}
	
	public Student registerNewStudent(Student student)
			throws RemoteException {
		return null;			
	}
	

}
