package org.dipalo.ejb.student;

import java.rmi.RemoteException;

import javax.ejb.Stateless;

import org.dipalo.model.Student;

/**
 * Session Bean implementation class BasicStudentSessionBean
 */
@Stateless(mappedName = "ejb-BasicStudentSession")
public class BasicStudentSessionBean implements BasicStudentSession {

	@Override
	public Student studentLogin(String username, String password)
			throws RemoteException {
		
		return null;
	}
	
	public Student registerNewStudent(Student student)
			throws RemoteException {
		return null;			
	}
	

}
