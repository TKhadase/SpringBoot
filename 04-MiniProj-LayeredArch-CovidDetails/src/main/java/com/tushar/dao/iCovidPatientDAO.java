package com.tushar.dao;

import java.util.List;

import com.tushar.commonObjects.covidBO;

public interface iCovidPatientDAO {
	
	public List<covidBO> FetchPatientDetails(String hospitals) throws Exception;

}
