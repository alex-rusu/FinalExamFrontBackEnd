package com.sw409.FinalExamNew.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sw409.FinalExamNew.models.CovidVaccinatedResident;
import com.sw409.FinalExamNew.repositories.CovidVaccinatedResidentRepo;


@Service
public class CovidVaccinatedResidentService {
	@Autowired
	CovidVaccinatedResidentRepo CRepo;
	List<CovidVaccinatedResident> CovidVaccinatedResidentList = new ArrayList<>();
	
	//Create
	public CovidVaccinatedResident createCovidVaccinatedResident(CovidVaccinatedResident resident)
	{
		
		return CRepo.save(resident);
	}
	
	//Read
	public List<CovidVaccinatedResident> getCovidVaccinatedResident()
	{
		return (List<CovidVaccinatedResident>) CRepo.findAll();
	}
}
