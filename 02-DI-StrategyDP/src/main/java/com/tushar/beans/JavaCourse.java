package com.tushar.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
//@Primary
public class JavaCourse implements iCourseMaterial {

	@Override
	public String CourseContent() {
		return "Core Java, JDBC, Servlet, JSP, Spring, Hibedrnate, Spring Boot";
	}

	@Override
	public double getprice() {
		return 600;
	}

}
