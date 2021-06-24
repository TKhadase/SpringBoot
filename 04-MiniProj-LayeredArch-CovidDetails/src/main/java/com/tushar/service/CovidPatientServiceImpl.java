package com.tushar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tushar.commonObjects.CovidDTO;
import com.tushar.commonObjects.covidBO;
import com.tushar.dao.iCovidPatientDAO;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service("covidService")
public class CovidPatientServiceImpl implements iCovidPatientService {
	
	@Autowired
	private iCovidPatientDAO dao;

	@Override
	public List<CovidDTO> getCovidPatient(String[] hospitals) throws Exception {
		
		StringBuilder strBuid = new StringBuilder("(");
		for(int i=0;i<hospitals.length;++i) {
			if(i==hospitals.length-1) {
				strBuid.append("'"+hospitals[i]+"')");
			}else {
				strBuid.append("'"+hospitals[i]+"',");
			}
		}
		String hospitalsCondition =strBuid.toString();
		List<covidBO>  serviceListBO=  dao.FetchPatientDetails(hospitalsCondition);
		
		List<CovidDTO> serviceListDto  = new ArrayList();
		
		serviceListBO.forEach(bo->{
			CovidDTO dto =new CovidDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setPid(serviceListDto.size()+1);
			serviceListDto.add(dto);
		});
		
		return serviceListDto;
	}

}
