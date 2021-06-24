package com.tushar.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("billCalc")
public class BillCalc {

	@Value("#{priceValue.accesories + priceValue.keyboard + priceValue.mouse + priceValue.laptop + priceValue.gst}")
	private  Double TotalValue;
	
	@Value("#{pricesConfiguration.accesories + pricesConfiguration.keyboard + pricesConfiguration.mouse + pricesConfiguration.laptop +pricesConfiguration.gst}")
	private  Double TotalCfg;
	
}
