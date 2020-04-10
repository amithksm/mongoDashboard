package com.rtwo.mongoDashboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Patients")
public class Patient {
	
	@Id
	private String patientId;
	
	private String name;
	
	private String address;
	
	private String state;
	
	private String district;
	
	private String taluk;
	
	private Date quarantineEndDate;
	

	public Date getStartDate() {
		return quarantineEndDate;
	}

	public void setStartDate(String startDate) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.quarantineEndDate = sdf.parse(startDate);
	}

	public String getPatientId() {
		return patientId;
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

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", address=" + address + ", state=" + state
				+ ", district=" + district + ", taluk=" + taluk + ",startDate" + quarantineEndDate +"]";
	}
	
	
}
