package com.tushar.businessObjects;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("userBO")
@Data
@ConfigurationProperties(prefix = "user")
public class userDetails {
	
	private int id;
	private String name;
	private String[] nickNames;
	private List<String> friends;
	private Set<Long> phone;
	private Map <String, Object> idDetails;
	private Company companyDetails;
	
	
	

}
