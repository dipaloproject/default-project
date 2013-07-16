package org.dipalo.model;

import java.io.Serializable;

public class Subject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int subjectId;
	private String subjectName;
	private String subjectCode;
	private String subjectDescription;
	private boolean isCompulsory;
	private double passMark;
	
	public Subject(){
		this.subjectCode = null;
		this.subjectDescription = null;
		this.subjectId = 0;
		this.subjectName = null;
		this.isCompulsory = false;
		this.passMark = 35.0;
	}
	
	public Subject(int subjectId) {
		this();
		this.subjectId = subjectId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectDescription() {
		return subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}

	public boolean isCompulsory() {
		return isCompulsory;
	}

	public void setCompulsory(boolean isCompulsory) {
		this.isCompulsory = isCompulsory;
	}

	public double getPassMark() {
		return passMark;
	}

	public void setPassMark(double passMark) {
		this.passMark = passMark;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName="
				+ subjectName + ", subjectCode=" + subjectCode
				+ ", subjectDescription=" + subjectDescription
				+ ", isCompulsory=" + isCompulsory + ", passMark=" + passMark
				+ "]";
	}
	
	
}
