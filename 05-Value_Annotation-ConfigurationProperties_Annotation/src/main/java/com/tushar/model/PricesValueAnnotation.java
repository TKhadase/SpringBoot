package com.tushar.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("priceValue")
public class PricesValueAnnotation {
	
	@Value("${prices.laptop}")
	private  Double Laptop;
	@Value("${prices.mouse}")
	private  Double mouse;
	@Value("${prices.keyboard}")
	private  Double keyboard;
	@Value("${prices.accesories}")
	private  Double accesories;
	
	private Double gst =100.0;
	
}
