package com.rtwo.mongoDashboard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepo extends MongoRepository<Patient, String>{
	
	public Patient findByPatientId(String id);

}
