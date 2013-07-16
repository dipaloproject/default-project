package org.dipalo.model;

import java.io.Serializable;
import java.util.Date;

import org.dipalo.model.enumeration.ExaminationBoard;
import org.dipalo.model.enumeration.Gender;
import org.dipalo.model.enumeration.Race;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int studentId;
	
	private String firstName;
	private String lastName;
	private String idNumber;
	private Date dateOfBirth;
	
	private Gender gender;
	private Race race;
	
	private int gradeLevel;
	private School schoolAttending;
	private AcademicStream selectedStream;
	private ExaminationBoard examBoard;
	
	private ContactDetail contacts;
	
	private User user;
	
	/**
	 * Default constructor
	 */
	public Student(){
		
		this.studentId = 0;
		this.firstName = null;
		this.lastName = null;
		this.idNumber = null;
		this.dateOfBirth = null;
		this.gender = null;
		this.race = null;
		this.gradeLevel = 1;
		this.schoolAttending = null;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public School getSchoolAttending() {
		return schoolAttending;
	}

	public void setSchoolAttending(School schoolAttending) {
		this.schoolAttending = schoolAttending;
	}

	public AcademicStream getSelectedStream() {
		return selectedStream;
	}

	public void setSelectedStream(AcademicStream selectedStream) {
		this.selectedStream = selectedStream;
	}

	public ExaminationBoard getExamBoard() {
		return examBoard;
	}

	public void setExamBoard(ExaminationBoard examBoard) {
		this.examBoard = examBoard;
	}

	public ContactDetail getContacts() {
		return contacts;
	}

	public void setContacts(ContactDetail contacts) {
		this.contacts = contacts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
