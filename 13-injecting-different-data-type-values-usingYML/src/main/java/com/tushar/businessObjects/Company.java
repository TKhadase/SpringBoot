package com.tushar.businessObjects;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("companyBO")
@Data
public class Company {
	
	private String name;
	private String loc;
	private String desg;
	
}
