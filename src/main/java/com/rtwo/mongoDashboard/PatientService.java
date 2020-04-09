package com.rtwo.mongoDashboard;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	
	@Autowired
	IPatientRepo patRepo;

	public void regPatient(PatientDto patDto) {
		
		Patient patient = new Patient();
		
		patient.setAddress(patDto.getAddress());
		patient.setDistrict(patDto.getDistrict());
		patient.setName(patDto.getName());
		patient.setState(patDto.getState());
		patient.setTaluk(patDto.getTaluk());
		
		patRepo.save(patient);
		System.out.println("Saved..."+patient);
	}
	
	public List<Patient> findAll(){
		return patRepo.findAll();
	}
	
	public Patient findPatient(String id) {
		
		Optional<Patient> patient = patRepo.findById(id);
		return patient.get();
	}

}
