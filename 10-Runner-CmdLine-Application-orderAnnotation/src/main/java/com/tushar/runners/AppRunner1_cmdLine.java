package com.tushar.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class AppRunner1_cmdLine implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------AppRunner1_cmdLine.run() start---------------");
		for(String arg:args)
			System.out.println(arg);
		System.out.println("--------------AppRunner1_cmdLine.run() End--------------");
	}

}
