package com.tushar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application {
	
	@Bean
	@Order(11)
	public CommandLineRunner AppRunner3_lamda_cmdLine() {
		CommandLineRunner clr=(String ...cmdArgs)->{
			System.out.println("Application.AppRunner3_lamda_cmdLine()");
		};
		return clr;
	}
	
	@Bean
	@Order(2)
	public ApplicationRunner AppRunner4_lamda_AppRunner() {
		ApplicationRunner Apr=(ApplicationArguments appArgs)->{
			System.out.println("Application.AppRunner4_lamda_AppRunner()");
		};
		return Apr;
	}
	

	public static void main(String[] args) {
		//TusharArgs, --name=Tushar, --sirname=khadse
		SpringApplication.run(Application.class, args);
	}

}
