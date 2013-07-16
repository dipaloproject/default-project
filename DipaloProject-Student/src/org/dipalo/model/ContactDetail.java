package org.dipalo.model;

import java.io.Serializable;

public class ContactDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int contactDetailId;
	
	private String homeTelephoneNumber;
	private String workTelephoneNumber;
	private String cellphoneNumber;
	private String faxNumber;
	private String primaryEmailAddress;
	private String secondaryEmailAddress;
	private String webpageAddress;
	
	public ContactDetail(){
		this.contactDetailId = 0;
		this.homeTelephoneNumber = null;
		this.workTelephoneNumber = null;
		this.cellphoneNumber = null;
		this.primaryEmailAddress = null;
		this.secondaryEmailAddress = null;
		this.faxNumber = null;
		this.webpageAddress = null;
	}
	
	public ContactDetail(int contactDetailId){
		this();
		this.contactDetailId = contactDetailId;
	}

	public int getContactDetailId() {
		return contactDetailId;
	}

	public String getHomeTelephoneNumber() {
		return homeTelephoneNumber;
	}

	public void setHomeTelephoneNumber(String homeTelephoneNumber) {
		this.homeTelephoneNumber = homeTelephoneNumber;
	}

	public String getWorkTelephoneNumber() {
		return workTelephoneNumber;
	}

	public void setWorkTelephoneNumber(String workTelephoneNumber) {
		this.workTelephoneNumber = workTelephoneNumber;
	}

	public String getCellphoneNumber() {
		return cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getPrimaryEmailAddress() {
		return primaryEmailAddress;
	}

	public void setPrimaryEmailAddress(String primaryEmailAddress) {
		this.primaryEmailAddress = primaryEmailAddress;
	}

	public String getSecondaryEmailAddress() {
		return secondaryEmailAddress;
	}

	public void setSecondaryEmailAddress(String secondaryEmailAddress) {
		this.secondaryEmailAddress = secondaryEmailAddress;
	}

	public String getWebpageAddress() {
		return webpageAddress;
	}

	public void setWebpageAddress(String webpageAddress) {
		this.webpageAddress = webpageAddress;
	}

	
}
