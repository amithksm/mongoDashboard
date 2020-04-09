package com.rtwo.mongoDashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.query.Query;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/patient")
@Api(value = "Patient Registration", tags = "patient registration")
public class Controller {
	
	@Autowired
	PatientService patService;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@PostMapping("/register")
	public void regPatient(@RequestBody PatientDto patDto) {
		
		System.out.println("Rest Input ..."+patDto);
		patService.regPatient(patDto);
	}
	
	@GetMapping("/get")
	public Patient getPatient(@RequestParam String patiendId) {
		return patService.findPatient(patiendId);
	}
	
	@GetMapping("/getAll")
	public List<Patient> getAll() {
		return patService.findAll();
	}
	
	@GetMapping("/getTotalCount")
	public void getTotal() {
		long result = 0;
		Query query = new Query();
		query.addCriteria(Criteria.where("district").in("davangere"));
		
		result = mongoTemplate.count(query, Patient.class);
		
		System.out.println("Total count = " +result);
	}

}
