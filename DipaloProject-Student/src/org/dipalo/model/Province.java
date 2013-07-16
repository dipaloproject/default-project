package org.dipalo.model;

import java.io.Serializable;

import org.dipalo.util.Constants;

public class Province implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int provinceId;
	private String provinceName;
	
	public Province(){
		this.provinceId = 0;
		this.provinceName = null;
	}
	
	public Province(int provinceId){
		this.provinceId = provinceId;
		this.provinceName = null;
	}
	
	public Province(int provinceId, String provinceName) {
		this.provinceId = provinceId;
		this.provinceName = provinceName;
	}
	
	public int getProvinceId(){
		return provinceId;
	}
	
	public String getProvinceName(){
		if (provinceName == null)
			provinceName = Constants.EMPTY;
		return provinceName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Province [provinceId=");
		builder.append(provinceId);
		builder.append(", provinceName=");
		builder.append(provinceName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
