package com.tushar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tushar.commonObjects.CovidDTO;
import com.tushar.commonObjects.covidVO;
import com.tushar.service.iCovidPatientService;

@Controller("covidController")
public class MainController {
	
	@Autowired
	private iCovidPatientService covidService;
	
	public List<covidVO> getCovidPatientsByHospital(String[]  hospitals) throws Exception{
		List<covidVO> controllerVO =new ArrayList();
		
		List<CovidDTO> controllerDTO = covidService.getCovidPatient(hospitals);
		
		controllerDTO.forEach(dto->{
			covidVO vo =new covidVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setPid(String.valueOf(dto.getPid()));
			vo.setPfees(String.valueOf(dto.getPfees()));
			vo.setPnoofdays(String.valueOf(dto.getPnoofdays()));
			vo.setPhospitalname(String.valueOf(dto.getPhospitalname()));
			controllerVO.add(vo);
		});
		
		return controllerVO;
	}
	

}
