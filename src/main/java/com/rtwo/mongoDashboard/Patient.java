package com.rtwo.mongoDashboard;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "P@tients")
public class Patient {
	
	@Id
	private String patientId;
	
	private String name;
	
	private String address;
	
	private String state;
	
	private String district;
	
	private String taluk;

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
				+ ", district=" + district + ", taluk=" + taluk + "]";
	}
	
	
}
