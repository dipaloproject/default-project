package org.dipalo.model;

import java.io.Serializable;

import org.dipalo.model.enumeration.Continent;

public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int countryId;
	private String countryName;
	private Continent continent;
	
	public Country(){
		this.countryId = 0;
		this.countryName = null;
		this.continent = Continent.Other;
	}
	
	public Country(int countryId) {
		this();
		this.countryId = countryId;
	}
	
	public Country(int countryId, String countryName) {
		this();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	
	
	public int getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	public Continent getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [countryId=");
		builder.append(countryId);
		builder.append(", countryName=");
		builder.append(countryName);
		builder.append(", continent=");
		builder.append(continent);
		builder.append("]");
		return builder.toString();
	}
	
	

}
