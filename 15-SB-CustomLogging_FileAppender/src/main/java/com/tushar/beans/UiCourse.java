package com.tushar.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("UI")
public class UiCourse implements iCourseMaterial {

	private Logger log = LoggerFactory.getLogger(UiCourse.class); 
	
	@Override
	public String CourseContent() {
		log.trace("UiCourse.CourseContent()");
		return "HTML, CSS, JS, ANGULAR, REACT, PHP,";
	}

	@Override
	public double getprice() {
		log.trace("UiCourse.getprice()");
		return 500;
	}

}
