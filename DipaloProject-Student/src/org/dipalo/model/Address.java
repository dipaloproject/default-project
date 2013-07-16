package org.dipalo.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int addressId;
	
	private ArrayList<String> addressLines;
	private int postalCode;
	private Province province;
	private Country country;
	
	public Address(){
		this.addressId = 0;
		this.postalCode = 0;
		this.addressLines = new ArrayList<>();
	}
	
	public Address(int addressId){
		this();
		this.addressId = addressId;
	}

	public int getAddressId() {
		return addressId;
	}

	public ArrayList<String> getAddressLines() {
		return addressLines;
	}

	public void setAddressLines(ArrayList<String> addressLines) {
		this.addressLines = addressLines;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addressId=");
		builder.append(addressId);
		builder.append(", addressLines=");
		builder.append(addressLines);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", province=");
		builder.append(province);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
	
}
