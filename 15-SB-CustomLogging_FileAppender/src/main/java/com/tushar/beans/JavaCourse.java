package com.tushar.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
//@Primary
public class JavaCourse implements iCourseMaterial {

	private Logger log = LoggerFactory.getLogger(JavaCourse.class); 
	
	@Override
	public String CourseContent() {
		log.trace("JavaCourse.CourseContent()");
		return "Core Java, JDBC, Servlet, JSP, Spring, Hibedrnate, Spring Boot";
	}

	@Override
	public double getprice() {
		log.trace("JavaCourse.getprice()");
		return 600;
	}

}
