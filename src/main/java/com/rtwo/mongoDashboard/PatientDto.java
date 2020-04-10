package com.rtwo.mongoDashboard;

import java.util.Date;

public class PatientDto {
	
	private String name;
	
	private String address;
	
	private String state;
	
	private String district;
	
	private String taluk;
	
	private String quarantineEndDate;
	
	public String getstartDate() {
		return quarantineEndDate;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public String getTaluk() {
		return taluk;
	}

	@Override
	public String toString() {
		return "PatientDto [name=" + name + ", address=" + address + ", state=" + state + ", district=" + district
				+ ", taluk=" + taluk + ",startDate" + quarantineEndDate +"]";
	}
	
}
