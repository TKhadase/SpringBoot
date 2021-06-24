package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.model.BillCalc;
import com.tushar.model.PricesConfigurationAnnotation;
import com.tushar.model.PricesValueAnnotation;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(Application.class, args);
		PricesValueAnnotation pValue  = ctx.getBean("priceValue",PricesValueAnnotation.class) ;
		System.out.println(pValue);
		System.out.println("---------------------------------------------------------------------------------");
		BillCalc bill  = ctx.getBean("billCalc",BillCalc.class) ;
		System.out.println(bill);
		System.out.println("---------------------------------------------------------------------------------");
		PricesConfigurationAnnotation pCfg = ctx.getBean("pricesConfiguration",PricesConfigurationAnnotation.class);
		System.out.println(pCfg);
		System.out.println("---------------------------------------------------------------------------------");
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
