package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(Application.class, args);
		myFamily family= ctx.getBean("myFamily", myFamily.class);
		
		System.out.println(family);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
