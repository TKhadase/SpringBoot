package com.tushar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Autowired
	@Qualifier("UI")
	private iCourseMaterial material;
	
	public void prepration(String exam) {
		System.out.println("-----preparing for "+exam+" exam-----");
		System.out.println("Topics: "+material.CourseContent());
		System.out.println("Fees:: "+material.getprice());
		System.out.println("-----Thank You !------------------");
	}
	
}
