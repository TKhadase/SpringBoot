package com.tushar.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tushar.Application;

@Component("student")
public class Student {
	
	private Logger log = LoggerFactory.getLogger(Student.class); 
	
	@Autowired
	@Qualifier("UI")
	private iCourseMaterial material;
	
	public void prepration(String exam) {
		log.debug("-----preparing for "+exam+" exam-----");
		log.debug("Topics: "+material.CourseContent());
		log.debug("Fees:: "+material.getprice());
		log.trace("-----Thank You !------------------");
	}
	
}
