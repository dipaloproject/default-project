package org.dipalo.model;

import java.io.Serializable;

import org.dipalo.model.enumeration.SchoolType;

/**
 * Represents information about the school
 * 
 * @author Tsepo Maleka 2013.07.15
 *
 */
public class School implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int schoolId;
	
	private String schoolName;
	private Address physicalAddress;
	private Address postalAddress;
	
	private ContactDetail contacts;
	
	private SchoolType schoolType;
	
	public School(){
		this.schoolName = null;
		this.physicalAddress = null;
		this.postalAddress = null;
	}
	
	public School(int schoolId){
		this();
		this.schoolId = schoolId;
		
	}

	public int getSchoolId() {
		return schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Address getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(Address physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public Address getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	public void setContactDetail(ContactDetail contacts){
		this.contacts = contacts;
	}
	
	public ContactDetail getContactDetail(){
		return contacts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("School [schoolId=");
		builder.append(schoolId);
		builder.append(", schoolName=");
		builder.append(schoolName);
		builder.append(", physicalAddress=");
		builder.append(physicalAddress);
		builder.append(", postalAddress=");
		builder.append(postalAddress);
		builder.append("]");
		return builder.toString();
	}
	
	
}
