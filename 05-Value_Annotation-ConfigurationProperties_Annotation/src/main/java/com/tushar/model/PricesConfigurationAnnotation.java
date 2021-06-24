package com.tushar.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="prices")
@Component("pricesConfiguration")
public class PricesConfigurationAnnotation {

	private  Double Laptop;
	private  Double mouse;
	private  Double keyboard;
	private  Double accesories;
	private Double gst =150.0;
	
}
