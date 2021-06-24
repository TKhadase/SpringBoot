package com.tushar;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("myFamily")
@ConfigurationProperties(prefix="family.brothers")
public class myFamily {
	
	private String[] name;
	private String middleName;
	private String motherName;
	private String sirname;
	
	
	

}
