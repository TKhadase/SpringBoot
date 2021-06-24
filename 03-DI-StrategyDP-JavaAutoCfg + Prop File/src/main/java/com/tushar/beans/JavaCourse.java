package com.tushar.beans;

import javax.inject.Named;

@Named("java")
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
