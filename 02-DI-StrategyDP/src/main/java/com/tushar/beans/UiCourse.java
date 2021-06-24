package com.tushar.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public class UiCourse implements iCourseMaterial {

	@Override
	public String CourseContent() {
		return "HTML, CSS, JS, ANGULAR, REACT, PHP,";
	}

	@Override
	public double getprice() {
		return 500;
	}

}
