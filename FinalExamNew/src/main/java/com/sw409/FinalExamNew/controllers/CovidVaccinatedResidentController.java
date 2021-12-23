package com.sw409.FinalExamNew.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.FinalExamNew.models.CovidVaccinatedResident;
import com.sw409.FinalExamNew.services.CovidVaccinatedResidentService;




@RestController
@CrossOrigin("*")
public class CovidVaccinatedResidentController {
	@Autowired
	CovidVaccinatedResidentService CovidVaccinatedResidentservice = new CovidVaccinatedResidentService();
	
	//Create
	@PostMapping("/api/v1/residents")
	public CovidVaccinatedResident createResidents(@RequestBody CovidVaccinatedResident resident)
	{
		return CovidVaccinatedResidentservice.createCovidVaccinatedResident(resident);
	}
	//Read
	@GetMapping("/api/v1/residents")
	public List<CovidVaccinatedResident> getResidents()
	{
		return CovidVaccinatedResidentservice.getCovidVaccinatedResident();
	}
	
}

