package org.dipalo.model;

import java.io.*;
import java.util.ArrayList;

import org.dipalo.model.enumeration.AcademicStreamType;

public class AcademicStream implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int academicStreamId;
	private AcademicStreamType type;
	private ArrayList<Subject> subjects;
	
	public AcademicStream(){
		this.academicStreamId = 0;
		this.type = AcademicStreamType.Hybrid;
		this.subjects = new ArrayList<Subject>();
	}
	
	public AcademicStream(int academicStreamId){
		this();
		this.academicStreamId = academicStreamId;
	}

	public int getAcademicStreamId() {
		return academicStreamId;
	}

	public AcademicStreamType getType() {
		return type;
	}

	public void setType(AcademicStreamType type) {
		this.type = type;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
}
