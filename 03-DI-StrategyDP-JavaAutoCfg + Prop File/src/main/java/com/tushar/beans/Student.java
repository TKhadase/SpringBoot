package com.tushar.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("student")
public class Student {
	
	@Inject
	@Named("courseId")
	
	//@Resource(name="java")
	
	//@Autowired
	//@Qualifier("UI")
	private iCourseMaterial material;
	
	public void prepration(String exam) {
		System.out.println("-----preparing for "+exam+" exam-----");
		System.out.println("Topics: "+material.CourseContent());
		System.out.println("Fees:: "+material.getprice());
		System.out.println("-----Thank You !------------------");
	}
	
}
