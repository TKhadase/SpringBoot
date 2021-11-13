package com.tushar.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("dotNet")
public class DotNetCOurse implements iCourseMaterial {

	private Logger log = LoggerFactory.getLogger(DotNetCOurse.class); 
	
	@Override
	public String CourseContent() {
		log.trace("DotNetCOurse.CourseContent()");
		return "c#.net, asp.NET, vb.net";
	}

	@Override
	public double getprice() {
		log.trace("DotNetCOurse.getprice()");
		return 400;
	}

}
