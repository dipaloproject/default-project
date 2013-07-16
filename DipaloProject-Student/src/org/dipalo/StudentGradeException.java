package org.dipalo;

import java.io.Serializable;

public class StudentGradeException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public final static String MESSAGE = 
			"The grade specified is invalid. Grade levels " + 
		    "must range between 1 and 12";
	
	public StudentGradeException(String message) {
		super(message);
	}
	
	public StudentGradeException(){
		super(MESSAGE);
	}

}
