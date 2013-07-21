package org.dipalo.ejb.student;
import java.rmi.RemoteException;

import javax.ejb.Remote;

import org.dipalo.model.Student;

@Remote
public interface BasicStudentSession {
	public Student studentLogin(String username, String password) throws RemoteException;
}
