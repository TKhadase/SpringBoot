package com.tushar.service;

import java.util.List;
import com.tushar.commonObjects.CovidDTO;

public interface iCovidPatientService {

	public List<CovidDTO> getCovidPatient(String hospitals[]) throws Exception;
	
}
