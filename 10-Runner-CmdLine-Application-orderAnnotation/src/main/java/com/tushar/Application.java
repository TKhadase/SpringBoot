 package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//TusharArg --fName=tushar --lName=khadse
		
		SpringApplication.run(Application.class, args);
	}

}
