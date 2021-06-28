package com.tushar.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class AppRunner2_cmdLine implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------AppRunner2_cmdLine.run()--------------");
	}

}
