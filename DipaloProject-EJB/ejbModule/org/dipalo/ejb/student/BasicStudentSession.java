package org.dipalo.ejb.student;
import java.rmi.RemoteException;

import javax.ejb.Remote;

import org.dipalo.model.Student;

@Remote
public interface BasicStudentSession {
	
	public Student getBasicStudent(int studentId) throws RemoteException;
	public Student registerNewStudent(Student student) throws RemoteException;
}
