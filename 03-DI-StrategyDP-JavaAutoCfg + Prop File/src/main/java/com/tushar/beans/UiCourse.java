package com.tushar.beans;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named("UI")
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
