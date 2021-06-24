package com.tushar.beans;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named("dotNet")
public class DotNetCOurse implements iCourseMaterial {

	@Override
	public String CourseContent() {
		return "c#.net, asp.NET, vb.net";
	}

	@Override
	public double getprice() {
		return 400;
	}

}
