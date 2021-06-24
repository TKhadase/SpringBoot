package com.tushar.beans;

import org.springframework.stereotype.Component;

@Component("dotNet")
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
